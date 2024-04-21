// kullanıcının öğrencilerin bilgilerini ve sınav notlarını girdikten sonra ortalama hesaplanıyor.


import java.util.Scanner;

public class hw6 {

    public static void main(String[] args) {

        System.out.println("Öğrenci sayısını giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine();

        double toplam = 0.0;
        double ortalama = 0.0;
        String ogrenciBilgi;

        int i = 1;
        int j = 1;

        for (i = 1; i <= ogrenciSayisi; i++) {
            toplam = 0; // yeni öğrenci için döngüye girerken toplamı sıfırlamamız lazım. yoksa eski değeri kabul eder.
            System.out.println("Öğrencinin adını ve soyadını giriniz: ");
            ogrenciBilgi = scanner.nextLine();
            for (j = 1; j < 4; j++) // kullanıcının öğrencilerin 3 sınav notunu alıp toplamlarını bulur.
            {
                System.out.println("Öğrencinin " + j + ". sınav notunu giriniz: ");
                toplam += scanner.nextDouble();
                scanner.nextLine(); // boş satır okumasını yapıyor.
            }
            ortalama = (toplam / 3.0);
            System.out.println(ogrenciBilgi + " adlı öğrencinin ortalaması: " + ortalama);
            System.out.println("---------");
        }

    }
}
