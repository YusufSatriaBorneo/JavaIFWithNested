// mengimpor Scanner ke program
import java.util.Scanner;

// Membut Class
public class ReservasiCafe{
    public static void main(String [] args){
        
        // deklarasi variabel
         Scanner keyboard = new Scanner(System.in); // untuk inputan user
         String nama, JenisKelamin, hari,hasil;
         int umur;
         double penampilan, uang;

        // Mengatur inisialisasi

        hasil = "";

        // Tampilkan input user
        System.out.println("Nama Pemesan :");
        nama = keyboard.next();

        System.out.println("Berapakah Umur Mu :");
        umur = keyboard.nextInt();

        System.out.println("Jenis Kelamin (Pria / Wanita) :");
        JenisKelamin = keyboard.next();

        System.out.println("Seberapa Menarik Penampilan Mu (1 - 10) :");
        penampilan = keyboard.nextDouble();

        System.out.println("Seberapa Banyak Uangmu :");
        uang = keyboard.nextDouble();

        System.out.println("Memboking Cafe Untuk Hari Apa (Senin - Minggu) :");
        hari = keyboard.next();

        // alogirtma IF Else Nested (Bersarang)
        
        if (hari.equalsIgnoreCase("Senin")){
            if (umur >=20 && umur <= 30 && (JenisKelamin.equalsIgnoreCase("Pria") || JenisKelamin.equalsIgnoreCase("Wanita")) && uang >= 500){
                hasil = ("Selamat Anda Bisa Memboking untuk hari :  " + hari + " Karena Malam ini Kusus Untuk Anak Muda");
            } else hasil = ("Mohon Maaf Anda Belum Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Anak Muda");
        } else if (hari.equalsIgnoreCase("Selasa")){
            if (umur >=31 && umur <=50 && (JenisKelamin.equalsIgnoreCase("Pria") || JenisKelamin.equalsIgnoreCase("Wanita")) && uang >=250){
                hasil = ("Selamat Anda Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Orang Tua");
            }else hasil = ("Mohon Maaf Anda Belum Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Orang Tua");
        }else if (hari.equalsIgnoreCase("Rabu")){
            if (umur >= 20 && umur <= 35 && (JenisKelamin.equalsIgnoreCase("Wanita")) && penampilan >= 8 && penampilan <= 10 && uang >= 300){
                hasil = ("Selamat Anda Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Wanita");
            }else hasil = ("Mohon Maaf Anda Belum Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Wanita");
        }else if (hari.equalsIgnoreCase("Kamis")){
            if (umur >= 21 && umur <= 30 && (JenisKelamin.equalsIgnoreCase("Pria") && (uang >= 1000) || (JenisKelamin.equalsIgnoreCase("Wanita") && penampilan >= 8 && penampilan <= 10 && uang >= 300))){
                hasil = ("Selamat Anda Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Penjomblo Liar");
            }else hasil = ("Mohon Maaf Anda Belum Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Penjomblo Liar");
        }else if(hari.equalsIgnoreCase("Jumat")){
            if  ((JenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 25 && penampilan >= 8 && penampilan <= 10) || (JenisKelamin.equalsIgnoreCase("Wanita") && umur >= 31 && umur <= 43 && uang >= 1000)){
                hasil = ("Selamat Anda Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Wanita Karier");
            }else hasil = ("Mohon Maaf Anda Belum Bisa Memboking untuk hari : " + hari + " Karena Malam ini Kusus Untuk Wanita Karier");
        }else if(hari.equalsIgnoreCase("sabtu") || (hari.equalsIgnoreCase("Minggu"))){
            if (umur >= 18 && umur <= 60 && (JenisKelamin.equalsIgnoreCase("Pria") || JenisKelamin.equalsIgnoreCase("Wanita")) && uang >=100){
                hasil = ("Selamat Anda Bisa Memboking untuk hari : " + hari + " Karena Malam ini Bebas Untuk siapa saja");
            }else hasil = ("Mohon Maaf Anda Belum Bisa Memboking untuk hari : " + hari +  " Karena Malam ini Bebas Untuk siapa saja");
        }

        // Tampilan Output

        System.out.println("==========================");
        System.out.println("Hai, Kak : " + nama);
        System.out.println("==========================");
        System.out.println(hasil);

    }
}