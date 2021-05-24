/*5. Zar menüsünde iki farklı seçenek bulunur (5 puan – matematiksel işlem):
o İlk seçenekte rastgele 2 standart zar atılır ve sonuçları ekrana yansıtılır. İstenirse bu 
zarların sonuçları kayıt edilir ve kullanıcıya tekrar zar atıp atmak istemediği sorulur. (2 
puan)
o İkinci seçenekte kayıt edilen tüm zar1 ve zar2 sonuçları listelenir. (3 puan).
o Zarlar programdan tamamen çıkış yapılana kadar kayıtlı kalacaktır. Örneğin 5. 
uygulamadan çıkıldıktan sonra 2. uygulama çalıştırılır ve daha sonra yeniden 5. 
uygulama çalıştırılırsa daha önceden kaydedilmiş zarların bilgisi kullanılabilmeli.*/




// Bu menü sorunsuz çalışıyor ama eklemeler yapılabilir 


package classMenuleri;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class menu5 {

   ArrayList<String> zarlar=new ArrayList<String>();

    public menu5() {
        System.out.println("Menü 5'desiniz");
        bilgiVer();

    }

    public void bilgiVer() {
        yaz("\n\nZar atma menüsüne hoşgeldiniz\n"
                + "Yapmak istediğiniz işlemi seçin\n"
                + "0-ÇIKIŞ\n"
                + "1-Rastgele zar atma\n"
                + "2-Daha önce atılan zar  kayıtlarını göster\n");
        Scanner tara = new Scanner(System.in);
        int deger = tara.nextInt();
        yonlendir(deger);
    }

    public void yaz(String yazi) {
        System.out.println(yazi);
    }

    public void yonlendir(int deger) {
        switch (deger) {
            case 0:
                yaz("ÇIKIŞ YAPTINIZ !");
                break;
            case 1:
                zarAt();
                break;
            case 2:
                zarSonucAL();
                break;
            default:
                yaz("Listede olan seçimlerden birini seçiniz !");
                bilgiVer();
                break;
        }
    }

    public void zarAt() {

        Scanner tara = new Scanner(System.in);
        Random r = new Random(); //random sınıfı
        int zar1 = r.nextInt(5)+1;
        int zar2 = r.nextInt(5)+1;
       // zarSonucKaydet(zar1, zar2);
        System.out.println("Sonuç : "+zar1+"-"+zar2);
        yaz("Sonuçları Kaydetmek istiyor musunuz ?\n"
                + "1-EVET\n"
                + "2-HAYIR");
       int cevap= tara.nextInt();
       if(cevap==1){
       zarlar.add(zar1+" - "+zar2);
        yaz("Sonuçlar kaydedildi !\n Ana menüye yönlendirildiniz !\n\n");
            bilgiVer();
       }
       else if(cevap==2){
           yaz("Sonuçlar kaydedilmedi !\n Ana menüye yönlendirildiniz !\n\n");
            bilgiVer();
       }else {
           yaz("Yanlış karakter girdiniz !\n Ana menüye yönlendirildiniz !\n\n");
            bilgiVer();
       }

    }

    public void zarSonucAL() {
        yaz("Daha önce atılan zar kayıtları \n");
         for (int i = 0; i < zarlar.size(); i++) {
         yaz(i+". atış sonucu : "+zarlar.get(i));
            }
        
    }

  

    public static void main(String[] args) {
//        menu5 m5 = new menu5();
//        m5.bilgiVer();
    }
}
