
public class PatrimonioLiquido extends Conta{
    
    @override
    public void creditar(double valor){
        super.debitar(valor);
    }

    @override
    public void debitar(double valor){
        super.creditar(valor);
    }
    
}