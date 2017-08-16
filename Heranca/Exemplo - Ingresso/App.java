
public class App{

    public void run(){
 
        Ingresso[] ingressos = new Ingresso[4];
 
        ingressos[0] = new Ingresso("A01", 100);
        ingressos[1] = new Meia("A02", 100, Meia.ESTUDANTE);
        ingressos[2] = new Vip("A03", 100);
        ingressos[3] = new PrimeiroLote("A04", 100);

        for(Ingresso ingresso : ingressos)
            System.out.println(ingresso);
       
    }

    public static void main(String[] args){
        (new App()).run();
    }

}