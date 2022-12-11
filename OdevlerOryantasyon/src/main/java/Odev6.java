import java.util.Scanner;

public class Odev6
        //0'dan n'e sayıların toplamı n*(n+1)/2 formülünün koda çevrilmiş hali gibi
{
    public static void main(String[] args)
    {
        System.out.print("Lütfen 1'den n'e kadar toplamını öğrenmek istediğiniz sayıyı yazınız : ");
        Scanner b = new Scanner(System.in);
        int giren = b.nextInt();
        int toplam = 0;
        for (int a = 0; a <= giren; a++)
        {
            toplam = toplam + a;
        }
        System.out.println(toplam);


    }
}
