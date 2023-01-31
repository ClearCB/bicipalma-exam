package edu.craptocraft.bicipalma.domain.estacion;

import edu.craptocraft.bicipalma.domain.bicicleta.Movil;

public class Anclajes {

    private final Anclaje[] puestoAnclajes;

    Anclajes(int numAnclajes){
        this.puestoAnclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){

        for (int i = 0; i<this.puestoAnclajes.length;i++){
            this.puestoAnclajes[i] = new Anclaje();
        }
    }

    protected Anclaje[] anclajes(){

        return this.puestoAnclajes;
    }

    protected int numAnclajes(){
        return this.puestoAnclajes.length;
    }

    protected void ocuparAnclaje(int posicionAnclaje, Movil vehiculo){

        anclajes()[posicionAnclaje].anclarVehiculo(vehiculo);
    }

    protected boolean isAnclajeOcupado(int posicionAnclaje){

        return this.anclajes()[posicionAnclaje].isOcupado();
    }

    protected void liberarAnclaje(int posicionAnclaje){
        this.anclajes()[posicionAnclaje].liberarVehiculo();
    }

    protected Movil getBici(int posicionAnclaje){
        return this.anclajes()[posicionAnclaje].getBici();
    }

    @Override
    public String toString() {
        return "Numero de anclajes: " + Integer.toString(numAnclajes());
    }
}
