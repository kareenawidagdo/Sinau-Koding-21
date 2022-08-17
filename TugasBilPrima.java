package tugasbilprima;

import java.util.Scanner;

public class TugasBilPrima {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, awal, akhir;
        
         System.out.println("** MENAMPILKAN BILANGAN PRIMA DAN BUKAN BILANGAN PRIMA **");
         System.out.println("---------------------------------------------------------");
         System.out.print("Bilangan Awal : ");
         awal = input.nextInt();
         System.out.print("Bilangan Akhir : ");
         akhir = input.nextInt();
         System.out.println("---------------------------------------------------------");
         
        for (int i =awal; i <= akhir; i++){
            bil=0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    bil = bil + 1;
                }
            }
            if (bil == 2){
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " bukan bilangan prima.");
            }            
        }
    }
    
}