package domain.tarjetausuario;

public class TarjetaUsuario {
    int id;
    boolean activada;

    // Constructor
    TarjetaUsuario(int id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    // Getters y setters
    public int getId(){
        return this.id;
    }

    public void setId(int value){
        this.id = value;
    }
}
