
public abstract class Mandato{
    
    private int id;
    private String nomeMandatario;

    public Mandato(int id, String nomeMandatario){
        this.setId(id);
        this.setNomeMandatario(nomeMandatario);
    }
    
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNomeMandatario(){
        return this.nomeMandatario;
    }

    public void setNomeMandatario(String nomeMandatario){
        this.nomeMandatario = nomeMandatario;
    }

    public double getAvaliacao(){
        return this.getAtivismo() * this.getRepresentatividade();
    }

    public boolean equals(Mandato mandato){
        return this.getId() == mandato.getId();
    }

    public abstract double getAtivismo();

    public abstract double getRepresentatividade();

}