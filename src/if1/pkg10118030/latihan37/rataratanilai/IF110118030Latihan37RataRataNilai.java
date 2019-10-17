/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi program : program ini berisi tentang rata rata nilai mahasiswa
 */
public class IF110118030Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Nilai mhs = new Nilai();
         Scanner scanner = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scanner.nextInt();

         mhs.HitungTotal(mhs.nilaiMhs, n);
         mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs,n));
        System.out.println("Developed by : Ari Sulisito");

    }
 }
    

