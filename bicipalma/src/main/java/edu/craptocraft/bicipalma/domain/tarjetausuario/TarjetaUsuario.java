package edu.craptocraft.bicipalma.domain.tarjetausuario;

public class TarjetaUsuario implements Autenticacion{
    final String id;
    boolean activada;

    public TarjetaUsuario(String id, boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public String getId() {
        return this.id;
    }

    public boolean getActivada() {
        return this.activada;
    }

    public boolean isActivada(){
        return this.getActivada();
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    @Override
    public String toString(){
        StringBuilder informacion = new StringBuilder();
        informacion.append("id: " + this.getId());
        informacion.append("activada: " + this.getActivada());

        return informacion.toString();
    }
}
