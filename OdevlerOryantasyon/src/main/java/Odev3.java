import java.util.Scanner;

public class Odev3
{
    public static void main(String[] args)
    {
        // Bir Çemberin isteğe bağlı olarak çevresi yada alanını bulma

        System.out.println("çemberin çevrsi için 1i alanı için 2yi tuşlayınız");
        System.out.println("Ve Bir Yarıçap Giriniz");
        final double pisayisi = 3.14;
        Scanner girdi1 = new Scanner(System.in);
        double secim = girdi1.nextDouble();
        Scanner girdi2 = new Scanner(System.in);
        double yaricap = girdi2.nextDouble();


        if (secim == 1)
        {
            System.out.println(yaricap + " yarıçaplı dairenin çevresi " + yaricap * 2 * pisayisi + " 'dır");
        }
        if (secim == 2)
        {
            System.out.println(yaricap + " yarıçaplı dairenin alanı " + pisayisi * yaricap * yaricap + " 'dır");
        }


    }
}