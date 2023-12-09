package src;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        char convert =(char)sc.nextInt();
        System.out.println(convert);
    }
}
