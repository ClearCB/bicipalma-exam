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

    public boolean getActivada(){
        return this.activada;
    }

    public void setId(int value){
        this.id = value;
    }

    public void setActivada(boolean estado){
        this.activada = !estado;
    }

    // Métodos
    public boolean isActivada(){
        return this.getActivada();
    }

    @Override
    public String toString(){
        return ("La tarjeta con id: "+this.getId()+". Se encuentra: "+this.getActivada());
    }
}
