package classMenuleri;

import java.util.InputMismatchException;
import java.util.Scanner;

class yonlendirici {

    public int deger = 0;

    public yonlendirici(int deger) {
            
        this.deger = deger;
    }

   

    public int getDeger() {
        return deger;
    }

    private void setDeger(int deger) {
        this.deger = deger;
    }

    public void yaz(String yazi) {
        System.out.println(yazi);
    }

    public void sor() {
        System.out.println("\n\n1.Menü-> 1"
                + "\n2.Menü-> 2"
                + "\n3.Menü-> 3"
                + "\n4.Menü-> 4"
                + "\n5.Menü-> 5"
                + "\n6.Menü-> 6"
                + "\n7.ÇIKIŞ-> 0\n");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        setDeger(i);
    }

}

public class anaMenu {

    public static void main(String[] args) {
        System.out.println("Merhaba Programımıza Hoşgeldiniz !\nLütfen aşağıdaki İşlemlerden birinin işlem numarasını girin ...");
        yonlendirici y = new yonlendirici(1);
        try {
            y.sor();
            int a = y.getDeger();
            switch (a) {
                case 0:
                    System.out.println("ÇIKIŞ YAPTINIZ !");
                    break;
                case 1:
                    menu1 menu1 = new menu1();

                    break;
                case 2:
                    menu2 menu2 = new menu2();

                    break;
                case 3:
                    menu3 menu3 = new menu3();

                    break;
                case 4:
                    menu4 menu4 = new menu4();

                    break;
                case 5:
                    menu5 menu5 = new menu5();

                    break;
                case 6:
                    menu6 menu6 = new menu6();

                    break;
                default:
                    System.out.println("Lütfen Listedeki rakamalrdan birini seçin !");
                    y.sor();
                    break;
            }

        } catch (InputMismatchException a) {
            System.out.println("Hatalı giriş lütfen sayısal değer girin !");
            y.sor();
            menu6 menu6 = new menu6();

        }
    }

}
