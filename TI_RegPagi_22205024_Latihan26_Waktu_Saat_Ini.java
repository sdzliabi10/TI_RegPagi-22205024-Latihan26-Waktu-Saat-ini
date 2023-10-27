/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk menampilkan waktu saat ini dengan lokasi kita berada
 */
public class TI_RegPagi_22205024_Latihan26_Waktu_Saat_Ini {
    public static void main(String[] args){
        Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("EEEE dd MMMM yyyy hh:mm:ss");

      System.out.println("Hari ini adalah hari : " + ft.format(HariSekarang));
   }
}

