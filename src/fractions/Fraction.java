package fractions;

public class Fraction {
    private int numerator = 0;
    private int denominator = 1;

    Fraction(int n, int d) {
        numerator = n;
        denominator = d;
        simplify();
    }

    Fraction(Fraction n, Fraction d) {
        numerator = n.numerator * d.denominator;
        denominator = d.numerator * n.denominator;
        simplify();
    }

    public void add(Fraction f) {
        int lcm = leastCommonMultiple(this.denominator, f.denominator);
        numerator = numerator * lcm / denominator + f.numerator * lcm / f.denominator;
        simplify();
    }

    public void sub(Fraction f) {
        int lcm = leastCommonMultiple(this.denominator, f.denominator);
        numerator = numerator * lcm / denominator - f.numerator * lcm / f.denominator;
        simplify();
    }

    public Fraction mul(Fraction f) {
        numerator *= f.numerator;
        denominator *= f.denominator;
        simplify();
        return this;
    }

    public Fraction div(Fraction f) {
        numerator *= f.denominator;
        denominator *= f.numerator;
        simplify();
        return this;
    }

    public void opposite() {
        numerator *= -1;
    }

    public Boolean compare(Fraction f, String operator) {
        switch (operator) {
            case "<":
                return numerator/denominator < f.numerator/f.denominator;
            case ">":
                return numerator/denominator > f.numerator/f.denominator;
            case "=":
                return numerator == f.numerator && denominator == f.denominator;
            case "!=":
                return numerator/denominator != f.numerator/f.denominator;
            case "<=":
                return numerator/denominator <= f.numerator/f.denominator;
            case ">=":
                return numerator/denominator >= f.numerator/f.denominator;
        }
        return null;
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int leastCommonMultiple(int a, int b) {
        if (a < 0)
            a = -a;
        if (b < 0)
            b = -b;

        return a * (b / greatestCommonDivisor(a, b));
    }

    private void simplify() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
