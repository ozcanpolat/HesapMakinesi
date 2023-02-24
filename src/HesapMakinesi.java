import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input= new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz =");
        number1=input.nextInt();
        System.out.print("2. Sayiyi Giriniz =");
        number2=input.nextInt();

        System.out.println("1-Toplam\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz :");
        select=input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam =" + (number1 + number2));
                break;
            case 2:
                System.out.println("Cikarma =" + (number1 - number2));
                break;
            case 3:
                System.out.println("Carpma =" + (number1 * number2));
                break;
            case 4:
                if(number2 != 0) {
                    System.out.println("Bolme =" + (number1 / number2));
                }else {
                    System.out.println("Bir sayi 0'a bolunemez.");
                }
                break;
            default:
                System.out.println("Hatali secim yaptiniz. Tekrar deneyiniz.");
        }
    }
}
