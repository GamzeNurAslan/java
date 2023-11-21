package ödevpatika.pkg7;
import java.util.Scanner;
public class ÖdevPatika7 {
public static void main(String[] args) {
       double armutkg,elmakg,domateskg,muzkg,patlıcankg,Toplam;
    
    Scanner klavye = new Scanner(System.in);
    System.out.print("Armutun kilogramını giriniz:");
    armutkg = klavye.nextDouble();
    System.out.print("Elmanın kilogramını giriniz:");
    elmakg = klavye.nextDouble();
     System.out.print("Domatesin kilogramını giriniz:");
    domateskg = klavye.nextDouble();
     System.out.print("Muzun kilogramını giriniz:");
    muzkg = klavye.nextDouble();
     System.out.print("Patlıcanın kilogramını giriniz:");
    patlıcankg = klavye.nextDouble();
    Toplam = (armutkg*2.14)+(elmakg*3.67)+(domateskg*1.11)+(muzkg*0.95)+(patlıcankg*5.00);
    System.out.println("TOPLAM TUTAR="+Toplam);
    
    }
    
}
