package main.entregacam.parking;


public class ParkingTestChelsea {
    public static void main(String[] args) throws Exception{
        System.out.println("Inicio ParkingTest");

        try {

            Vehiculo coche1= new Vehiculo("1234LZP");
            Vehiculo coche2= new Vehiculo("5678KAS");
            Vehiculo coche3= new Vehiculo("9834POI");
            Vehiculo coche4= new Vehiculo("9834POI");
            Vehiculo coche5= new Vehiculo("9834POI");
       


            ParkingVehiculo parkingAristizabal =new ParkingVehiculo("Aristizabal 1 Madrid");
            parkingAristizabal.aparcaCoche(coche1);
            parkingAristizabal.aparcaCoche(coche2);
            parkingAristizabal.aparcaCoche(coche3);
            parkingAristizabal.aparcaCoche(coche4);
            parkingAristizabal.aparcaCoche(coche5);
        
            
            // Espero 2 minutos
            Thread.sleep(120*1000);
            parkingAristizabal.sacaCoche(coche1);
            parkingAristizabal.sacaCoche(coche2);
            parkingAristizabal.sacaCoche(coche3);
            parkingAristizabal.sacaCoche(coche4);
            parkingAristizabal.sacaCoche(coche5);
            

            
            double dFactura = parkingAristizabal.getFactura(coche1);
             dFactura = parkingAristizabal.getFactura(coche2);
            dFactura = parkingAristizabal.getFactura(coche3);

            System.out.println(" 1 "+coche1.toString() + "; Factura="+dFactura);
            System.out.println(" 2 "+coche2.toString() + "; Factura="+dFactura);
            System.out.println(" 3 "+coche3.toString() + "; Factura="+dFactura);
            System.out.println(" 4 "+coche3.toString() + "; Factura="+dFactura);
            System.out.println(" 5 "+coche3.toString() + "; Factura="+dFactura);

            



        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
    
}
