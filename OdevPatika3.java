package odevpatika3;
import java.util.Scanner;
public class OdevPatika3 {
public static void main(String[] args) {
    double a,b,c,alan;
  
    Scanner klavye = new Scanner(System.in);
    System.out.print("a kenarını giriniz:");
    a = klavye.nextDouble();
    System.out.print("b kenarını giriniz:");
    b = klavye.nextDouble();
    System.out.print("c kenarını giriniz:");
    c = klavye.nextDouble();
      double u = (a+b+c)/2;
    alan = u*(u-a)*(u-b)*(u-c);
    System.out.println("Üçgenin alanı="+alan);
    
    }
    
}
