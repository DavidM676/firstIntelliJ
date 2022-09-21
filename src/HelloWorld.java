import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a decimal amount of money: ");
        double money = scan.nextDouble();


        double r;

        int a = (int) (money / 0.25);
        int b = (int) ((money % 0.25)/.10);
        int c = (int) (((money % 0.25)%0.10)/.05);
        int d = (int) ((((money % 0.25)%0.10)%.05)/0.01);

        // 25a + 10b + 5c + 1d = 1.37
        // a+b+c+d >= 8
        System.out.println("The minimum number of coins is: "+(a+b+c+d));

        System.out.println(a + " Quarters");
        System.out.println(b + " Dimes");
        System.out.println(c + " Nickels");
        System.out.println(d + " Pennies");
        scan.close();
    }
}