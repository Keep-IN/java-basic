import java.util.Scanner;

public class Test {
    static int nilai;

    public static void main (String[] args){
        System.out.print("Masukkan nilai: ");
        Scanner sc = new Scanner(System.in);
        nilai = sc.nextInt();
        if (nilai>=90 && nilai <= 100){
            System.out.println("A");
        } else if (nilai >= 80 && nilai <= 89){
            System.out.println("B");
        } else if (nilai >= 70 && nilai <= 79){
            System.out.println("C");
        } else if (nilai >= 60 && nilai <= 69){
            System.out.println("D");
        } else{
            System.out.println("E");
        }
    }
}