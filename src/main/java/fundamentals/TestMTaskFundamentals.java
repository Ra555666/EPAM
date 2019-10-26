package fundamentals;

import java.util.Scanner;

public class TestMTaskFundamentals {
    public static void main(String[] args) {
        MainTaskFundamentals mainTask = new MainTaskFundamentals();
        Scanner input = new Scanner(System.in);
        String month;
        int monthNum = 0;
        boolean monthActive;

        System.out.println("What is your name?");
        String userName = input.nextLine();
        MainTaskFundamentals.greetingUser(userName);
//        Отобразить в окне консоли аргументы командной строки в обратном порядке.
        mainTask.revertUserName(userName);

//        Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        System.out.println("Input required quantity of numbers: ");
        int quality = input.nextInt();
        mainTask.workingWithNumbers(quality);

//         Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
//         и вывести результат на консоль.
        System.out.println(" Sum of which numbers you want to know ");
        int numForSum = input.nextInt();
        mainTask.summingNumbers(numForSum);

//        Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
//        Осуществить проверку корректности ввода чисел.
        do {
            System.out.println("Enter a while number please");
            if (input.hasNextInt()) {
                monthNum = input.nextInt();
                monthActive = true;
            } else {
                System.out.println("I dont understand you");
                monthActive = false;
                input.next();
            }
        }
        while (!(monthActive));
        System.out.println("your month is " + mainTask.whatIsMonthIs(monthNum));


    }
}
