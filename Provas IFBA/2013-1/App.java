
public class App{
    
    public void run(){
        ElementoQuimico oxigenio1 = new ElementoQuimico(8, 16, "Oxigenio");
        ElementoQuimico oxigenio2 = new ElementoQuimico(8, 16, "Oxigenio");
        ElementoQuimico oxigenio3 = new ElementoQuimico(8, 16, "Oxigenio");
        system.out.println(oxigenio1);
    }

    public static void main(String args[]){
        App app = new App();
        App.run();
    }

}