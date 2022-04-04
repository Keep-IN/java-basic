import java.util.Scanner;

public class Stars {
    static int type;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kevin Raihan Saleh");
        System.out.print("Masukan angka untuk memilih piramida (1-6): ");
        type = sc.nextInt();

        if (type == 1){
            for (int i = 0; i < 5; i++) {

                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (type == 2){
            for (int i = 5; i >= 0; i--) {

                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
        } else if (type == 3){
            for (int i = 5; i >= 1; i--) {

                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
    
                for (int k = 5; k >= i; k--) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
        } else if (type == 4){
            for (int i = 5; i >= 1; i--) {

                for (int k = 5; k > i; k--) {
                    System.out.print(" ");
                }
    
                for (int j = 1; j <= i; j++) {
    
                    System.out.print("*");
                }
    
                System.out.println();
            }
        } else if(type == 5){
            for (int i = 1; i <= 5; i++) {

                for (int j = i; j < 5; j++) {
    
                    System.out.print(" ");
                }
    
                for (int k = 1; k < (i * 2); k++) {
                    System.out.print("*");
                }
    
                System.out.println();
            }
        } else if(type == 6){
            for (int i = 5; i >= 1; i--) {

                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
    
                for (int k = 1; k < (i * 2); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Angka input tidak valid");
        }

    }	
}
