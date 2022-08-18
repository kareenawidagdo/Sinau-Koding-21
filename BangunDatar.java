package bangundatar;

import java.util.Scanner;

public class BangunDatar {

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
                    switch(lk){
                        case 1:
                            // luas persegi
                            System.out.print("Panjang sisi : ");
                            int s1 = input.nextInt();
                            System.out.println("Luas Persegi adalah " + s1*s1 + ".");
                            break;
                        case 2:
                            // keliling persegi
                            System.out.print("Panjang sisi : ");
                            int s2 = input.nextInt();
                            System.out.println("Keliling Persegi adalah " + 4*s2 + ".");
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
                    switch(lk){
                        case 1:
                            // luas persegi panjang
                            System.out.print("Panjang : ");
                            int p1 = input.nextInt();
                            System.out.print("Lebar : ");
                            int l1 = input.nextInt();
                            System.out.println("Luas Persegi Panjang adalah " + p1*l1 + ".");
                            break;
                        case 2:
                            // keliling persegi panjang
                            System.out.print("Panjang : ");
                            int p2 = input.nextInt();
                            System.out.print("Lebar : ");
                            int l2 = input.nextInt();
                            System.out.println("Keliling Persegi Panjang adalah " + ((2*p2)+(2*l2)) + ".");
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
                    switch(lk){
                        case 1:
                            // luas lingkaran
                            System.out.print("Jari-jari (r) : ");
                            double r1 = input.nextInt();
                            System.out.println("Luas Lingkaran adalah " + 3.14*r1*r1 + ".");
                            break;
                        case 2:
                            // keliling lingkaran
                            System.out.print("Jari-jari (r) : ");
                            double r2 = input.nextInt();
                            System.out.println("Keliling Lingkaran adalah " + 2*3.14*r2 + ".");
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
