package ödevpatika.pkg6;
import java.util.Scanner;
public class ÖdevPatika6 {
public static void main(String[] args) {
    double kilo,boy,vücutindeksi;
    Scanner klavye = new Scanner(System.in);
    System.out.print("Kilo değerini girin:");
    kilo = klavye.nextDouble();
    System.out.print("Boy değerini girin:");
    boy = klavye.nextDouble();
    vücutindeksi = kilo/boy*boy;
    System.out.println("Vücut kitle indeksiniz:"+vücutindeksi);
    
       
    }
    
}
