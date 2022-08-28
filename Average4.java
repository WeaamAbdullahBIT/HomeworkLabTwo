import java.util.Scanner;

public class Average4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter three numbers:");
         x = input.nextInt();
         y= input.nextInt();
         z= input.nextInt();
         int n=x+y+z;
        System.out.println("The Summation Is =");
        System.out.println(n);
        System.out.println("________________________");
        System.out.println("The Average Is =");
        System.out.println(n/3);

    }
}
