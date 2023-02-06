import java.util.Scanner;

public class Main {
    static int count = 0;
    static boolean tmp = true;
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");
        hesapla(girdi.nextInt());
    }

    public static void hesapla(int sayi){

        if(sayi<=0){
            tmp=false;
        }

        if(count>=0 && tmp){
            sayi = sayi-5;
            System.out.println(sayi);
            count++;
            hesapla(sayi);

        }else{
            if(count==0){
                return;
            }
            sayi = sayi+5;
            System.out.println(sayi);
            count--;
            hesapla(sayi);

        }



    }
}
