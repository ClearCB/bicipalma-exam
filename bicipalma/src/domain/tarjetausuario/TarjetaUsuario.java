package domain.tarjetausuario;

public class TarjetaUsuario {
    String id;
    boolean activada;

    // Constructor
    public TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    // Getters y setters
    public String getId(){
        return this.id;
    }

    public boolean getActivada(){
        return this.activada;
    }

    public void setId(String value){
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
