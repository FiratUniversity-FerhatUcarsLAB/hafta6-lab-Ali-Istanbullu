/**
 * Ad Soyad: [Ali İstanbullu]
 * Öğrenci No: [250542019]
 * Proje: [Sinema Bileti]
 * Tarih: [23.11.2025]
 */

import java.util.Scanner ;
public class Proje2_SinemaBileti {
    

    public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);
                                          

    System.out.print("Lütfen Gün Seçiniz (1,2,3,4,5,6,7) = " );
    int gün = scanner.nextInt();
    System.out.print("Lütfen Saat Seçiniz (7-23) = " );
    int saat = scanner.nextInt();
    System.out.print("Lütfen Meslek Seçiniz (1=Öğrenci,2=Öğretmen,3=Diğer) = " );
    int meslek = scanner.nextInt();
    System.out.print("Lütfen Film Türü Seçiniz (1=2D, 2=3D, 3=IMAX, 4=4DX) = " );
    int filmTürü = scanner.nextInt();
    System.out.print("Lütfen yasinizi Yaziniz = " );
    int Yas = scanner.nextInt();

    boolean gUn =günSeçimi(gün);
    boolean saaT =saatSeçimi(saat);
    double saatveGÜn =saatVeGün(gUn, saaT);
    double Indirim= indirim(Yas, meslek, gün);
    double tür = tur(filmTürü);
    double toplam = ToplamFiyat(saatveGÜn, Indirim, tür);

    /*  switch(gün){
      case 1 : System.out.println("Secilen gün = Pazartesi "); break;
      case 2 : System.out.println("Secilen gün = Sali "); break;
      case 3 : System.out.println("Secilen gün = Çarsamba "); break;
      case 4 : System.out.println("Secilen gün = Perşembe "); break;
      case 5 : System.out.println("Secilen gün = Cuma "); break;
      case 6 : System.out.println("Secilen gün = Cumartesi "); break;
      case 7 : System.out.println("Secilen gün = Pazar "); break;
     }
     System.out.println("Saat = "+saat);
     switch(meslek){
      case 1 : System.out.println("Meslek = Öğrenci"); break;
      case 2 : System.out.println("Meslek = Öğretmen"); break;
      case 3 : System.out.println("Meslek = Diğer"); break;
     }
     switch(filmTürü){
      case 1 : System.out.println("TÜR = 2D"); break;
      case 2 : System.out.println("TÜR = 3D"); break;
      case 3 : System.out.println("TÜR = IMAX"); break;
      case 4 : System.out.println("TÜR = 4DX"); break;
     }
    System.out.println("Yaş = "+Yas);
    System.out.println("Fiyat = "+saatveGÜn);
    System.out.println("İndirim = "+(saatveGÜn*Indirim));
    System.out.println("İndirimli Fiyat = "+(saatveGÜn-(saatveGÜn*Indirim)));
    switch(filmTürü){
      case 1 : System.out.println("2D ekstra: +0 TL"); break;
      case 2 : System.out.println("3D ekstra: +25 TL"); break;
      case 3 : System.out.println("IMAX ekstra: +35 TL"); break;
      case 4 : System.out.println("4DX ekstra: +50 TL"); break;
     }
    System.out.println("TOPLAM :"+toplam);

 */
    Selam(gün,saat,meslek,filmTürü,Yas,saatveGÜn,Indirim,toplam);









   }

//gun
 public static boolean günSeçimi(int gün){

switch(gün){

   case 1 : return true ; 
   case 2 : return true ; 
   case 3 : return true ; 
   case 4 : return true ; 
   case 5 : return true ; 
   case 6 : return false ; 
   case 7 : return false ; 
   default : return false ;
 }


  }
//saat
public static boolean saatSeçimi(int saat){

  return (saat<=12)?true:false ;
}
//gün ve saat
public static double saatVeGün(boolean gün , boolean saat){

if(gün==true && saat==true){

  return 45 ;
}
else if (gün==true && saat==false){

  return 65 ;
}
else if (gün==false && saat==true){

  return 55 ;
}
else  {

  return 85 ;
}

}
//indirim
public static double indirim(int yas ,int meslek,int gun){

 if(meslek==3){

if(yas>65){

  return 0.30;
}
else if(yas<=12){

  return 0.25;
 }
 else {
  return 0.0 ;
 }
}
 //--------------------------------
else if (meslek==2){

if(gun==3){

  return 0.35 ;
}
else{
  return 0.0;
 }
}
//-------------------------------------
else if(meslek==1){
  if(gun==1 || gun==4){
    return 0.20;
  }
  else if (gun==5 || gun==7){
    return 0.15 ;
  }
  else{
   return 0.0 ;
  }
}
//---------------------------------------------
else {
  return 0.0 ;
}
}
//Tür
public static double tur(int Tür){

switch(Tür){

case 1: return 0 ;
case 2: return 25 ;
case 3: return 35 ;
case 4: return 50 ;
default : return 0 ;


}


}
// toplam fiyat
public static double ToplamFiyat(double saatveGÜn ,double Indirim,double tür){

double toplam =(saatveGÜn-(saatveGÜn*Indirim))+tür;

return toplam ;

}
// yazdır
public static void Selam(int gün,int saat,int meslek,int filmTürü,int Yas,double saatveGÜn,double Indirim,double toplam){

switch(gün){
      case 1 : System.out.println("Secilen gün = Pazartesi "); break;
      case 2 : System.out.println("Secilen gün = Sali "); break;
      case 3 : System.out.println("Secilen gün = Çarsamba "); break;
      case 4 : System.out.println("Secilen gün = Perşembe "); break;
      case 5 : System.out.println("Secilen gün = Cuma "); break;
      case 6 : System.out.println("Secilen gün = Cumartesi "); break;
      case 7 : System.out.println("Secilen gün = Pazar "); break;
     }
     System.out.println("Saat = "+saat);
     switch(meslek){
      case 1 : System.out.println("Meslek = Öğrenci"); break;
      case 2 : System.out.println("Meslek = Öğretmen"); break;
      case 3 : System.out.println("Meslek = Diğer"); break;
     }
     switch(filmTürü){
      case 1 : System.out.println("TÜR = 2D"); break;
      case 2 : System.out.println("TÜR = 3D"); break;
      case 3 : System.out.println("TÜR = IMAX"); break;
      case 4 : System.out.println("TÜR = 4DX"); break;
     }
    System.out.println("Yaş = "+Yas);
    System.out.println("Fiyat = "+saatveGÜn);
    System.out.println("İndirim = "+(saatveGÜn*Indirim));
    System.out.println("İndirimli Fiyat = "+(saatveGÜn-(saatveGÜn*Indirim)));
    switch(filmTürü){
      case 1 : System.out.println("2D ekstra: +0 TL"); break;
      case 2 : System.out.println("3D ekstra: +25 TL"); break;
      case 3 : System.out.println("IMAX ekstra: +35 TL"); break;
      case 4 : System.out.println("4DX ekstra: +50 TL"); break;
     }
    System.out.println("TOPLAM :"+toplam);

}















}
