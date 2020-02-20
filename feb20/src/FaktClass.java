/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csabavk
 */
public class FaktClass {
    
    private String nev;
    private String tantargy;
    private byte jegy;

    public String getNev() {
        return nev;
    }

    public String getTantargy() {
        return tantargy;
    }

    public byte getJegy() {
        return jegy;
    }

    public FaktClass(String sor) {
        String[] d = sor.split(";");
        this.nev = d[0];
        this.tantargy = d[1];
        this.jegy = Byte.parseByte(d[2]);
    }
    
}
