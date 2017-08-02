
public class App{
    
    public void run(){
        ElementoQuimico oxigenio1 = new ElementoQuimico(8, 16, "Oxigenio");
        ElementoQuimico oxigenio2 = new ElementoQuimico(8, 16, "Oxigenio");
        ElementoQuimico oxigenio3 = new ElementoQuimico(8, 16, "Oxigenio");
        ElementoQuimico hidrogenio1 = new ElementoQuimico(1, 2, "Hidrogenio");
        ElementoQuimico hidrogenio2 = new ElementoQuimico(1, 2, "Hidrogenio");
        ElementoQuimico hidrogenio3 = new ElementoQuimico(1, 2, "Hidrogenio");
        ElementoQuimico hidrogenio4 = new ElementoQuimico(1, 2, "Hidrogenio");
        ElementoQuimico enxofre1 = new ElementoQuimico(16, 32, "Enxofre");
        
        Molecula h2o = new Molecula();
        Molecula h2o2 = new Molecula();
        Molecula h2so4 = new Molecula();

        h2o.addAtomo(oxigenio1);
        h2o.addAtomo(hidrogenio1);
        h2o.addAtomo(hidrogenio2);

    }

    public static void main(String args[]){
        App app = new App();
        App.run();
    }

}