import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    BigInteger nik;
    String nama, tanggal, gender, golDarah, statKawin, job, agama;
    nik = new BigInteger ("6471050902010006");
    nama = "Kevin Raihan Saleh";
    tanggal = "09 Februari 2001";
    gender = "laki-laki";
    job = "Mahasiswa";
    agama = "Islam";
    golDarah = "AB";
    statKawin = "Belum Menikah";

    System.out.println("NIK : " + nik);
    System.out.println("Nama : " + nama);
    System.out.println("Tanggal Lahir : " + tanggal);
    System.out.println("Jenis kelamin : " + gender);
    System.out.println("Golongan darah : " + golDarah);
    System.out.println("Pekerjaa : " + job);
    System.out.println("Agama : " + agama);
    System.out.println("Status perkawinan: " + statKawin);
  }
}