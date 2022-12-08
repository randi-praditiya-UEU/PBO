/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_sesi10;

/**
 *
 * @author Randi Praditiya
 */
public class persegi_panjang extends bangun_datar {
     private float hasil;
   persegi_panjang(float angka1X,float angka2X){
       super(angka1X,angka2X);
       hasil=angka1X*angka2X;
       
   }
   public void luas_PP(){
       System.out.println("Hasil Luas Persegi Panjang : "+ hasil);
       
   }
}
