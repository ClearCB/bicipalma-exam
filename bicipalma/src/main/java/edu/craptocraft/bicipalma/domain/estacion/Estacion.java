package edu.craptocraft.bicipalma.domain.estacion;

import java.lang.reflect.Array;

import edu.craptocraft.bicipalma.domain.bicicleta.Bicicleta;

public class Estacion {
    final int id;
    final String direccion;
    final int numeroAnclajes;
    final Bicicleta[] anclajes;

    public Estacion(int id, String direccion, int numeroAnclajes){

        this.id=id;
        this.direccion=direccion;
        this.numeroAnclajes=numeroAnclajes;
        this.anclajes= new Bicicleta[numeroAnclajes];
    }

    
    private int getId() {
        return this.id;
    }
    public Bicicleta[] getAnclajes() {
        return this.anclajes;
    }

    private String getDireccion() {
        return this.direccion;
    }

    private int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }
    
    public void consultarEstacion() {
        System.out.println(this.toString());
    }

    public int anclajesLibres(){
        int anclajesLibres = 0;
        for (int i = 0; i<this.getAnclajes().length; i++){

            if (this.getAnclajes()[i] == null){
                anclajesLibres+=1;
            }
        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Bicicleta bicicleta){
        for (int i = 0; i<this.getAnclajes().length; i++){

            if (this.getAnclajes()[i] == null){
                this.getAnclajes()[i] = bicicleta;
                break;
            }
        }

    }

    @Override
    public String toString(){
        StringBuilder informacionEstacion = new StringBuilder();
        informacionEstacion.append("id: " + this.getId()+" ");
        informacionEstacion.append("\ndireccion: " + this.getDireccion()+" ");
        informacionEstacion.append("\nanclajes: " + this.getNumeroAnclajes());


        return informacionEstacion.toString();
    }
}
