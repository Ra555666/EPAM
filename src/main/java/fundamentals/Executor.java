package fundamentals;

import java.util.Scanner;

public class Executor {
    private String userName;


    public static String greetingUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("User, what is your name?");
        String userInput = in.nextLine();
        System.out.println("Hello " + userInput + ", nice to meet you!");
        return userInput;
    }

    public void userNameRevert(String userInput){
        char[] try1 = userInput.toCharArray();
        System.out.print("Now, your name is ");
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
    }

    public static void outputRandomNumbers(){

    }
}
