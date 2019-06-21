/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RizkyKhapidsyah
 */
public class OperatorAritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 20;     //Variabel: Assignment: A diberi nilai 20. Tipe Data: Integer
        int B = 4;      //Variabel: Assignment: B diberi nilai 4. Tipe Data: Integer
        int Hasil;      //Variabel: Deklarasi: Hasil belum diberi nilai. Tipe Data: Integer
       

        System.out.println("----------------------------------------");
        System.out.println("Identifier: ");
        System.out.println("----------------------------------------");
        System.out.printf("A = %d\n", A);
        System.out.printf("B = %d\n\n", B);

        System.out.println("----------------------------------------");
        System.out.println("PENAMBAHAN (A + B)");
        System.out.println("----------------------------------------");
        Hasil = A + B;
        System.out.println(A + " + " + B + " = " + Hasil);          //Cetak Hasil Ke Layar (Cara 1) 
        System.out.printf("%d + %d = %d\n", A, B, Hasil);           //Cetak Hasil Ke Layar (Cara 2)

        System.out.println("----------------------------------------");
        System.out.println("PENGURANGAN (A - B)");
        System.out.println("----------------------------------------");
        Hasil = A - B;
        System.out.println(A + " - " + B + " = " + Hasil);          //Cetak Hasil Ke Layar (Cara 1) 
        System.out.printf("%d - %d = %d\n", A, B, Hasil);           //Cetak Hasil Ke Layar (Cara 2)

        System.out.println("----------------------------------------");
        System.out.println("PERKALIAN (A x B)");
        System.out.println("----------------------------------------");
        Hasil = A * B;
        System.out.println(A + " x " + B + " = " + Hasil);          //Cetak Hasil Ke Layar (Cara 1) 
        System.out.printf("%d x %d = %d\n", A, B, Hasil);           //Cetak Hasil Ke Layar (Cara 2)

        System.out.println("----------------------------------------");
        System.out.println("PEMBAGIAN (A / B)");
        System.out.println("----------------------------------------");
        Hasil = A / B;
        System.out.println(A + " / " + B + " = " + Hasil);          //Cetak Hasil Ke Layar (Cara 1) 
        System.out.printf("%d / %d = %d\n", A, B, Hasil);           //Cetak Hasil Ke Layar (Cara 2)

        System.out.println("----------------------------------------");
        System.out.println("MODULE (A % B)");
        System.out.println("----------------------------------------");
        Hasil = A % B;
        System.out.println(A + " % " + B + " = " + Hasil);          //Cetak Hasil Ke Layar (Cara 1) 
        System.out.printf("%d %% %d = %d\n", A, B, Hasil);          //Cetak Hasil Ke Layar (Cara 2)
    }
}
