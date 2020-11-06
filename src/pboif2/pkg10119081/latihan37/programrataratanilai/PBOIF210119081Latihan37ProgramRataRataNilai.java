/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan37.programrataratanilai;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Program Rata-Rata Nilai
 */
public class PBOIF210119081Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        
        nilai.inputNilai();
        nilai.nilaiMahasiswa();
        System.out.println("Maka, Rata-rata Nilainya adalah : " + nilai.rataRataNilai());
    }
    
}
