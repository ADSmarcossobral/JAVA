
public class Vip extends Ingresso{

   public Vip(String cadeira, double preco){
       super(cadeira, preco);
   }

   @Override
   public double getPreco(){
       return 2 * super.getPreco();
   }
    
}
    
