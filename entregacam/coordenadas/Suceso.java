package main.entregacam.coordenadas;
import java.time.LocalDateTime; // Import the LocalDateTime class

public class Suceso extends Punto3D{
    /*Atributos */
    private LocalDateTime tiempo;
    private String sDescripcion;
 
  

    /*Constructores */
    public Suceso(int paramX, int paramY, int paramZ, LocalDateTime tiempo, String sDescripcion) {
        super(paramX, paramY, paramZ);
     
    }
    
    /*Métodos */



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suceso other = (Suceso) obj;
        if (sDescripcion == null) {
            if (other.sDescripcion != null)
                return false;
        } else if (!sDescripcion.equals(other.sDescripcion))
            return false;
        if (tiempo == null) {
            if (other.tiempo != null)
                return false;
        } else if (!tiempo.equals(other.tiempo))
            return false;
        return true;
    }
    /*GETTERS AND SETTERS */

    public LocalDateTime getTiempo() {
        return LocalDateTime.now();
    }

    public void setTiempo(LocalDateTime tiempo) {
        this.tiempo = LocalDateTime.now();
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    @Override
    public String toString() {
        return "Suceso [sDescripcion=" + sDescripcion + ", tiempo=" + getTiempo() + "]";
    }

    
}
