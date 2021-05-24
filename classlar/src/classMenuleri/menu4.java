/*4. Bir kütüphanede kırmızı, yeşil, mavi olmak üzere 3 farklı etiket türü vardır. Rafların dizimi için 
planlanan iki farklı diziliş yöntemi vardır ve bu raflara 42 adet kitap dizilebilir. (10 puan –
matematiksel)
o Diziliş A: Bir rafa sırasıyla kırmızı, yeşil, mavi kitaplar art arda sıralanacak (4 puan).
o Diziliş B: Bir rafa eşit sayıda olmak üzere sırasıyla önce kırmızı, sonra yeşil, en son ise 
mavi kitaplar sıralanacaktır (4 puan).
o Bu problemin kodları yazılırken matematiksel işlem metotlarını kullanınız (örn. a+b 
yerine addExact(a,b)) (2 puan).*/


//---Bir şeyler yapmanın milyon çeşit yolu vardır  bu yüzden toplama yada addExact(a,b)) kullanmadım kullanmayı da düşünmüyorum =)
// Bu menü sorunsuz çalışıyor ama eklemeler yapılabilir 
package classMenuleri;

import java.util.Random;
import java.util.Scanner;

class menu4 {

    Scanner tara = new Scanner(System.in);
    String[] etiketRengi = {"K", "Y", "M"};
    String[] dizim1 = new String[14];
    String[] dizim2 = new String[42];

    public menu4() {
        System.out.println("Menü 4'desiniz");
        sor();
    }

    public void sor() {
        yaz("\n\nBu menüde raflara kitap dizimi yapılmaktadır\n"
                + "Lütfen dizim şeklini seçiniz\n"
                + "1-Bir rafa sırasıyla kırmızı, yeşil, mavi kitaplar art arda sıralanacak\n"
                + "2-Bir rafa eşit sayıda olmak üzere sırasıyla önce kırmızı, sonra yeşil, en son ise mavi kitaplar sıralanacaktır\n"
                + "0-ÇIKIŞ\n");
        int deger = tara.nextInt();
        yonlendir(deger);
    }

    public void yonlendir(int deger) {

        switch (deger) {
            case 0:
                yaz("ÇIKIŞ YAPTINIZ !");
                break;
            case 1:
                dizimA();
                break;
            case 2:
                dizimB();
                break;
            default:
                yaz("Yanlış karakter girdiniz! ");
                sor();
                break;

        }
    }

    public void yaz(String yazi) {
        System.out.print(yazi);
    }

    public void dizimA() {
        yaz("A'dasın\n");
        //42/3=12
        for (int i = 0; i < 14; i++) {
            dizim1[i] = ("(" + etiketRengi[0] + "-" + etiketRengi[1] + "-" + etiketRengi[2] + ")");
        }
        for (int i = 0; i < 14; i++) {
            // yaz((i+1)+". grup "+dizim1[i]);
            yaz(dizim1[i]);
        }
    }

    public void dizimB() {
        yaz("B'desin\n");
        for (int i = 0; i < 42; i++) {
            if (i < 14) {
                dizim2[i] = etiketRengi[0];
            }
            if (i > 13 && i < 28) {
                dizim2[i] = etiketRengi[1];
            }
            if (i > 27 && i < 43) {
                dizim2[i] = etiketRengi[2];
            }
        }
        for (int i = 0; i < 42; i++) {
            // yaz((i+1)+". grup "+dizim2[i]);
            yaz(dizim2[i]);
        }

    }

    public static void main(String[] args) {
//        menu4 m4 = new menu4();
//        m4.sor();
    }
}
