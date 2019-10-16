/*
 * NAMA              : M Islahul Umam djasuta
 * KELAS             : IF-01
 * NIM               : 10118027
 * DESKRIPSI PROGRAM : Kalkulator
 */
package pkg10118027_if_1_latihan34_kalkulator;

import java.util.Scanner;

/**
 *
 * @author RYZEN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        hitung.value1 = masuk.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        hitung.value2 = masuk.nextDouble();
        
        System.out.printf("%nHasil Pertambahan : %.1f%n",hitung.tambahBilangan());
        System.out.printf("Hasil Pengurangan : %.1f%n",hitung.kurangBilangan());
        System.out.printf("Hasil Perkalian   : %.1f%n",hitung.kaliBilangan());
        System.out.printf("Hasil Pembagian   : %.1f%n",hitung.bagiBilangan());
        System.out.printf("Hasil Sisa        : %.1f%n",hitung.sisaBilangan());
    }

}