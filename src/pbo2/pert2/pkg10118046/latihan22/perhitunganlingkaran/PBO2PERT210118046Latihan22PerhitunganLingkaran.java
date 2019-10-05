/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : menghitung jari jari, luas dan keliling lingkaran dari diameter yang dimasukkan
 */
public class PBO2PERT210118046Latihan22PerhitunganLingkaran {

    /**
     * @param diameter
     * @return 
     */
    
    
    public int inputDiameter(int diameter)
    {
        do {
            System.out.println("======Perhitungan Lingkaran======");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                diameter = scanner.nextInt();
            }
            else System.out.println("Nilai Diameter Tidak Sesuai");
        } while(diameter == 0);
        return diameter;
    }
    
    public void hitungLingkaran(int diameter)
    {
        int jariJari = diameter/2;
        double luas = Math.PI * (jariJari*jariJari);
        double keliling = 2*(Math.PI*jariJari);
        
        tampilHasil(jariJari, luas, keliling);
    }
    
    public void tampilHasil(int jariJari, double luas, double keliling)
    {
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.printf("Luas Lingkaran = %.2f", luas);
        System.out.printf(" cm\nKeliling Lingkaran = %.2f", keliling); System.out.print(" cm");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO2PERT210118046Latihan22PerhitunganLingkaran lingkaran = new PBO2PERT210118046Latihan22PerhitunganLingkaran();
        int diameter = 0;
        diameter =lingkaran.inputDiameter(diameter);
        lingkaran.hitungLingkaran(diameter);
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
