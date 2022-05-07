import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

/**
 * @author Musluhan Cavus 
 * Mayis 2022
 * 
 * Bu program PI sayisinin ilk 1000 degerini (precision degeri) hesaplamaktadır.
 * Kullanılan sonsuz sonsuz toplam formulu = 4(1/1 - 1/3 + 1/5 - 1/7 ...) = PI
 * i degeri dizinin eleman sayisini temsil eder, 
 * i ve precision degerini arttırıp azaltmak size kalmıştır, fakat bilgisayarinizin kapasitesini göz önüne aliniz.
 * 
 */
 

public class App {

    public static void main(String[] args) throws Exception {

        boolean status = false;

        final BigDecimal FOUR = new BigDecimal("4");
        final BigDecimal ONE = new BigDecimal("1");

        //precision degerini arttirmak daha etkili sonuç verir, fakat programi yavaşlatir. Ayrica görmek istediğiniz basamak sayisini gösterir.
        MathContext precision =  new MathContext(1000);

        BigDecimal result = new BigDecimal("4");

        for (int i = 3; i < 1000000 ; i = i +2) {
           
            if(status == false){

                BigDecimal k = new BigDecimal(i);
                BigDecimal temp = FOUR.multiply(ONE.divide(k,precision),precision);
                result = result.subtract(temp,precision);  
                status = true;           
            }
            else{

                BigDecimal k = new BigDecimal(i);
                BigDecimal temp = FOUR.multiply(ONE.divide(k,precision),precision);
                result = result.add(temp,precision); 
                status = false;
            }
            
        } 
     
        System.out.println(result);

        
        
    }

}
