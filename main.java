import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int sayac = 0, toplam, i;
        boolean sayiTek = false;

        Scanner input = new Scanner(System.in);

        while (!sayiTek) {
            System.out.print("Sayı giriniz: ");
            i = input.nextInt();
            if (i % 2 == 1) {
                sayiTek = true;
            }
            if ((i % 2 == 0) && (i % 4 == 0)){
                sayac += i;
            }
        }
        System.out.println("2 ve 4'ün katı girilen sayılar: " + sayac);
    }
}