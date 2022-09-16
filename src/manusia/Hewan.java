
package manusia;

/**
 *
 * @author acer
 */
public class Hewan {
   String mata, mulut, telinga, kaki, ekor;
 
    /*
    set = kata "SET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk memasukkan nilai kedalam method pada suatu class
    
    get = kata "GET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk mengambil nilai dari class
    */
 
    public void setMata(String mata) {
        this.mata = mata;
    }
 
    public void setMulut(String mulut) {
        this.mulut = mulut;
    }
 
    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }
    public void setEkor(String ekor) {
        this.ekor= ekor;
    }
 

    public String getMata() {
        return mata;
    }
 
    public String getMulut() {
        return mulut;
    }
 
    public String getTelinga() {
        return telinga;
    }
 
    public String getKaki() {
        return kaki;
    }
    public String getEkor() {
        return ekor;
    }

    
    void bermain( String m ){ //dgn parameter
        System.out.println("Ayo bermain "+ m);
    }
    
    void makan(){ //tanpa parameter
        System.out.println("Aku makan wiskas");
    }
    
    void tidur(String tempat, String lokasi){ //2 paramater
         System.out.println("Aku tidur di "+ tempat + " lokasinya di "+ lokasi);
    }
           
}
