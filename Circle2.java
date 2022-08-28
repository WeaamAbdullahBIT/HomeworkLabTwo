import java.util.Scanner;

public class Circle2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi=3.14;
        System.out.println("calculate the perimeter of the circle:");
        System.out.println("enter the radius of the circle:");
        double rad_1= input.nextDouble();
        System.out.println(2*pi*rad_1);
        System.out.println("_____________________________________");
        System.out.println("calculate the area of the circle:");
        System.out.println("enter the radius of the circle:");
        double rad_2= input.nextDouble();
        System.out.println(pi*rad_2*rad_2);

    }
}
