/*
 *
 * @author
 * NAMA 	: Gugun
 * KELAS	: PBO6
 * NIM		: 10117902
 * 
 * Description : Program Daftar Film
 *
 */
package daftarfilm;

/**
 *
 * @author Gugun
 */
public class Daftarfilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===");
        
        System.out.println("");
        
        Film flm1 = new Film();
        flm1.filmName = "Kimi no Na Wa";
        flm1.filmGenre = "Animation, Drama, Fantasy";
        flm1.filmRating = 8.4;
        flm1.filmDuration = 106;
        flm1.nowPlaying(flm1.filmName, flm1.filmGenre, flm1.filmRating, flm1.filmDuration);
        
        System.out.println("");
        
        Film flm2 = new Film();
        flm2.filmName = "Koe No Katachi";
        flm2.filmGenre = "Animation, Drama, Family";
        flm2.filmRating = 8.2;
        flm2.filmDuration = 212;
        flm2.nowPlaying(flm2.filmName, flm2.filmGenre, flm2.filmRating, flm2.filmDuration);
        
        System.out.println("");
        
        Film flm3 = new Film();
        flm3.filmName = "Kimi no suizô wo tabetai Live action";
        flm3.filmGenre = "Drama, Romance";
        flm3.filmRating = 7.2;
        flm3.filmDuration = 115;
        flm3.nowPlaying(flm3.filmName, flm3.filmGenre, flm3.filmRating, flm3.filmDuration);
        
        System.out.println("");
        
        Film flm4 = new Film();
        flm4.filmName = "reLife";
        flm4.filmGenre = "Comedy, Drama, Romance";
        flm4.filmRating = 7.0;
        flm4.filmDuration = 120;
        flm4.nowPlaying(flm4.filmName, flm4.filmGenre, flm4.filmRating, flm4.filmDuration);
    }
    
}