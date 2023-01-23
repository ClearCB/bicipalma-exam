package domain.bicicleta;

public class Bicicleta {
    int id;

    // Constructor
    public Bicicleta(int id){
        setId(id);;
    }

    // Getters y setters
    public int getId(){
        return this.id;
    }

    public void setId(int value){
        this.id = value;
    }

    // Métodos
    @Override
    public String toString(){
        return ("La bicleta tiene el id: "+ this.getId());
    }
}
