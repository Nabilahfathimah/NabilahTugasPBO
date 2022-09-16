
package manusia;

/**
 *
 * @author acer
 */
public class Pesawattelepon {
  String bentuk, kabel, gagangtelpon;
 
    /*
    set = kata "SET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk memasukkan nilai kedalam method pada suatu class
    
    get = kata "GET" hanya kebiasaan programmer yang mengartikan
    fungsi untuk mengambil nilai dari class
    */
 
    public void setBentuk(String bentuk) {
        this.bentuk= bentuk;
    }
 
    public void setKabel(String kabel) {
        this.kabel = kabel;
    }
 
    public void setGagangtelpon(String gagangtelpon) {
        this.gagangtelpon = gagangtelpon;
    }

  
    public String getBentuk() {
        return bentuk;
    }
 
    public String getKabel() {
        return kabel;
    }
 
    public String getGagangtelpon() {
        return gagangtelpon;
    }
    
    void terima_panggilan(){ //dgn parameter
        System.out.println("aku menerima panggilan ");
    }
        void melakukan_panggilan(){ //dgn parameter
        System.out.println("aku sedang menelpon ");
    }   
}
