/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan26.waktusaatini;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk melihat waktu saat ini
 */
public class PBOIF210119064Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    
    public static String getTanggal(){
        DateFormat dateformat = new SimpleDateFormat("EEEE, dd MMM YYYY");
        Date tanggal = new Date();
        return dateformat.format(tanggal);
    }
    
    public static String getWaktu(){
        DateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        Date waktu = new Date();
        return timeformat.format(waktu); 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hari ini adalah hari : " + getTanggal() + " " + getWaktu());
    }
    
}
