import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        float total = 0;       
        int age = 0;
        String gidisDonus = "";
        
        Scanner scanner = new Scanner(System.in);       

        while(total <= 0){  // kullanıcıya mesafeyi sorar, sıfır ve negatif değerleri kabul etmez, kendini tekrar eder.

            System.out.print("Mesafeyi giriniz    : ");
            float distance = scanner.nextFloat();
            total = kmUcretiHesapla(distance);


            if(distance <= 0){
                System.out.println("Mesafe negatig deger ve sifir olamaz, tekrar deneyiniz...");
            }

        }

        while(age <= 0) {   // kullanıcıya yaşını sorar, hatalı girişlerde kendini tekrar eder.

            System.out.print("Yasinizi giriniz    : ");
            age = scanner.nextInt();

            if(age <= 0){
                System.out.println("Sifir ve negatif sayi kabul edilemez, tekrar deneyiniz... ");
            }

        }
        
        while(true) {  //  tek yön mü çift yön mü kullanıcıya sorar. Hatalı girişlerde kendini tekrar eder.

            System.out.print("tek yon mu cift yon mu : ");
            gidisDonus = scanner.nextLine();

            if(gidisDonus.equals("tek") || gidisDonus.equals("cift")){
                break;
            }

        }

        scanner.close();
        System.out.println("Toplam tutar    : " + hesapla(total, age, gidisDonus));

        

    }
    public static double indirimUygula(double fiyat , double yuzdeDeger) {  // girilen fiyat ve indirim oranıyla indirimli fiyatı döndürür.

        return fiyat - ((fiyat/100) * yuzdeDeger);
        
    }

    public static double hesapla(double mesafeUcret , int age , String tekcift) {

        /* Yas üzerinden indirim uygular */

        if(age < 12){
            mesafeUcret = indirimUygula(mesafeUcret, 50);
        }
        if(age < 24 && age > 12){
            mesafeUcret = indirimUygula(mesafeUcret, 10);
        }
        if(age > 65){
            mesafeUcret = indirimUygula(mesafeUcret, 30);
        }

        // gidiş dönüş üzerinden indirim uygular 

        if(tekcift.equals("cift")){
            mesafeUcret = indirimUygula(mesafeUcret, 20);
            mesafeUcret *= 2;
        }
        return mesafeUcret;
        
    }

    public static float kmUcretiHesapla(float km) { // Mesafe bazında temel ücreti hesaplar

        float tarife = 0.10f;
        return tarife*(float)km;
        
    }
}
