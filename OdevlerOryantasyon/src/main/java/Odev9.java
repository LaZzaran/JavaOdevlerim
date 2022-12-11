import java.util.Scanner;

public class Odev9
{
    public static void main(String[] args)
    {
        // Giridinin istenenle aynı olup olmadığını sorgulayan bir java kod örneği

        System.out.println("-------------------------");
        String sifre = "1881";
        System.out.print("Lütfen Şifreyi Giriniz : ");
        Scanner girdi = new Scanner(System.in);
        String kullanicigirisi = girdi.nextLine();
        System.out.println("-------------------------");
        if (kullanicigirisi.equals(sifre))
        {
            System.out.println("Giriş Başarılı !");
        } else
        {
            System.out.println("Lütfen Tekrar Deneyiniz ! ");
        }

    }
}
