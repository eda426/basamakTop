import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int number= scan.nextInt();
        int total=0;

        for(int i=0;i<=number;i++)
        {
            total+=number%10;//sayının rakamlrını hesaplayıp total değişkenine attık
            number/=10;
        }
        System.out.println("sayının basamak toplamı="+total);
    }
}