// kullanıcının kaç ürün almak istediğini ve ürünlerin fiyatlarını kendisinden alarak toplam hesaplıyor.

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç ürün almak istiyorsunuz?: ");

        int urunAdedi = scanner.nextInt();
        double fiyat = 0.0;

        double toplam = 0;

        for (int i = 0; i < urunAdedi; i++) {
            System.out.println((i+1) + ". ürünün fiyatı: ");
            fiyat = scanner.nextDouble();
            toplam += fiyat;
        }
        System.out.println("Toplam alışveriş tutarı: " + toplam + " TL");

    }
}