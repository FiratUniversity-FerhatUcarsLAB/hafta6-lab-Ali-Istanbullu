import java.util.Scanner;

public class Proje3_RestoranSiparis {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        System.out.println("LÜTFEN SEÇİMLERİNİZİ SAYI İLE YAPINIZ");

        System.out.print("Lütfen Geleceginiz Saati Yaziniz(7-23) : ");
        int saat = giris.nextInt();

        System.out.print("Lütfen Ana Menü Seciniz (1=Izgara Tavuk, 2=Adana Kebap, 3=Levrek, 4=Manti) : ");
        int anaYemek = giris.nextInt();

        System.out.print("Lütfen Baslangic Seciniz (1=Çorba, 2=Humus, 3=Sigara Böreği, 4=Yok) : ");
        int baslangic = giris.nextInt();

        System.out.print("Lütfen Icecek Seciniz (1=Kola, 2=Ayran, 3=Meyve Suyu, 4=Limonata) : ");
        int icecek = giris.nextInt();

        System.out.print("Lütfen Tatli Seciniz (1=Künefe, 2=Baklava, 3=Sütlaç, 4=Yok) : ");
        int tatli = giris.nextInt();

        System.out.print("Ögrenci Misiniz (1=Evet, 2=Hayir) : ");
        int ogrenci = giris.nextInt();

        double anaYemekSecim = anaYemek(anaYemek);
        double baslangicSecim = baslangic(baslangic);
        double icecekSecim = icecek(icecek);
        double tatliSecim = tatli(tatli);
        
        boolean comboSecim = combo(anaYemek,icecek,tatli);
        boolean saatIndirimi = saatIndirim(saat);
        
        double tutar = 1.0;
        double ToplamIndirim = ToplamIndirim(tutar, comboSecim, ogrenci);

        if(saatIndirimi==true){

            icecekSecim*=0.80;
        }
        double araToplam = anaYemekSecim+baslangicSecim+icecekSecim+tatliSecim;
        double netToplam = araToplam*ToplamIndirim;
        System.out.println("NET Ucret="+netToplam);

        
    }

    public static double anaYemek(int anaYemek) {
        switch (anaYemek) {
            case 1: return 85;
            case 2: return 120;
            case 3: return 110;
            case 4: return 65;
            default: return 0;
        }
    }

    public static double baslangic(int baslangic) {
        switch (baslangic) {
            case 1: return 25;
            case 2: return 45;
            case 3: return 55;
            default: return 0;
        }
    }

    public static double icecek(int icecek) {
        switch (icecek) {
            case 1: return 15;
            case 2: return 12;
            case 3: return 35;
            case 4: return 25;
            default: return 0;
        }
    }

    public static double tatli(int tatli) {
        switch (tatli) {
            case 1: return 65;
            case 2: return 55;
            case 3: return 35;
            default: return 0;
        }
    }

    public static boolean combo(int anaYemek,int icecek,int tatli) {
        return ((anaYemek==1 || anaYemek==2 || anaYemek==3 || anaYemek==4) && 
                (icecek==1 || icecek==2 || icecek==3 || icecek==4) && 
                (tatli==1 || tatli==2 || tatli==3)) ? true : false;
    }

    public static boolean saatIndirim(int saat) {
        return (saat >= 14 && saat <= 17);
    }

    public static double ToplamIndirim(double tutar, boolean combo, int ogrenci) {
        tutar = 1.0;

        if (combo == true) {
            tutar = tutar * 0.85;
        }
        if (ogrenci == 1) { 
            tutar = tutar * 0.90;
        }
        
        return tutar;
    }
}
