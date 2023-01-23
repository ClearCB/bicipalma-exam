package domain.estacion;

import java.util.ArrayList;

import domain.bicicleta.Bicicleta;

public class Estacion {
    public int id;
    public String direccion;
    private int numeroAnclajes;
    private ArrayList<Bicicleta> anclajes;

    // Constructor
    public Estacion(int id, String direccion, int numeroAnclajes){
        setId(id);
        setDireccion(direccion);
        setNumeroAnclajes(numeroAnclajes);
        setAnclajes();
    }

    // Setters y getters
    public int getId(){
        return this.id;
    }

    public String getDireccion(){
        return this.direccion;
    }

    public int getNumeroAnclajes(){
        return this.numeroAnclajes;
    }

    private ArrayList<Bicicleta> getAnclajes(){
        return this.anclajes;
    }
    public void setId(int value){
        this.id = value;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setNumeroAnclajes(int anclajes){
        this.numeroAnclajes = anclajes;
    }

    public void setAnclajes(){
        this.anclajes = new ArrayList<Bicicleta>();
    }

    public void consultarEstacion(){
        System.out.println(this.toString());
    }

    public int anclajesLibres(){
        return this.getNumeroAnclajes()-this.getAnclajes().size();
    }

    public void anclarBicicleta(Bicicleta idBicicleta){
        this.getAnclajes().add(idBicicleta);
    }

    public String mostrarBicicleta(Bicicleta id){

        return ("bicicleta: "+ id.getId() + " anclada en el anclaje: "+ this.posicionAnclaje(id));
    }

    public String posicionAnclaje(Bicicleta id){
        return Integer.toString((this.getAnclajes().indexOf(id)+1));
        
    }

    public void consultarAnclajes(){

        StringBuilder consulta = new StringBuilder();

        for (int i=0; i<this.getAnclajes().size(); i++){

            Bicicleta bici = this.getAnclajes().get(i);
            consulta.append("\n Anclaje "+ (i+1)+": " + bici.getId());
        }

        for (int j=this.getAnclajes().size(); j<this.getNumeroAnclajes(); j++){
            consulta.append("\n Anclaje "+ (j+1) +": "+ "Libre");
        }
        
        System.out.println(consulta);
       
    }

    @Override
    public String toString(){
        StringBuilder identificador = new StringBuilder("\n id: "+this.getId());
        identificador.append("\n direccion: "+this.getDireccion());
        identificador.append("\n numeroAnclajes: "+this.getNumeroAnclajes());

        return identificador.toString();
    }

}
