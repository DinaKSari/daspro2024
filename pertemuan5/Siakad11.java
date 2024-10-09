import java.util.Scanner;

public class Siakad11 {
    public static void main ( String[] args){
        //mendeklarasi scanner dengan nama sc
        Scanner sc = new Scanner (System.in);
        //mendeklarasikan semua variable dengan tipe data
        String nama,nim, nilaiHuruf, kualifikasi;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
        //menuliskan perintah untuk memasukan data dengan memanfaatkan scanner
        System.out.print("Masukan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukan nomor absen : ");
        absen = sc.nextByte();
        //menuliskan perintah untuk memasukan data nilai
        System.out.print("Masukan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai ujian : ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukan nilai UAS : ");
        nilaiUas = sc.nextDouble();
        //menghitung nilai akhir
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUts * 0.30) + (nilaiUas * 0.35);
        //if else
        if(nilaiAkhir>79 && nilaiAkhir<=100){
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else if(nilaiAkhir<=80 && nilaiAkhir>73){
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari baik";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else if(nilaiAkhir<=73 && nilaiAkhir>65){
            nilaiHuruf = "B";
            kualifikasi = "Baik";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else if(nilaiAkhir<=65 && nilaiAkhir>60){
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari cukup";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else if(nilaiAkhir<=60 && nilaiAkhir>50){
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else if(nilaiAkhir<=50 && nilaiAkhir>39){
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else if(nilaiAkhir<=39 && nilaiAkhir>0){
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
            //menuliskan hasil akhir
            System.out.println("Mahasiswa dengan nama " + nama + "(NIM " + nim + ")");
            System.out.println(" Kelas " + kelas + " No absen  " + absen);
            System.out.println(" Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai akhir huruf : " + nilaiHuruf);
            System.out.println("Kualifikasi : " + kualifikasi);
        }
        else{
            System.out.println("invalid");
        }
        
    }
}