/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Baris
 */
public class Araç {
    
    private String arac_sahibi;
    private int plaka_numarası;

    public Araç(String arac_sahibi, int plaka_numarası) {
        this.arac_sahibi = arac_sahibi;
        this.plaka_numarası = plaka_numarası;
    }

    public String getArac_sahibi() {
        return arac_sahibi;
    }

    public void setArac_sahibi(String arac_sahibi) {
        this.arac_sahibi = arac_sahibi;
    }

    public int getPlaka_numarası() {
        return plaka_numarası;
    }

    public void setPlaka_numarası(int plaka_numarası) {
        this.plaka_numarası = plaka_numarası;
    }
   
}
