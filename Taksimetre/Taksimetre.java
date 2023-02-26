import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        Scanner KmHesap = new Scanner(System.in);
        double KmYol, KmUcret,KmUcretToplam, KmUcretMin, MinTutar, AcilisUcret;
        AcilisUcret = 10;
        KmUcret = 2.2;
        MinTutar = 20;
        System.out.println("Gidilen KM'yi yazınız:");
        KmYol = KmHesap.nextDouble();
        KmUcretToplam = AcilisUcret + (KmYol * KmUcret);
        KmUcretMin = (KmUcretToplam < 20) ? 20  : KmUcretToplam;
        System.out.println("Borcunuz:" + KmUcretMin);
    }
}


/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */
