package main.entregacam.coordenadas;

import java.time.LocalDateTime;

public class PuntoTest {
    public static void main(String[] args) {
        Punto punto1 = new Punto(10, 2);
        Punto3D punto2 = new Punto3D(3,3,4);
        Suceso suceso= new Suceso(3, 3, 4,LocalDateTime.now(), null);

        
        System.out.println("Punto 2D: " +punto1+
          "\nPunto 3D: "+punto2+
          "\nDistancia:: "+punto1.distancia(punto2)+
          "\nDescripción: "+suceso.getsDescripcion()+
          "\nTiempo: "+suceso.getTiempo()
                  );
        
        if (punto1.equals(punto2))
            System.out.println("punto 2D y punto 3D pertenecen al mismo punto en el plano.");
        if (punto1.equals(suceso))
            System.out.println("punto 2D y punto Suceso pertenecen al mismo punto en el plano.");
        else
            System.out.println("punto 2D y punto3D no pertenecen al mismo punto en el plano.");
          
       

        


      
    
    }
    
}
