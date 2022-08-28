import java.util.Scanner;

public class Swap5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First variable:");
        int x= input.nextInt();
        System.out.println("Enter the secound variable:");
        int y= input.nextInt();
        int swap = x;
        x=y;
        y=swap;
        System.out.println("The First Variable is = "+x +"    The Secound Variable is = "+y);

    }
}
