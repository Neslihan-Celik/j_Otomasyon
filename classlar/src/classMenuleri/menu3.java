/*3. Kullanıcı klavyeden tek bir kelime girişi yapacaktır. Bu kelime girişi yapıldıktan sonra kelime 
üzerinde bazı işlemler yapılması için seçenek sunulacaktır (indis ve yer arasındaki farka dikkat 
ediniz). Bu işlemler: (5 puan – metinsel işlem)
o Kelime içinde belirtilen harfin karşılaşılan ilk yerini bulma. (0,5 puan)
o Kelime içinde belirtilen harfin karşılaşılan son yerini bulma. (0,5 puan)
o Kelime içinde belirtilen harften kaç adet olduğunu bulma. (1 puan)
o Kelimenin x-y arasındaki parçasını yazdırma. (2-4 olursa 2. harften başlayacak ve 4. harf 
de dahil olmak üzere kelimenin parçasını yazacaktır. Yani 2., 3. ve 4. harfler yazılacak.) (1 
puan)
o Eğer x değeri için 0 verilirse kelimenin en başından itibaren yazılacak. y değeri için 0 
verilirse kelimenin en sonuna kadar yazılacak. Hem x, hem y 0 olursa kelimenin tamamı 
yazılacak. (2 puan*/




// Bu menü sorunsuz çalışıyor ama eklemeler yapılabilir 

package classMenuleri;

import java.util.Scanner;

class menu3 {

    
    public String kelime = "";
    public String harf = "";
    int bas = 0;
    int son = 0;

    public menu3() {
        System.out.println("Menü 3'desiniz");
        sor();
    }

    public void sor() {
        Scanner tara = new Scanner(System.in);
        yaz("Merhaba Hoşgeldiniz !\n"
                + "gitmek istediğiniz menüyü seçin \n"
                + "0-ÇIKIŞ\n"
                + "1-Kelime içinde belirtilen harfin karşılaşılan ilk yerini bulma\n"
                + "2-Kelime içinde belirtilen harfin karşılaşılan son yerini bulma\n"
                + "3-Kelime içinde belirtilen harften kaç adet olduğunu bulma\n"
                + "4-Kelimenin x-y arasındaki parçasını yazdırma\n");
        int deger = tara.nextInt();
        switch (deger) {
            case 0:
                yaz("ÇIKIŞ YAPTINIZ !");
                break;
            case 1:
                harfIlkYerBul();
                break;
            case 2:
                harfSonYerBul();
                break;
            case 3:
                kacHarfVar();
                break;
            case 4:
                kelimeParcaAL();
                break;

        }
    }

    public void yaz(String yazi) {
        System.out.print(yazi);
    }

    public void veriAl() {
        Scanner tara = new Scanner(System.in);
        yaz("Lütfen bir kelime giriniz :");
        kelime = tara.nextLine();
        yaz("\nLütfen harf giriniz :");
        harf = tara.next();

    }

    public void kacHarfVar() {
        veriAl();
        int harfSayisi = 0;
        for (int i = 0; i < kelime.length(); i++) {

            if (kelime.substring(i, i + 1).equals(harf)) {
                harfSayisi++;
            }
        }
        System.out.println(harf + " harfi " + harfSayisi + " defa tekrar etmiştir.");
    }

    public void harfIlkYerBul() {
        veriAl();
        int yer = kelime.indexOf(harf) + 1;
        System.out.println(harf + " girdisinin  ilk karşılaşıldığı yer : " + yer);
    }

    public void harfSonYerBul() {

        veriAl();
        int yer = kelime.lastIndexOf(harf) + 1;
        System.out.println(harf + " girdisinin  son karşılaşıldığı yer : " + yer);
    }

    public void kelimeParcaAL() {
        Scanner tara = new Scanner(System.in);
        //veriAl();
        yaz("Lütfen metninizi girin :");
        String metin = tara.nextLine();

        yaz("Başlangıç indisi :");
        bas = tara.nextInt();
        yaz("Bitiş indisi :");
        son = tara.nextInt();
        if (son == 0) {
            //eğer ikinci değişken yani son indis sayısı 0 verilirse metnin sonuna kadar al yani metin uzunluğuna eşitle demek oluyot buda
            son = metin.length();
        }
        System.out.println(metin.substring(bas, son));
    }

    public static void main(String[] args) {
        menu3 m3 = new menu3();
       // m3.kacHarfVar();
        // m3.harfIlkYerBul();
        // m3.harfSonYerBul();
        // m3.kelimeParcaAL();
       // m3.sor();

    }
}
