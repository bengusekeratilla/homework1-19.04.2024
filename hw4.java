//mükemmel sayı.

public class hw4 {
    public static void main(String[] args) {
        int number = 496;
        int total = 0; // bölünen sayıların toplamı için kullanacağım.

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println("sayı mükemmel sayıdır.");
        } else {
            System.out.println("sayı mükemmel sayı değildir.");
        }
    }
}