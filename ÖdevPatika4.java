
package ödev.patika4;
import java.util.Scanner;
public class ÖdevPatika4 {
public static void main(String[] args) {
     int km;
    double kmbasi=2.20,toplam;
    Scanner klavye = new Scanner(System.in);
    System.out.print("Mesafeyi km cinsinden yazınız:");
    km = klavye.nextInt();
    toplam = km * kmbasi;
    toplam += 10;
    toplam = (toplam<20)? 20:toplam;
    System.out.println("Toplam tutar="+toplam);
        
        
    }
    
}
