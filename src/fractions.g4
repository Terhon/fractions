grammar fractions;

program: (operation|func_decl|void_func_decl)*;
operation: s_decl | u_decl | attribution | write | read | func_call | condition | loop;

s_decl: S_TYPE'[' ID ':' (STRING | ID) ']' ;

u_decl: U_TYPE'[' ID ':' expr ']';

//arithmetic expressions
expr: addExpr('|'addExpr)*;
ADD_OPER:'+'|'-';
addExpr: multExpr (ADD_OPER multExpr)*;
MULT_OPER:'*'|'/';
multExpr: atomExpr (MULT_OPER atomExpr)*;
atomExpr: ('-')? (NUMBER | ID | '(' expr ')' | func_call);

attribution: '['ID':'(expr|STRING)']';

//function declarations
func_arg:(S_TYPE|U_TYPE)'-'ID;

func_decl: '<'(S_TYPE|U_TYPE)':'ID':'(func_arg('.'func_arg)*)?'>'func_body'<>';
func_body:(operation|val_return)*(val_return)+(operation|val_return)*;

void_func_decl:'<:'ID':'(func_arg('.'func_arg)*)?'>'void_func_body'<>';
void_func_body:(operation|VOID_RETURN)*;

//returning values
val_return:'#'(expr|STRING)'#';
VOID_RETURN:'##';

//function call
func_call:'<'ID':'(variable('.'variable)*)?'>';
variable: (expr|STRING);

//if...else expression
condition:'/'logExpr'/'condition_body('/-/'condition_body)?'\\\\';
condition_body:(operation)+;

//logical expressions
LOG_OPER:('^'|'v');
logExpr: compExpr(LOG_OPER compExpr)*;
COMP_OPER:('<'|'>'|'='|'!='|'<='|'>=');
compExpr:('!')? expr COMP_OPER expr | '(' logExpr ')';

//loop
loop:'@'logExpr'@'loop_body'@';
loop_body:(operation)+;

write:'<<'(expr|STRING)'>>';

read:'>>'(S_TYPE|U_TYPE)':'ID'<<';

U_TYPE: 'u';
S_TYPE: 's';
NUMBER: [1-9][0-9]*;
WS: [ \t\r\n]+ -> skip ;
ID: ([a-z]|[A-Z])+;
STRING: '"' ~('\r' | '\n' | '"')* '"' ;
