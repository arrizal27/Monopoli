/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author AJAY OK
 */
public class Perusahaan extends petak {
    private int harga;
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public int getHarga(){
        return harga;
    }
    @Override
    public void setNama_petak(String n) {
        super.setNama_petak("Perusahaan " + n); //To change body of generated methods, choose Tools | Templates.
    }
    
}
