package edu.craptocraft.bicipalma.domain.bicicleta;

public class Bicicleta implements Movil{
    final int id;

    public Bicicleta(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Bicicleta id: " + id;
    }
}
