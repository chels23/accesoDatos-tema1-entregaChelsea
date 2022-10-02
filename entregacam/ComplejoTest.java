package main.entregacam;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo c1= new Complejo(5,8);
        Complejo c2= new Complejo(2,3);

        Complejo c3= new Complejo();

        c3=c1.sumar(c2);
        System.out.println("Complejo1 "+ c1.getdReal()+" + "+c1.getdImag()+"i");
        System.out.println("Complejo2 "+ c2.getdReal()+" + "+c2.getdImag()+"i");
        
        c3.Imprimir();





    }
    
}
