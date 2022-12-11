import java.util.Scanner;

public class Odev10
{
    public static void main(String[] args)
    {
        // Asal sayı olup olmadığını söyleyen java örneği
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for (int i = 2; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                sayac++;
            }
        }
        if (sayac == 0)
        {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else
        {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }
    }
}
