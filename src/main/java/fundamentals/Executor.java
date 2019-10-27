package fundamentals;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Random;
import java.util.Scanner;

public class Executor {
    private String userName;


    public static String greetingUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("User, what is your name?");
        String userInput = in.nextLine();
        System.out.println("Hello " + userInput + ", nice to meet you!");
        return userInput;
    }

    public static void userNameRevert(String userInput) {
        char[] nameArray = userInput.toCharArray();
        System.out.print("Now, your name is ");
        for (int i = nameArray.length - 1; i >= 0; i--)
            System.out.print(nameArray[i]);
    }

    public static void outputRandomNumbers(int amountOfNumbers) {
        Random random = new Random();
        int[] arrayOfNumbers = new int[amountOfNumbers];
        System.out.println("\n" + "Your lucky numbers are: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt();
            System.out.println(arrayOfNumbers[i]);
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }

    public static int summingNumbers(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int[] sortArray = new int[numbersArray.length];
        int sumOfNumbers = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sortArray[i] = Integer.parseInt(numbersArray[i]);
            sumOfNumbers += sortArray[i];
        }
        return sumOfNumbers;
    }

    public static void choosingMonth(int monthNumber) {
        System.out.println(Month.values()[monthNumber]);
    }
}





