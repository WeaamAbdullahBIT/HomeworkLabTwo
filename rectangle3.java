import java.util.Scanner;

public class rectangle3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Calculate The Area of The Rectangle:");
        System.out.println("input the length:");
        double L=input.nextDouble();
        System.out.println("input the width:");
        double W=input.nextDouble();
        System.out.println(L*W);
        System.out.println("________________________________________");
        System.out.println("Enter The Perimeter of The Rectangle:");
        System.out.println("input the length:");
        double l=input.nextDouble();
        System.out.println("input the width");
        double w=input.nextDouble();
        System.out.println(l+w *2);
    }
}
