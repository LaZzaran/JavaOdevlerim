public class Odev4 {
    public static void main(String[] args)
    {
        // Sola dayalı dik üçgen

        System.out.println("--------------Sola dayalı üçgen-----------------------");

        int uzunluk = 10;
        for (int satir = 0; satir < uzunluk; satir++)
        {

            System.out.print(satir + "");
            for (int sutun = 0; sutun < satir; sutun++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            /*Dikkat edersek "System.out.println" değil "System.out.print" yazıyor -ln ekini
            çıkarınca tek satır şeklinde değilde alt alta ayazılmasının nedeni bu
             */
        }

    }
}
