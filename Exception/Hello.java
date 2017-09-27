
public class Hello{

    public void run(){
        System.out.println("Hello world!");
        int[] v = new int[3];
        
        Exception MyExc;

        try{ // Tente
            v[3] = 10;
        }catch(Exception e){ // Caso ocorra uma exceção
            System.out.println("Deu erro!");
            MyExc = e;
        }finally{ // Faça isso mesmo se um erro ocorrer
            if(MyExc != null)
                System.out.println("Tchau!");
        }
    }

    public static void main(String[] args){

    }

}