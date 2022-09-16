/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manusia;

/**
 *
 * @author acer
 */
public class MainApp {
   
  public static void main(String[] args) {
        //panggil class Manusia
        Manusia m = new Manusia();
        //[nama class] [variabel buatanmu] = new [nama class]();
        Hewan h = new Hewan();
	       Pesawattelepon g = new Pesawattelepon();


        m.setRambut("Keriting");
        System.out.println("Rambutku "+ m.getRambut());
        h.setEkor("Melingkar");
        System.out.println("Ekor Hewan Peliharaanku "+ h.getEkor());
        g.setKabel("Hitam");
        System.out.println("Warna Kabelnya "+ g.getKabel());

      
   }
}
