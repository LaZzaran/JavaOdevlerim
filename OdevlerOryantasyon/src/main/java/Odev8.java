import java.util.Scanner;

public class Odev8
{
    public static void main(String[] args)
    {
        /* 4 Tür işlemin 2 sayı arasında yapıldığı bir tür program
        yapmaya çalışıyıoruz burada kısacası basit bir hesap makinesi
         */

        double sayi1,sayi2,islemler;
        Scanner girdi=new Scanner(System.in);
        System.out.println("***************");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.println("***************");

        /*Burada println yerine print yazıyorum bunun nedeni girilecek sayıyı al
        satırda değilde yanında istemiş olmak
         */
        System.out.print("Birinci Sayıyı Giriniz  : ");
        sayi1= girdi.nextDouble();

        System.out.print("İkinci Sayıyı Giriniz  :  ");
        sayi2= girdi.nextDouble();

        System.out.print("Bir İşlem Seçiniz  :  ");
        islemler=girdi.nextDouble();

        if (islemler==1)
        {
            System.out.println("Toplama İşleminin Sonucu = " + (sayi1+sayi2));
        }
        else if (islemler==2) 
        {
            System.out.println("Çıkarma İşleminin Sonucu = " + (sayi1-sayi2));
        } 
        else if (islemler==3) 
        {
            System.out.println("Çarpma İşleminin Sonucu = " + (sayi1*sayi2));
        } 
        else if (islemler==4) 
        {
            System.out.println("Bölme İşleminin Sonucu = " + (sayi1/sayi2));
        }
        else
        {
            System.out.println("Tanımlanmamış işlem!!!!");
        }

    }

}
