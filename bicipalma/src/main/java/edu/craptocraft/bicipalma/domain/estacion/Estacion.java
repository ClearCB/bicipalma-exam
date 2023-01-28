package edu.craptocraft.bicipalma.domain.estacion;

public class Estacion {
    final int id;
    final String direccion;
    final int numeroAnclajes;

    public Estacion(int id, String direccion, int numeroAnclajes){

        this.id=id;
        this.direccion=direccion;
        this.numeroAnclajes=numeroAnclajes;
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }
    
    public void consultarEstacion() {
        this.toString();
    }

    public String toString(){
        StringBuilder informacionEstacion = new StringBuilder();
        informacionEstacion.append("id: " + this.getId()+" ");
        informacionEstacion.append("\ndireccion: " + this.getDireccion()+" ");
        informacionEstacion.append("\nanclajes: " + this.getNumeroAnclajes());


        return informacionEstacion.toString();
    }
}
