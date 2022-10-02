package main.entregacam.Herencia;

public class Sobremesa extends Ordenador{

    /*Atributos */
    private String sDescripcion;

 

    /*Constructores */
    public Sobremesa(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public Sobremesa(int iCodigo, String sRam, String sCPU, double dPrecio, String sDescripcion) {
        super(iCodigo, sRam, sCPU, dPrecio);
        this.sDescripcion = sDescripcion;
    }

    /*Métodos */

    @Override
    public String toString() {
        return "Sobremesa [sDescripcion=" + sDescripcion + "]";
    }

    public void MostrarDatos(){
        System.out.println("Caracteristicas Ordenador Sobremesa "+
                  "\nCódigo: "+getiCodigo()+
                  "\nRAM: "+getsRam()+
                  "\nCPU: "+getsCPU()+
                  "\nPrecio: "+getsCPU()+
                  "\nDescripcion: "+sDescripcion


                  );
    }


    

  

    

    
    
}
