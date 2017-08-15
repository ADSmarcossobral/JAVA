
public class App{

    public void run(){
        Ingresso ing1 = new Ingresso("A01", 100);
        Meia ing2 = new Meia("A02", 100);
        Vip ing3 = new Vip("A03", 100);
        PrimeiroLote ing4 = new PrimeiroLote("A04", 100);

        System.out.println(ing1.getCadeira() + "--" + ing1.getPreco());
        System.out.println(ing2.getCadeira() + "--" + ing2.getPreco());
        System.out.println(ing3.getCadeira() + "--" + ing3.getPreco());
        System.out.println(ing4.getCadeira() + "--" + ing4.getPreco());

    }

    public static void main(String[] args){
        (new App()).run();
    }

}