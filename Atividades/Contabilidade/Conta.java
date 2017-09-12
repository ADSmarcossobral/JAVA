
public class Conta implements JSonnable{

    private String id;
    private String nome;
    private double saldo;

    public Conta(String id, String nome, double saldo){
        this.setId(id);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public CampoJSon[] getCampos(){
        CampoJSon[] campos = new CampoJSon[3];
        campos[0] = new CampoJSon("id", this.getId());
        campos[1] = new CampoJSon("nome", this.getNome());
        campos[2] = new CampoJSon("saldo", this.getSaldo());
        return campos;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
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

    public void debitar(double valor){
        this.saldo -= valor;
    }

    public void creditar(double valor){
        this.saldo += valor;
    }

}