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
 * Deskripsi program: Menampilkan daftar film berdasarkan objek orientasi
 * 
 */
public class PBO210117061Latihan32OOdaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film Sedang Tayang===");

        Film film1 = new Film();
        film1.filmName = "Venom";
        film1.filmGenre = "Action,Horror,Scifi";
        film1.filmRating = 9.0;
        film1.filmDuration = 120;
        film1.nowPlaying(film1.filmName, film1.filmGenre,
                film1.filmRating, film1.filmDuration);

        Film film2 = new Film();
        film2.filmName = "One Piece";
        film2.filmGenre = "Action,Drama,Adventure";
        film2.filmRating = 10.0;
        film2.filmDuration = 24;
        film1.nowPlaying(film2.filmName, film2.filmGenre,
                film2.filmRating, film2.filmDuration);

        Film film3 = new Film();
        film3.filmName = "Small foot";
        film3.filmGenre = "Animation";
        film3.filmRating = 8.0;
        film3.filmDuration = 24;
        film1.nowPlaying(film3.filmName, film3.filmGenre,
                film3.filmRating, film3.filmDuration);

        Film film4 = new Film();
        film4.filmName = "Jonny English Strike Again";
        film4.filmGenre = "Action,Comedy";
        film4.filmRating = 10.0;
        film4.filmDuration = 90;
        film1.nowPlaying(film4.filmName, film4.filmGenre,
                film4.filmRating, film4.filmDuration);

    }

}
