package main.entregacam.Herencia;

public class Ordenador {

    /*Atributos */
    protected int iCodigo;
    protected String sRam;
    protected String sCPU;
    protected double dPrecio;
 

    /*Constructores */

    public Ordenador(){

    }

    public Ordenador(int iCodigo, String sRam, String sCPU, double dPrecio) {
        this.iCodigo = iCodigo;
        this.sRam = sRam;
        this.sCPU = sCPU;
        this.dPrecio = dPrecio;
    }

    
    /*Métodos */
    public int getiCodigo() {
        return iCodigo;
    }

    public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }

    public String getsRam() {
        return sRam;
    }

    public void setsRam(String sRam) {
        this.sRam = sRam;
    }

    public String getsCPU() {
        return sCPU;
    }

    public void setsCPU(String sCPU) {
        this.sCPU = sCPU;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }


    
    


    
}
