//String metotlarını araştırınız. Her bir metot için örnek yapınız.


public class hw5 {
    public static void main(String[] args) {

        String isim = "Bengü";
        System.out.println("İsmin uzunluğu: " + isim.length());

        System.out.println("--------");

        String isim2 = "Bengü";
        char karakter = isim2.charAt(4);
        System.out.println("6. karakter: " + karakter);

        System.out.println("--------");

        String isim3 = "Bengü";
        String buyukHarf = isim3.toUpperCase();
        String kucukHarf = isim3.toLowerCase();
        System.out.println("Büyük harf: " + buyukHarf);
        System.out.println("Küçük harf: " + kucukHarf);

        System.out.println("--------");

        String isim4 = "Merhaba Bengü";
        int indeks = isim4.indexOf('ü');
        System.out.println("İlk 'ü' karakterinin indeksi: " + indeks);

        System.out.println("--------");

        String isim5 = "Merhaba Bengü";
        String altDizi = isim5.substring(2, 5);
        System.out.println("Alt dize: " + altDizi); // diziyi parçalayıp 2-5 arasındaki karakterlerle alt dizi yapıyor.

        System.out.println("--------");

        String isim6 = "Merhaba Bengü"; // string içerisinde başlangıçta ve sonda karakter kontrolü yapıyor. denkse true, denk değilse false dönüyor.
        boolean baslangic =  isim6.startsWith("Mer");
        boolean son = isim6.endsWith("ng");
        System.out.println("Başlangıç kontrolü: " + baslangic);
        System.out.println("Son kontrolü: " + son);


    }
}