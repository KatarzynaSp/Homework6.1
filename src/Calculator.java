class Calculator {
    double calc(double a, double b) {
        if (a > b) {
            return a + b;
        } else if (a < b) {
            return a * b;
        } else return a * a;
    }
}