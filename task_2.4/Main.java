import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double a = scan.nextDouble();
      double b = scan.nextDouble();
        for (int i = 0; i < 6; i++) {
            a*=(1.0+b*0.01);
            System.out.println(i+1 + "-й год:" + a);  
        }
    }  
}
