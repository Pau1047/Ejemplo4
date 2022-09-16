import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        number1 = introducir.nextInt();
        System.out.println("Introduce el segundo numero");
        number2 = introducir.nextInt();

        int summing = number1 + number2;
        int substracting = number1 - number2;
        int multiplying = number1 * number2;
        int dividing = number1/number2;

        System.out.println("El resultado sumando tus dos numeros es " + summing);
        System.out.println("El resultado restando tus dos numeros es " + substracting);
        System.out.println("El resultado multiplicando tus dos numeros es " + multiplying);
        System.out.println("El resultado dividiendo tus dos numeros es " + dividing);
    }
}
