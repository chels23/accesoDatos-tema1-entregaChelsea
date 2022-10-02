package main.entregacam.parking;

import java.time.LocalDateTime; // Import the LocalDateTime class

public class ParkingVehiculo implements Parking{

    /*constantes */
    private static final double PRECIO_POR_MINUTO=0.0425;
    private static final int MAXIMO_PLAZAS=100;

    /*Atributos */
    private String sDireccion;
    private int iPlazasOcupadas;



    /*Constructores */
    
    public ParkingVehiculo(String sDireccion) {
        this.sDireccion = sDireccion;
    }




    /*Métodos */


    @Override
    public void hayPlaza() {
        
        if (iPlazasOcupadas>MAXIMO_PLAZAS) {
            System.out.println("Ya no hay mas plazas");
        }else{
            System.out.println("Hay plazas disponibles");
        }
            
        
        
    }

    @Override
    public void aparcaCoche(Vehiculo paramCoche) {
       
        LocalDateTime fecha = LocalDateTime.now();
        paramCoche.setsFechaInicio(fecha);
        
        
    }

    @Override
    public void sacaCoche(Vehiculo paramCoche) {
       
        LocalDateTime fecha = LocalDateTime.now();
        paramCoche.setsFechaFin(fecha);
        
        
    }

    @Override
    public double getFactura(Vehiculo paramCoche) {
   

        LocalDateTime HoraInicio = paramCoche.getsFechaInicio();
        LocalDateTime HoraFin = paramCoche.getsFechaFin();

        long horaEntrada= HoraInicio.getHour();
        long horaSalida= HoraFin.getHour();

       long  diferenciaHoras= (horaSalida - horaEntrada);
       long diferenciaMin=(HoraFin.getMinute()-HoraInicio.getMinute());

       
     

        double dFactura= diferenciaMin*PRECIO_POR_MINUTO;
        return dFactura;





        
    }




    
}
