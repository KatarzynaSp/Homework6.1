import java.util.Scanner;

class CalcTest {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Podaj liczbę 1:");
        double liczba1 = user.nextDouble();
        System.out.println("Podaj liczbę 2:");
        double liczba2 = user.nextDouble();
        user.nextLine();

        Calculator calculator = new Calculator(liczba1, liczba2);
        double result = calculator.calc();
        System.out.println(result);
    }
}