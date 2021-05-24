package classMenuleri;

/*10 isimden oluşan bir isim deposu olur. Bu 10 isim arasından rastgele bir isim seçilir. Bu ismin 
harf sayısı kadar aralarında bir boşluk olacak şekilde çizgi eklenir. 5 tahminde bu isim 
bulunmaya çalışılır. Doğru bir harf bilindiği zaman kelimede bu harf 1’den çok sayıda ise hepsi 
birlikte açığa çıkmalı (5 puan - metinsel işlem)
 */
import java.util.Random;
import java.util.Scanner;

class menu2 {

    String basKelime = "";
    String[] dizi = {"aliye", "fatma", "erdal", "seval", "sevim", "osman", "ahmet", "nuran", "meral", "murat"};//burada isim deposu oluşturdum dizi ile
    char[] herfYerlestir;
    String yeniKelime = "";

    public String[] getDizi() {
        return dizi;
    }

    public menu2() {
        System.out.println("Menü 2'desiniz\n"// karşılama mesajını bastım
                + "Bu menüde Size harfleri kapalı bir şekilde "
                + " isim verilecek sizde klavyeden harf girerek ismi "
                + "bulmaya çalışacaksınız !\nBAŞARILAR!!!\n\n");
         sor();
    }

    public void sor() {
        String isim = rastgelIsimGetir();// methodu çağırdım
        isimKapat(isim);// isimkapat methodunu çağırdım
        // System.out.println("İsim = " + isim);
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        while (sayac < 10) {
            if (isim.compareTo(yeniKelime) == 0) {
                break;
            } else {
                System.out.print("Bir harf giriniz: ");
                char harf = scan.next().charAt(0);

                harfBul(isim, harf);

            }
            sayac++;

        }
    }

    public void isimKapat(String isim) {// burada gelen ismin uzunluğu kadar alt çizgi basıyorum ekrana
        int sayi = isim.length();// isim uzunluğunu buldum
        herfYerlestir = new char[sayi];
        System.out.println("Gizli isim :");
        for (int i = 0; i < sayi; i++) {//sayaçla ekrana bastım
            herfYerlestir[i] = '-';// burada aynı zamanda tüm karakterleri bir diziye attım
            System.out.print(herfYerlestir[i]);
        }
        yaz("\n");
    }

    public void yaz(String yazi) {
        System.out.println(yazi);
    }// sadece System.out.println() yazmak istemediğim için yaz diye method oluşturdum

    public String rastgelIsimGetir() {//isim deposundan rastgele bir isim getirdim
        Random r = new Random(); //random sınıfı
        int a = r.nextInt(dizi.length);//en fazla dizinin uzunluğu kadar sayı üretip rastgele birini seçip o sıradaki ismi çağırdım
        return dizi[a];
    }

    public void harfBul(String isim, char harf) {//klavyeden girilem harf gizli isimde mevcutmu onun kontrolü
        int sayac = 0;
        int konum = 0;

        for (int i = 0; i < isim.length(); i++) {
            if (isim.charAt(i) == harf) {
                sayac = sayac + 1;
                konum = i;
                harfYerlestir(isim, harf, konum);
            }
        }
         if (sayac ==0) {
                yaz("Mevcut değil tekrar dene");
            }

    }

    public void harfYerlestir(String isim, char harf, int harfYeri) {
        basKelime = isim;
        herfYerlestir[harfYeri] = harf;
        String cozulmusIsim = new String(herfYerlestir);
        yeniKelime = cozulmusIsim;
        if (isim.compareTo(yeniKelime) == 0) {// burada string karşılaştırdım çünkü diğer string dönüşümden geldiği için uyumsuzluk vardı
            System.out.println("\nKelimeler eşleşti! \nTebrikler kazandın ! \t Gizli isim : " + yeniKelime);
        } else {
            System.out.println("Harf açtım " + yeniKelime);
        }
    }

    public static void main(String[] args) {
//        menu2 m2 = new menu2();
//        m2.sor();
    }
}
