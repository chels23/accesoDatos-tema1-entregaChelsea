package main.entregacam.coordenadas;

public class Punto {
     /*Atributos */
     protected int iX;
     protected int iY;
  

     /*Contructores */
     public Punto(int paramX, int paramY) {
        this.iX = paramX;
        this.iY = paramY;
    }

    /*Método */
    public double distancia(Punto otroPunto){
        double dX = iX - otroPunto.getiX();
        double dY = iY - otroPunto.getiY();
       
        return Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
    }
    

  
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;
        if (iX != other.iX)
            return false;
        if (iY != other.iY)
            return false;
        return true;
    }

    public int getiX() {
        return iX;
    }

    public void setiX(int iX) {
        this.iX = iX;
    }

    public int getiY() {
        return iY;
    }

    public void setiY(int iY) {
        this.iY = iY;
    }

    @Override
    public String toString() {
        return "Punto [iX=" + iX + ", iY=" + iY + "]";
    }
    

    

     

    
}
