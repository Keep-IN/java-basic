import java.util.Scanner;

public class Nilai {
    static int nilai;
    static String stat;
    public static void main (String[] args){
        System.out.print("Masukkan nilai angka: ");
        Scanner sc = new Scanner(System.in);
        nilai = sc.nextInt();
        if (nilai>=90 && nilai <= 100){
            stat = "A";
        } else if (nilai >= 80 && nilai <= 89){
            stat = "B";
        } else if (nilai >= 70 && nilai <= 79){
            stat = "C";
        } else if (nilai >= 60 && nilai <= 69){
            stat = "D";
        } else if (nilai >= 0 && nilai <= 59){
            stat = "E";
        } else{
            stat ="Error";
        }
        
        if (stat == "Error"){
            System.out.println("Masukan nilai dari angka 0 - 100");
        } else {
            System.out.println("Nilai huruf: " + stat);
        }
    }
}
