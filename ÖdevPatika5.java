package ödevpatika5;
import java.util.Scanner;
public class ÖdevPatika5 {
public static void main(String[] args) {
    int r,alfa;
    Scanner klavye = new Scanner(System.in);
    System.out.print("Yarıçapın değerini giriniz:");
    r = klavye.nextInt();
    System.out.print("Alfa açısının değerini giriniz:");
    alfa = klavye.nextInt();
    double pi = 3.14;
    double alan = pi*r*r*alfa/360;
    System.out.println("Daire diliminin alanı="+alan);
   
       
    }
    

}
