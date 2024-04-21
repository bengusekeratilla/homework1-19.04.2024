//2.Do-while döngüsü: kodda belirtilen koşulu çalıştırmadan önce en az bir kez döngüye girer yani kodlanan döngü en az 1 kere çalışır.

public class hw2 {
    public static void main(String[] args) {

        int count = 0;
        do {
            System.out.println("Merhaba dünya!");
            count++;
        } while (count < 5);

        System.out.println("---------");

        int j = 11; // koşul sağlanmasa da döngüye girecek.
        do {
            System.out.println(j);
            j += 2;
        }
        while (j < 10);
        System.out.println("Do-While döngüsü bitti.");

    }
}
