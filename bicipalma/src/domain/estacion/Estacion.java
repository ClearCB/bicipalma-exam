package domain.estacion;

import domain.bicicleta.Bicicleta;
import domain.tarjetausuario.TarjetaUsuario;

public class Estacion {
    public int id;
    public String direccion;
    private int numeroAnclajes;
    private int[] anclajes;

    // Constructor
    public Estacion(int id, String direccion, int numeroAnclajes){
        setId(id);
        setDireccion(direccion);
        setNumeroAnclajes(numeroAnclajes);
        setAnclajes(numeroAnclajes);
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

    private int[] getAnclajes(){
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

    public void setAnclajes(int anclajes){
        this.anclajes = new int[anclajes];
    }

    // Métodos
    public void consultarEstacion(){
        System.out.println(this.toString());
    }

    public int anclajesLibres(){
        int anclajesLibres = 0;

        for (int i = 0; i < this.anclajes.length; i++) {
            if (this.anclajes[i] == 0) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;

       }

    public void anclarBicicleta(Bicicleta bicicleta){
        for (int i = 0; i < getNumeroAnclajes(); i++) {
            if(this.anclajes[i] == 0){
                this.anclajes[i] = bicicleta.getId();
                break;
            }
        }
    }

    public String mostrarBicicleta(Bicicleta id){
        return ("bicicleta: "+ id.getId() + " anclada en el anclaje: "+ this.posicionAnclaje(id));
    }

    public int posicionAnclaje(Bicicleta id){
        int len = this.getAnclajes().length;

        for (int i = 0; i<len; i++){

            if (this.getAnclajes()[i] == id.getId()){
                return i+1;
            }
        }
        return 0;
    }

    public void consultarAnclajes(){
        StringBuilder consulta = new StringBuilder();

        for (int i=0; i<this.getAnclajes().length; i++){

            int idici = this.getAnclajes()[i];
            if (this.getAnclajes()[i] == 0){
                consulta.append("\n Anclaje "+ (i+1) +": "+ "Libre");
            }
            else{
                consulta.append("\n Anclaje "+ (i+1)+": " + idici);
            }
        } 
        System.out.println(consulta);
    }

    

    public String leerTarjetaUsuario(TarjetaUsuario tarjeta){
        
        return String.valueOf(tarjeta.getActivada());
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){

        if (tarjetaUsuario.getActivada()) {

            for (int i = 0; i < numeroAnclajes; i++) {
                if (this.anclajes[i] != 0) {
                    int bicicleta = this.anclajes[i];
                    this.anclajes[i] = 0;
                    System.out.println("bicicleta retirada: "+ bicicleta+ " del anclaje: "+ (i+1));
                    break;
                }
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder identificador = new StringBuilder("\n id: "+this.getId());

        identificador.append("\n direccion: "+this.getDireccion());
        identificador.append("\n numeroAnclajes: "+this.getNumeroAnclajes());

        return identificador.toString();
    }
}
