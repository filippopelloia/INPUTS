import java.util.Scanner;

class Input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //DOMANDA
        System.out.print("What's your name?");

        //SALVA LA RISPOSTA
        String name = scanner.nextLine();

        //MOSTRA RISPOSTA + NUOVA DOMANDA
        System.out.printf("Il tuo nome è %s, How old are you?", name);

        //SALVA LA NUOVA RISPOTA
        int age = scanner.nextInt();

        //scrivo nextLine, che va a pulire il buffer e far funzionare il prossimo codice. 
        scanner.nextLine();

        //MOSTRA LA NUOVA RISPOSTA.
        System.out.printf("Tu hai %d anni, giusto?", age);

        //NUOVA RISPOSTA
        int answer = scanner.nextInt();

        //MOSTRA NUOVA RISPOSTA
        System.out.printf("%s? Ottimo, siamo dello stesso anno!", answer);

        scanner.close();
    } 
}