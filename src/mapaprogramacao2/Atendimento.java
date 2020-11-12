package mapaprogramacao2;

public class Atendimento {
    private String tipo;
    private int numero;

    public Atendimento(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    public Atendimento() {
    }
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Atendimento{" + "tipo=" + tipo + ", numero=" + numero + '}';
    }
 
    
}
