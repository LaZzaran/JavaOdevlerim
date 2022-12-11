import java.util.Random;
import java.util.Scanner;

public class Odev5
{
    public static void main(String[] args)
    {
        //Taş kağıt makas oyunu

        int kisi, pc;

        Random rastgele = new Random();
        pc = rastgele.nextInt(3) + 1;
        System.out.println("Bilgisayar " + pc);
        System.out.println("---------------------------");
        System.out.println("1.taş");
        System.out.println("2.kağıt");
        System.out.println("3.makas");
        System.out.println("---------------------------");
        System.out.print("Lütfen seçiminizi yapınız : ");
        Scanner gelenioku = new Scanner(System.in);
        kisi = gelenioku.nextInt();
        if (kisi != 1 && kisi != 2 && kisi != 3)
        {
            System.out.println("yanlış bir seçim yapılmıştır.");
        }
        else
        {


            System.out.println("<-------SONUÇLAR------->");
            if (pc == kisi)
            {
                System.out.println("Berabere");
            }
            if (pc == 1 && kisi == 2)
            {
                System.out.println("Oyuncu Kazandı ");
            }
            if (pc == 1 && kisi == 3)
            {
                System.out.println("Bilgisayar Kazandı");
            }
            if (pc == 2 && kisi == 1)
            {
                System.out.println("Bilgisayar Kazandı ");
            }
            if (pc == 2 && kisi == 3)
            {
                System.out.println("Oyuncu Kazandı");
            }
            if (pc == 3 && kisi == 1)
            {
                System.out.println("Oyuncu Kazandı");
            }
            if (pc == 3 && kisi == 2)
            {
                System.out.println("Bilgisayar Kazandı");
            }

        }


    }

}
