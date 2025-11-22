/*
 * Ad Soyad: [ALİ İSTANBULLU]
 * Ogrenci No: [250542019]
 * Tarih: [22.11.2025]
 * Aciklama: Gorev 1 - not sistemi
 *
 *
 */

import java.util.Scanner;

public class Proje1_NotSistemi {

    public static void main(String[] args) {
        
        Scanner ali = new Scanner(System.in);

        System.out.print("Vize Notunuzu Giriniz : ");
        double vizeNot = ali.nextDouble();
        System.out.print("Final Notunuzu Giriniz : ");
        double  finalNot = ali.nextDouble();
        System.out.print("Ödev Notunuzu Giriniz : ");
        double  odevNot = ali.nextDouble();

        double ORTALAMA = ortalama(vizeNot, finalNot, odevNot);
        String HARFNOTU = harfNotu(ORTALAMA);
        boolean geçtiKaldi =geçtiKaldiDurumu(ORTALAMA);
        boolean onurLIstesi = onurListesi(ORTALAMA, vizeNot, finalNot, odevNot);
        boolean butNleme = butunleme(ORTALAMA) ;
        System.out.println("=== OGRENCI NOT RAPORU ===");
        System.out.println("VİZE  : "+vizeNot);
        System.out.println("FİNAL : "+finalNot);
        System.out.println("ÖDEV  : "+odevNot);
        System.out.println("--------------------------------");
        System.out.printf("ORTALAMA :  %.1f ",ORTALAMA);
        System.out.printf("\nHARF NOTU :  %s ",HARFNOTU);
        if(geçtiKaldi==true){

            System.out.println("\nDURUM : GEÇTİ ");
        }
        else{

            System.out.println("\nDURUM : KALDI ");

        }
        if(onurLIstesi==true){

         System.out.println("Onur Listesi : EVET");

        }

       else {

         System.out.println("Onur Listesi : HAYIR");

       }
       if (butNleme==true){

        System.out.println("Butunleme : VAR");

       }
    else {

        System.out.println("Butunleme : YOK");

    }







     ali.close();
    }
    
//ortalama
 public static double ortalama(double vizeNot , double finalNot , double odevNot){

   
    return (0.3*vizeNot)+(0.4*finalNot)+(0.3*odevNot);

   }
//harf notu
public static String harfNotu(double ORTALAMA){


if (90<=ORTALAMA && ORTALAMA<=100){

 return "A" ;

}

else if (80<=ORTALAMA && ORTALAMA<=89){

    return "B" ;
}

else if (70<=ORTALAMA && ORTALAMA<=79){

    return "C" ;
}

else if (60<=ORTALAMA && ORTALAMA<=69){

    return "D" ;
}

else {

    return "F" ;
}

}
//gecme kalma
public static boolean geçtiKaldiDurumu(double ORTALAMA){

return (50<=ORTALAMA) ? true : false ;


}
// onur listesi
public static boolean onurListesi(double ORTALAMA , double vizeNot , double finalNot , double odevNot){

 /*  if(85<=ORTALAMA && vizeNot>=70 && finalNot>=70 && odevNot>=70){

    return true ;
  }

 else {

    return false ;
 }
    */

 return (85<=ORTALAMA && vizeNot>=70 && finalNot>=70 && odevNot>=70)? true : false ;

}
// bütünleme 
public static boolean butunleme(double ORTALAMA){

return (40<=ORTALAMA && 50>ORTALAMA)? true : false ;

}

}
