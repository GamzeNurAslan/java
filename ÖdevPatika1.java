
package ödev.patika1;
import java.util.Scanner;
public class ÖdevPatika1 {
public static void main(String[] args) {
    //Değişken ataması yap:
    int mat,fizik,kimya,turkce,tarih,muzik;
    //Scanner sınıfını oluştur:
    Scanner klavye = new Scanner(System.in);
    System.out.print("Mat notunu gir:");
    mat = klavye.nextInt();
    System.out.print("Fizik notunu gir:");
    fizik = klavye.nextInt();
    System.out.print("Kimya notunu gir:");
    kimya = klavye.nextInt();
    System.out.print("Türkçe notunu gir:");
    turkce = klavye.nextInt();
    System.out.print("Tarih notunu gir:");
    tarih = klavye.nextInt();
    System.out.print("Müzik notunu gir:");
    muzik = klavye.nextInt();
    int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
    double sonuc = toplam/6.0;
    System.out.println(sonuc);
    boolean kosul = (sonuc>=60)? true:false;
    String str = (kosul)? "Sinifi gectiniz":"Sinifta kaldiniz";
    System.out.println(str);
   
   
   
   
   } 
    
   
{    
             
   
    
    
    
       
    }
    
}
