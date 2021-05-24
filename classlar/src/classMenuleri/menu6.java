package classMenuleri;

import java.util.Scanner;

/*6. Kullanıcının karşısında çeşitli matematiksel işlem seçenekleri çıkar. Bu seçenekler:
o 4 işlem menüsü (2 sayı ile) (1 puan)
o Karekök alma (1 sayı ile) (1 puan)
o Küpkök alma (1 sayı ile) (1 puan)
o Kuvvet alma (2 sayı ile) (1 puan)
o Faktöriyel hesabı yapma (1 sayı ile) (1 puan)
o Eğer klavyeden girilen sayılardan birisi ondalıklı bir sayı ise yapılacak işlemin 
parametreleri de ondalıklı sayı olmalıdır (5 puan – çıktıların kesirli kullanılabilmesi)*/



// Bu menü sorunsuz çalışıyor ama eklemeler yapılabilir 


class menu6 {

    double sayi1 = 0;
    double sayi2 = 0;
    double sonuc = 0;

    public menu6() {
        System.out.println("Menü 6'dasınız Bu menüde matematiksel hesaplamalar yapılır !");
        menuGoster();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        menuSec(i);
    }

    public void getSonuc() {
        System.out.println("Sonuç = " + sonuc);
    }

    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }

    public double getSayi1() {
        return sayi1;
    }

    public void setSayi1(double sayi1) {
        this.sayi1 = sayi1;
    }

    public double getSayi2() {
        return sayi2;
    }

    public void setSayi2(double sayi2) {
        this.sayi2 = sayi2;
    }

    public void menuGoster() {
        System.out.println("Yapmak isyediğiniz işlemi seçiniz !\n\n"
                + "1-Toplama      -> 1\n"
                + "2-ÇIKartma     -> 2\n"
                + "3-Bölme        -> 3\n"
                + "4-Çarpma       -> 4\n"
                + "5-Karekök alma -> 5\n"
                + "6-Küpkök alma  -> 6\n"
                + "7-Kuvvet alma  -> 7\n"
                + "8-Faktöriyel   -> 8\n"
                + "9-Üs alma      -> 9\n"
                + "0-ÇIKIŞ         -> 0\n");
    }

    public static void ekranaYaz(String yazi) {
        System.out.println(yazi);
    }

    public void sayiAl1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı gir:");
        double x = sc.nextInt();
        setSayi1(x);
    }

    public void sayiAl2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı gir:");
        double x = sc.nextInt();
        setSayi1(x);
        System.out.println("2. sayıyı gir:");
        double y = sc.nextInt();
        setSayi2(y);
    }

    public double topla(double x, double y) {

        setSonuc(x + y);
        return sonuc;

    }

    public double cikar(double x, double y) {
        return x - y;
    }

    public double carp(double x, double y) {
        return x * y;
    }

    public double bol(double x, double y) {
        if (y == 0) {
            return 0;
        } else {
            return (x / y);
        }
    }

    public double kareAl(double sayi) {
        return sayi * sayi;
    }

    public double kupkok(double sayi) {
        return Math.pow(sayi, (1 / 3));
    }// Bir sayının küp kökünü almak = sayı üzeri (1/3)

    public double usAl(double sayi1, double sayi2) {
        return Math.pow(sayi1, sayi2);
    }

    public double karekok(double sayi) {
        return Math.sqrt(sayi);
    }

    public int faktoriyel(double sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }

    public void menuSec(int i) {
      
            switch (i) {
                case 0://çıkış
                    System.out.println("ÇIKIŞ YAPTINIZ !");
                    break;
                case 1://topla
                    sayiAl2();
                    System.out.println("Sonuc = " + topla(sayi1, sayi2));
                    break;
                case 2:// çıkar3
                    sayiAl2();
                    System.out.println("Sonuç = " + cikar(sayi1, sayi2));
                    break;
                case 3:// böl
                    sayiAl2();
                    System.out.println("Sonuç = " + carp(sayi1, sayi2));
                    break;
                case 4:// çarp
                    sayiAl2();
                    System.out.println("Sonuç = " + bol(sayi1, sayi2));
                    break;
                case 5://karekok al
                    sayiAl1();
                    System.out.println("Sonuç = " + karekok(sayi1));

                    break;
                case 6://küpkök al
                    sayiAl1();
                    System.out.println("Sonuç = " + kupkok(sayi1));
                    break;
                case 7://kuvvet al 
                    sayiAl1();
                    System.out.println("Sonuç = " + kareAl(sayi1));
                    break;
                case 8://faktöriyel al
                    sayiAl1();
                    System.out.println("Sonuç = " + faktoriyel(sayi1));
                    break;
                case 9://üs al
                    sayiAl2();
                    System.out.println("\nSonuç = " + usAl(sayi1, sayi2));
                    break;
                default:
                    System.out.println("Lütfen listedeki rakamalrdan birini seçin !");

                    break;
            }
        }
    

    public static void main(String[] args) {
       // menu6 m6 = new menu6();

    }
}
