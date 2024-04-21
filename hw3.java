// Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
// (While döngüsü ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)

import java.util.Random;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in); // kullanıcıdan giriş almak için oluşturuyoruz.

        int randomNumber = random.nextInt(10) + 1; // java kaynaklı. 10 yazarsam 0-9 arasında üretiyor.

        int tahmin = 0;

        while (tahmin != randomNumber) { // sonsuz bir while döngüsü, yapılmak istenen olana kadar devam edecek.
            System.out.println("Tahmininizi (1-10) arasında giriniz: ");
            tahmin = scanner.nextInt(); // kullanıcının girdiği değeri alıp tahmin'e atıyoruz.
            if (tahmin == randomNumber) {
                System.out.println("Tahmin edilen sayı doğru! " +tahmin);
            } else {
                System.out.println("Tahmin edilen sayı doğru değil.");
                System.out.println("------");
            }
        }
    }
}