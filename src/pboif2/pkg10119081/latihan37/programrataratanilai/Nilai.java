/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Program Rata-Rata Nilai
 */
public class Nilai {
    Scanner scanner = new Scanner(System.in);
    int i, nilai;
    float jumlah,x;
    
    public int inputNilai() {
        System.out.print("Masukkan banyaknya mahasiswa : ");
        return nilai = scanner.nextInt();
    }
    
    public int nilaiMahasiswa() {
        i=1;
        while (i<=nilai) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            x=scanner.nextFloat();
            jumlah  += x;
            i++;
        }
        return (int) jumlah;
    }
    
    public float rataRataNilai() {
        return jumlah/nilai;
    }
}
