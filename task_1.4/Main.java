/* Дана переменная number.
Напиши программу, которая выводит на экран квадрат этой переменной (number * number). */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int namber = scan.nextInt();
      int c = (namber*namber);
      System.out.println(c);
        
    }
}
