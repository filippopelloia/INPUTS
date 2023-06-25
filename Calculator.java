import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Inserisci un numero: ");
        int first = scanner.nextInt();

        System.out.printf("Inserisci il secondo numero: ");
        int second = scanner.nextInt();

        scanner.nextLine();

        System.out.printf("Che operazione vuoi fare?");
        String operation = scanner.nextLine();

        if (operation.equals("somma")){
            System.out.printf("%d + %d = %d", first, second, first + second);
        } else if (operation.equals("moltiplicazione")){
            System.out.printf("%d * %d = %d", first, second, first * second);
        } else if (operation.equals("sottrazione")){
            System.out.printf("%d - %d = %d", first, second, first - second);
        } else {
            System.out.printf("%d / %d = %d", first, second, first / second);
        }
    }
}
