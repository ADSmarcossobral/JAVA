
public class CampoJSon{

    private String nome;
    private int tipo;
    private String valor;

    public CampoJSon(String nome, String valor){
        this.setNome(nome);
        this.setValor(valor);
        this.setTipo(JSonnable.STRING);
    }

    public CampoJSon(String nome, int valor){
        this.setNome(nome);
        this.setValor(Integer.toString(valor));
        this.setTipo(JSonnable.INT);
    }

    public CampoJSon(String nome, double valor){
        this.setNome(nome);
        this.setValor(Double.toString(valor));
        this.setTipo(JSonnable.REAL);
    }

    public CampoJSon(String nome, boolean valor){
        this.setNome(nome);
        this.setValor(Boolean.toString(valor));
        this.setTipo(JSonnable.BOOLEAN);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getValor(){
        return this.valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public int getTipo(){
        return this.tipo;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

}