package bangundatarinterface;

import java.util.Scanner;

public class BangunDatarInterface {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bd, lk;
        String plh;
        
        System.out.println("MENGHITUNG LUAS DAN KELILING BANGUN DATAR");
        System.out.println("----------------- MENU ------------------");
        System.out.println("1) Persegi \n2) Persegi Panjang \n3) Lingkaran \n4) Keluar");
        System.out.println("-----------------------------------------");
        System.out.print("Pilih menu : ");
        bd = input.nextInt();
        System.out.println("-----------------------------------------");
        
        if(bd == 1 || bd == 2 || bd == 3){
            if(bd == 1){
                System.out.println("\n\n ** PERSEGI **");
            } else if(bd == 2){
                System.out.println("\n\n ** PERSEGI PANJANG **");
            } else if(bd == 3){
                System.out.println("\n\n ** LINGKARAN **");
            }
            
            System.out.println("----------------- MENU ------------------");
            System.out.println("1) Luas \n2) Keliling \n3) Keluar");
            System.out.println("-----------------------------------------");
            System.out.print("Pilih menu : ");
            lk = input.nextInt();
            System.out.println("-----------------------------------------");
            
            switch(bd){
                // Persegi
                case 1:
                    Persegi p = new Persegi();
                    switch(lk){
                        case 1:
                            // luas persegi
                            System.out.print("Panjang sisi : ");
                            p.s = input.nextInt();
                            p.luas();
                            break;
                        case 2:
                            // keliling persegi
                            System.out.print("Panjang sisi : ");
                            p.s = input.nextInt();
                            p.keliling();
                            break;
                        case 3:
                            // exit
                            System.out.println("Bye.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Not found.");
                    }
                    break;

                // Persegi Panjang
                case 2:
                    PersegiPanjang pp = new PersegiPanjang();
                    switch(lk){
                        case 1:
                            // luas persegi panjang
                            System.out.print("Panjang : ");
                            pp.p = input.nextInt();
                            System.out.print("Lebar : ");
                            pp.l = input.nextInt();
                            pp.luas();
                            break;
                        case 2:
                            // keliling persegi panjang
                            System.out.print("Panjang : ");
                            pp.p = input.nextInt();
                            System.out.print("Lebar : ");
                            pp.l = input.nextInt();
                            pp.keliling();
                            break;
                        case 3:
                            // exit
                            System.out.println("Bye.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Not found.");
                    }
                    break;

                // Lingkaran
                case 3:
                    Lingkaran l = new Lingkaran();
                    switch(lk){
                        case 1:
                            // luas lingkaran
                            System.out.print("Jari-jari (r) : ");
                            l.r = input.nextInt();
                            l.luas();
                            break;
                        case 2:
                            // keliling lingkaran
                            System.out.print("Jari-jari (r) : ");
                            l.r = input.nextInt();
                            l.keliling();
                            break;
                        case 3:
                            // exit
                            System.out.println("Bye.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Not found.");
                    }
                    break;
            }
        } else if(bd == 4){
            // Keluar
            System.out.println("Bye.");
            System.exit(0);
        } else {
            System.out.println("Not found.");
        }
    }
    
}
