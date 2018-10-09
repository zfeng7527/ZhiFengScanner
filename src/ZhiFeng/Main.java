package ZhiFeng;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's Your Name?");
        String name = input.nextLine();
        System.out.println("Hello "+name+" nice to meet you.");
        input = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = input.nextInt();
        System.out.println("You are "+age+" years old.");
    }
}
