class Calculator {
    private double a;
    private double b;

    public Calculator(double liczba1, double liczba2) {
        a = liczba1;
        b = liczba2;
    }

    public Calculator() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    double calc() {
        if (a > b) {
            return a + b;
        } else if (a < b) {
            return a * b;
        } else return a * a;
    }
}