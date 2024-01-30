import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println( "Здраствуй братишечка, давай я загадаю число от 1 до 100, а ты попробуешь его отгадать?" );

        while (win == false) {

            System.out.println( "Братулёк введи любое число в данном диапозоне:" );
            guess = input.nextInt();

            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            }
            else if (guess < numberToGuess) {
                System.out.println("- Я сам в шоке, но, загаданное число больше, брат\n");
            }
            else if (guess > numberToGuess) {
                System.out.println("- Не ожидал от тебя такого. Загаданное число меньше, брат\n");
            }
        }
        System.out.println("\nУра Братишечка, ты победил!");
        System.out.println("твоё число было: " + numberToGuess);
        System.out.println("количество попыток: " + numberOfTries);
    }
}

