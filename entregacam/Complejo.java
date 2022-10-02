package main.entregacam;



/*Construir una clase Complejo */

public class Complejo {

    /*-------------------Atributos ------------------*/
    private double dReal;
    private double dImag;


    /*-----------------Contructores -----------------*/

    //Constructor por defecto
    public Complejo() {
    }


    //Constructor con los dos parametros
    public Complejo(double dReal, double dImag) {
        this.dReal = dReal;
        this.dImag = dImag;
    }

    /*------------------Metodos--------------------------- */

   //Asignar a la parte real X y la parte imaginaria Y
    public void asignar(double x, double y){
        this.dReal=x;
        this.dImag=y;

    }

    //sumar dos números complejos
    //(a, b) + (c, d) = (a + c, b + d);

    public Complejo sumar (Complejo c1, Complejo c2){
        Complejo res=new Complejo();
        
        res.dReal=c1.dReal+c2.dReal;
        res.dImag=c1.dImag+c2.dImag;
        return res;

    }
    public Complejo sumar (Complejo c3){
        Complejo res1=new Complejo();
        res1.dReal=this.dReal+c3.dReal;
        res1.dImag=this.dImag+c3.dImag;
        
        return res1;


    }

    public void Imprimir(){
        System.out.println("El resultado de la suma es: "+ dReal+"+"+dImag+"i");

       
    }


    /*----------------GETTERS AND SETTERS---------------- */

    public double getdReal() {
        return dReal;
    }



    public void setdReal(double dReal) {
        this.dReal = dReal;
    }



    public double getdImag() {
        return dImag;
    }



    public void setdImag(double i) {
        this.dImag = i;
    }





    

    



    
}
