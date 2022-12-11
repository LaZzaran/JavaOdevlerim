public class Odev1
{
    public static void main(String[] args)
    {
        System.out.println("-------------------------------------------Daireye Benzeyen Eşkenar Dörtgenim---------------------------------------------------------------");
        int a, b, c;
        for (a = 1; a < 20; a++)
        {
            for (b = a; b < 20; b++)
            {
                System.out.print(" ");
            }
            for (c = 1; c <= a; c++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        int x, y, z;
        for (x = 20; 0 < x; x--)
        {
            for (y = x; y < 20; y++)
            {
                System.out.print(" ");
            }
            for (z = 1; z <= x; z++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");

        } // Başaramadım ama denedim hocam
        System.out.println("Yapan ;");
        System.out.println("Adı = Ahmet Mert ");
        System.out.println("Soyadı = Şengöl  ");


        //String no = "2205417070"; //deneme1.1
        //System.out.println("Öğrenci Numarası = " + no); //deneme1.1

        int no = 220541070;
        System.out.println("Öğrenci Numarası = " + no);
        System.out.println("Fakültesi = Teknoloji Fakültesi ");

    }

}
