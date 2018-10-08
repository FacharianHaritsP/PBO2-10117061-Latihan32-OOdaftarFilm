/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan32.oodaftarfilm;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan film berdasarkan objek orientasi
 * 
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String filmName,String filmGenre, double filmRating,
                           int filmDuration ){
    
        System.out.println("\nJudul film : " + filmName );
        System.out.println("Genre film : " + filmGenre );
        System.out.println("Rating film : " + filmRating );
        System.out.println("Duration film : " + filmDuration + " menit" );
    
    }
}
