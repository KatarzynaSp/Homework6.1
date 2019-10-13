import java.util.Scanner;

class CalcTest {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Podaj liczbę 1:");
        double liczba1 = user.nextDouble();
        user.nextLine();
        System.out.println("Podaj liczbę 2:");
        double liczba2 = user.nextDouble();
        user.nextLine();
        user.close();

        Calculator calculator = new Calculator();
        double result = calculator.calc(liczba1, liczba2);
        System.out.println(result);
    }
}