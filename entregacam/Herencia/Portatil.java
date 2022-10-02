package main.entregacam.Herencia;

public class Portatil extends Ordenador{
    /*Atributos */
    private double dPeso;

    
    /*Constructores */
    public Portatil() {
        
    }

    public Portatil(int iCodigo, String sRam, String sCPU, double dPrecio, double dPeso) {
        super(iCodigo, sRam, sCPU, dPrecio);
        this.dPeso = dPeso;
    }

    /*Métodos */

 
    @Override
    public String toString() {
        return "Portatil [dPeso=" + dPeso + "]";
    }
    
    public void MostrarDatos(){
        System.out.println("Caracteristicas Portatil "+
                  "\nCódigo: "+getiCodigo()+
                  "\nRAM: "+getsRam()+
                  "\nCPU: "+getsCPU()+
                  "\nPrecio: "+getsCPU()+
                  "\nPeso: "+dPeso+
                  "\n "


                  );
    }

    
    
}
