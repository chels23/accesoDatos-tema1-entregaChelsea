package main.entregacam.Herencia;

public class OrdenadortestChelsea {
    public static void main(String[] args) {
        Portatil portatil= new Portatil(2334, "8GB", " AMD Ryzen 5", 500, 2);
        Sobremesa sobremesa= new Sobremesa(3434, "8GB", " Intel Core i5", 600, " Ahorra espacio con este potente y compacto ordenador de sobremesa; con suficiente potencia para usar las aplicaciones más populares de entretenimiento en pantallas 4K, y almacenamiento para guardar archivos multimedia y juegos");

        portatil.MostrarDatos();

        sobremesa.MostrarDatos();
    }
    
}
