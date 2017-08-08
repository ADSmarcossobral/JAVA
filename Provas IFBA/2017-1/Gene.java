
public class Gene{
    private int codigo;

    public Gene(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo()[
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public Gene clonar(){
        return new Gene(this.getCodigo());
    }

    public boolean equals(Gene outro){
        return this.getCodigo() == outro.getCodigo();
    }

}