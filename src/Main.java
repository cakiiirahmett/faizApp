import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        int anapara,vade;

        System.out.print("Ne kadar para yatıracaksınız ?(Faiz Oranı %6):");
        anapara=scanner.nextInt();
        System.out.print("Paranızı Kaç Yıl Vadede Tutmak İstiyorsunuz : ");
        vade=scanner.nextInt();

        double toplampara=anapara;
        double faizOranı=0.06;

        for (int i=1;i<=vade;i++){

            toplampara=(faizOranı*toplampara)+toplampara;
            System.out.println(i+".Yılında Vade Sonu Paranız : "+(int)toplampara);

        }
    }
}
