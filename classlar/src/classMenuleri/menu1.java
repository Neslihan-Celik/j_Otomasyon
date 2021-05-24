/*
1. Ekranda yukarıda görüldüğü gibi bir tablo bulunacak ve kullanıcı en ortada yer alacak. 
Kullanıcı klavyeden WASD tuşlarını (büyük/küçük harf duyarlılığı olmadan) girdiği zaman 
karakteri bu tablo içerisinde hareket etsin. Eğer kullanıcının hareketi karakteri tablonun 
dışarısına çıkartacaksa harekete izin verilmesin. Karakter yalnızca şekilde belirtilen çizgili 
sınırdan dışarı çıkabilmeli (çıkış yönü ok ile belirtilmiştir). Karakter buradan dışarı çıkmadığı 
sürece kullanıcıdan hareket yönü istenmeli (10 puan - metinsel işlem).
 */



//Bu menüde yapamadığım tek şey wasd tuşları ile hareket

package classMenuleri;

import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.*;

class menu1 {
    //254 karakterin ascii kodu lazım olur dursun burda

    public char ch = '■';
    char[][] kareYerlestir = new char[3][3];
    Scanner tara = new Scanner(System.in);

    public menu1() {
        System.out.println("Menü 1'desiniz");
        yaz("Labirent Oyununa Hoşgeldiniz \n"
                + "Amacınız ç (Çıkış) ulaşmaktır\n"
                + "WASD  veya 1234 tuşlarını kullanarak "
                + "hareket edebilirsiniz\n"
                + "Başarılar!\n");
        kutuUret();
        kutuBastir();
        hareketEt();
    }

//    public void kutuYap() {
//        System.out.println( ch);
//    }
    
    public void yaz(String yazi) {
        System.out.println(yazi);
    }

    public void kutuUret() {

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                kareYerlestir[i][k] = '■';
            }
        }
        kareYerlestir[1][1] = 'x';
        kareYerlestir[2][2] = 'ç';
    }

    public void kutuBastir() {

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(kareYerlestir[i][k] + " ");
            }
            System.out.println();
        }
    }

    /*Yapmaya çalıştığım şey şu (algoritmasını kurmama yardımcı olur diye yazıyorum)
   öncelikle gelen x ve y değerine göre x'in konumu değişmeli şuan kurduğum sistemde
    sabit bir şekilde değişim var dinamik değil bunun içinde benim bir şekilde x'in
    yerini matrise göre azaltıp yada arttırmam lazım
     */
    public boolean kontrolEt(int x, int y) {
        if (kareYerlestir[x][y] == kareYerlestir[2][2]) {
            kareYerlestir[2][2] = 'x';

            yaz("Tabrikler kazandın !");
            return true;
        } else {
            return false;

        }
    }

    public void hareketEt() {

        int x = 1, y = 1;

        while (true) {
            Scanner tara = new Scanner(System.in);
            int yon = tara.nextInt();

            switch (yon) {
                case 1://yukarı

                    kareYerlestir[x][y] = '■';
                    x -= 1;
                    if (x == -1 || x > 2) {
                        yaz("Duvara çarptın !");
                        x++;
                        kareYerlestir[x][y] = 'x';
                    } else if (kontrolEt(x, y)) {
                        kutuBastir();
                        break;
                    } else {
                        kareYerlestir[x][y] = 'x';
                    }

                    kutuBastir();
                    break;
                case 2://aşağı
                    kareYerlestir[x][y] = '■';
                    x += 1;

                    if (x == -1 || x > 2) {
                        yaz("Duvara çarptın !");
                        x--;
                        kareYerlestir[x][y] = 'x';
                    } else if (kontrolEt(x, y)) {
                        kutuBastir();
                        break;
                    } else {

                        kareYerlestir[x][y] = 'x';
                    }

                    kutuBastir();
                    break;
                case 3://sağa
                    kareYerlestir[x][y] = '■';
                    y -= 1;
                    if (y == -1 || y > 2) {
                        yaz("Duvara çarptın !");
                        y++;
                        kareYerlestir[x][y] = 'x';
                    } else if (kontrolEt(x, y)) {
                        kutuBastir();
                        break;
                    } else {
                        kareYerlestir[x][y] = 'x';
                    }

                    kutuBastir();
                    break;
                case 4://sola
                    kareYerlestir[x][y] = '■';
                    y += 1;
                    if (y == -1 || y > 2) {
                        yaz("Duvara çarptın !");
                        y--;
                        kareYerlestir[x][y] = 'x';
                    } else if (kontrolEt(x, y)) {
                        kutuBastir();
                        break;
                    } else {
                        kareYerlestir[x][y] = 'x';
                    }
                    kutuBastir();
                    break;

            }
        }
    }

//    public void basilan(KeyEvent e) {
//
//        System.out.println("Basılan Tuş " + KeyEvent.getKeyText(e.getKeyCode()));
//    }

    public static void main(String[] args) {
        menu1 m1 = new menu1();

//        m1.kutuYap();
//        m1.kutuYap();
//        m1.kutuYap();
//        m1.altGec();
//        m1.kutuYap();
//        m1.kutuYap();
//        m1.kutuYap();
//        m1.altGec();
//        m1.kutuYap();
//        m1.kutuYap();
//        m1.kutuYap();
//        m1.kutuUret();
//        m1.kutuBastir();
//        m1.hareketEt();
       
    }

}
