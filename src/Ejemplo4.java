import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        int number1;
        int number2;

        System.out.println("Introduce el primer numero");
        Scanner introducir1;
        introducir1 = new Scanner(System.in);
        number1 = introducir1.nextInt();

        System.out.println("Introduce el segundo numero");
        Scanner introducir2;
        introducir2 = new Scanner(System.in);
        number2 = introducir2.nextInt();

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
