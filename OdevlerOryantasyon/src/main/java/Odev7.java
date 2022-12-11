import java.util.Scanner;

//Ortalama hesaplama
public class Odev7
{
    public static void main(String[] args)
    {
        // Verlien sayıların ortalamasını bulma
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen yaşları giriniz");
        double sayi1 = girdi.nextInt();
        double sayi2 = girdi.nextInt();
        double sayi3 = girdi.nextInt();

        double ortalama = (sayi2 + sayi1 + sayi3) / 3;
        System.out.println("kardeş 1 = " + sayi1 + " kardeş 2 =" + sayi2 + " kardeş 3 = " + sayi3);
        System.out.println("ortalamaları = " + ortalama);
    }
}
