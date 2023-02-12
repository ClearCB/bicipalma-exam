// This class is implemented to make the app scalable in the future, but it is not implemented in the "Estacion" class 
package edu.craptocraft.bicipalma.domain.estacion;

import edu.craptocraft.bicipalma.domain.bicicleta.Movil;

class Anclaje {
    private boolean ocupado;
    private Movil vehiculo = null;
    
    boolean isOcupado(){
        return this.ocupado;
    }

    Movil getBici(){
        return this.vehiculo;
    }

    void anclarVehiculo(Movil vehiculo){
        this.vehiculo = vehiculo;
        this.ocupado = true;
    }

    void liberarVehiculo(){
        this.vehiculo = null;
        this.ocupado = false;
    }

    public String toString(){
        StringBuilder informacionAnclaje = new StringBuilder();

        informacionAnclaje.append("Disponibilidad: " + isOcupado());
        informacionAnclaje.append("Id vehiculo: " + getBici().getId());

        return informacionAnclaje.toString();
    }





}
