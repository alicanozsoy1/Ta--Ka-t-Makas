import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

       // Taş-Kağıt-Makas Oyunu
        System.out.println("Taş kağıt makas oyununa hoş geldiniz!");
        System.out.println("1-Taş 2-Kağıt 3-Makas");

        System.out.println("seçim yapınız:");
        int secim1 = klavye.nextInt();
        System.out.println("seçim yapınız:");
        int secim2 = klavye.nextInt();

        if (secim1 == 1 && secim2 == 1){
            System.out.println("berabere");
        } else if (secim1 == 1 && secim2 == 2) {
            System.out.println("2.oyuncu kazandı");
        } else if (secim1 == 1 && secim2 == 3) {
            System.out.println("1.oyuncu kazandı");
        } else if (secim1 == 2 && secim2 == 1) {
            System.out.println("1.oyuncu kazandı");
        } else if (secim1 == 2 && secim2 == 2) {
            System.out.println("berabere");
        } else if (secim1 == 2 && secim2 == 3) {
            System.out.println("2.oyuncu kazandı");
        } else if (secim1 == 3 && secim2 == 1) {
            System.out.println("2.oyuncu kazandı");
        } else if (secim1 == 3 && secim2 == 2) {
            System.out.println("1.oyuncu kazandı");
        } else if (secim1 == 3 && secim2 == 3) {
            System.out.println("berabere");
        } else {
            System.out.println("geçersiz değer");
        }
    }
}