public class Conta implements Jsonable{
    
    private int id;
    private String nome;
    private double saldo;

    public String[] getValoresAtributos(){

    }

    public String[] getNomeAtributos(){

    }

    public int[] getTiposAtributos(){

    }
    public Conta(int id, String nome, double saldo){
        this.setId(id);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}