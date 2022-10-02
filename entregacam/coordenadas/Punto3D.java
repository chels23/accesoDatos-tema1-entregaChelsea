package main.entregacam.coordenadas;

public class Punto3D extends Punto{
    /*Atributos */
    private int iZ;

  


    /*Constructores */
    public Punto3D(int paramX, int paramY, int paramZ) {
        super(paramX, paramY);
        this.iZ = paramZ;
    }
    


    /*Metodos */
    public double distancia(Punto3D otroPunto){
        double dX = iX - otroPunto.getiX();
        double dY = iY - otroPunto.getiY();
        double dZ = iZ - otroPunto.getiZ();
    
        return   Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2)+Math.pow(dZ, 2));

    }

    /*Método equals teniendo en cuenta que dos puntos son iguales si todas sus coordenadas son iguales. */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto3D other = (Punto3D) obj;
        if (iZ != other.iZ)
            return false;
        return true;
    }

    /*  public boolean equals(Object obj) {
        Punto punto = (Punto) obj;
        if (x == punto.x && y == punto.y)
            return true;
        else
            return false;
    } */



    public int getiZ() {
        return iZ;
    }



    public void setiZ(int iZ) {
        this.iZ = iZ;
    }



    @Override
    public String toString() {
        return "Punto3D [iZ=" + iZ + "]";
    }

    

    

    
}
