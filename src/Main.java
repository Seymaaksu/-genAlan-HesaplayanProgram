import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("a köşe uzunluğu giriniz : ");
        a = input.nextDouble();
        System.out.println("b köşe uzunluğu giriniz : ");
        b = input.nextDouble();
        System.out.println("c köşe uzunluğu giriniz : ");
        c = input.nextDouble();
        u = (a+b+c) / 2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("u : " +u);
        System.out.println("Üçgenin Alanı :"+alan);


    }
}