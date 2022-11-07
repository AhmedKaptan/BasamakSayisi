import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");

        int num = sc.nextInt();

        int adet = 0,toplam=0;

        while(num != 0) {
            toplam += (num % 10);
            num /= 10;
            ++adet;

        }
        System.out.println("basamak sayısı : " + adet);
        System.out.println("basamak toplam :" + toplam);
        }

}