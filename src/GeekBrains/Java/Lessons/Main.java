package GeekBrains.Java.Lessons;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int userNumber = 0;
        guessTheNumber(userNumber);
    }
    // задание 1
    private static void guessTheNumber(int userNumber){
        do {
            System.out.println("Угадайте число от 0 до 9: ");
            Random rand = new Random();
            int generatedNumber = rand.nextInt(10);
            int tryCounter = 0;
            int maxTryCounter = 3;
            while (tryCounter < maxTryCounter) {
                userNumber = scan.nextInt();
                if (userNumber == generatedNumber) {
                    System.out.println("Поздравляю, Вы угадали!");
                    break;
                } else if (userNumber > generatedNumber) {
                    System.out.println("Загаданное число меньше. Попробуйте ещё раз.");
                } else {
                    System.out.println("Загаданное число больше. Попробуйте ещё раз.");
                }
                System.out.println("У Вас осталось " + (maxTryCounter - tryCounter - 1) + " попыток");
                tryCounter++;
            }
            if (tryCounter == maxTryCounter) {
                System.out.println("Вы проиграли. Правильный ответ: " + generatedNumber);
            }
            if (userNumber == generatedNumber || tryCounter == maxTryCounter) {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            }
        } while (scan.nextInt() == 1);
    }
}
