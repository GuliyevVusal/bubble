package main;

public class Main {
    public static void main(String[] args) {
//  BUBBLE-SORT. 3 5 4 7 1 ozunden sonra gelen reqemden boyukdurse yer deyisdirilsin 3->5 xeyr
//  5-> 4 beli 5 ile 4 yer deyisdirsin en sona en boyuk ededi atir. 1-ci sirada 0-ci elemente en kicik reqem gelir
//  Elementlerimizi random verdik 10 elementli oldugu ucun random *10 dedik casting etdik int-e
//  Cunki 0-dan saymaga basliyacaq ilk for num.length qeder davam edecek
//  2-ci forda num.length -1 verdik cunki nece defe dovr edecekse onu gosteririk 0-ci elementden basliyir
//  11-e getsek yeni 9-cu elemente getse ondan sonra element olmadigi ucun Exception atacaq proqramdan cixacaq
//  ona gore -1 den baslatdiq
//  0-1 i yoxluyur en sonda sondan 1 onundekine qeder getsin ona gorede num.length -1 defe dovr edecek
//  3-cu forumuz J num.length 10 elementlidirse yeni 0-dan 9 qederdirse en son 8 ve 9-cu elemetlerini yoxlayacaq
//  yeni 8-e qeder gedecek 2-ci turda yeni J-de 1 dene daha eksik getmelidir -1-i deyirik
//  neye gore -1-i deyirik ? demesekde duz isleyecek yeni J-de -1 desek. Amma her defe gedib neticenide yeni sonuncu elementi 
//  yoxlayacaq proqram dah cox dovr etmis olacaq.bunun isbati tempden once int count=0; deyib
//  sonda countu++; edib System.out.printf("%,d",count); deyib yoxlaya bilersiniz ve new int [1000] verek
//  elemetde nece defe dovr elediyini gore bilersiz. Temp deyiskeni elan etdik
//  yer deyisdirmek ucun num [j] > num [i+1] boyukdurse deyirik kicikden boyuye siraladigimiz ucun boyukdurse
//  ireli alaciq num [j] ile [j+1] elementini yer deyisdirecik temp = num[j] j-ni saxladiq tempde
//  num[j]-ci elementine [j+1]-ci elemtini qoy sorada gel num[j+1]-ci elementine temp-i qoy yeni [j]-ni qoy

        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
        }
        int temp;
        for (int i = 0; i < num.length; i++) System.out.printf("%3d", num[i]);
        System.out.println();
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) System.out.printf("%3d", num[i]);


    }

}

