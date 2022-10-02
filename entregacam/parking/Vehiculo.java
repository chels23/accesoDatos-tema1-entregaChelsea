package main.entregacam.parking;
import java.time.LocalDateTime; // Import the LocalDateTime class


public class Vehiculo {

    /*Atributos */

    private String sMatricula;
    private LocalDateTime dFechaInicio;
    private LocalDateTime dFechaFin;



    /*Constructores */
    public Vehiculo(String paramMatricula,LocalDateTime paramFecha_ini, LocalDateTime paramFecha_fin) {
		super();
		this.sMatricula = paramMatricula;
		this.dFechaInicio = paramFecha_ini;
		this.dFechaFin = paramFecha_fin;
	}
    public Vehiculo(String paramMatricula) {
        super();
        this.sMatricula = paramMatricula;
    }


    /*GETTERS AND SETTERS */


    public String getsMatricula() {
        return sMatricula;
    }


    public void setsMatricula(String sMatricula) {
        this.sMatricula = sMatricula;
    }


    public LocalDateTime getsFechaInicio() {
        return dFechaInicio;
    }


    public void setsFechaInicio(LocalDateTime dFechaInicio) {
        this.dFechaInicio = dFechaInicio;
    }


    public LocalDateTime getsFechaFin() {
        return dFechaFin;
    }


    public void setsFechaFin(LocalDateTime dFechaFin) {
        this.dFechaFin = dFechaFin;
    }


    @Override
    public String toString() {
        return "Vehiculo [sFechaFin=" + dFechaFin + ", sFechaInicio=" + dFechaInicio + ", sMatricula=" + sMatricula
                + "]";
    }

    
    
    

    
}
