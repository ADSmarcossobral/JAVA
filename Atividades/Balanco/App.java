public class App{
    
    public void run(){
        
        RegistroContabil rc = new RegistroContabil("ACME INC.","001.000.000/0001-01");
        rc.addConta(new PatrimonioLiquido(300, "Capital Inicial"));
        rc.addConta(new Ativo(100, "Caixa"));  
        rc.addConta(new Passivo(200, "Emprestimo"));                   
        rc.addConta(new Ativo(120, "Imoveis"));
        rc.addConta(new Ativo(110, "Aplicacao"));   

        rc.registrarFatoContabil(1, "Integralização e Subscrição do Capital Social", "Capital Inicial", "Caixa", 10000);        
        
        rc.registrarFatoContabil(2, "Compra de Imoveis", "Caixa", "Imoveis", 5000);        
        
        rc.registrarFatoContabil(3, "Venda de Imoveis", "Imoveis", "Aplicacao", 5000);        
        System.out.println(rc);        
        
        
    }
    
    public void run2(){
        
        JSonner jsonner = new JSonner();
        ElementoQuimico o = new ElementoQuimico(8, 16, "Oxigenio");
        Conta capitalInicial = new PatrimonioLiquido(300, "Capital Inicial");
        Conta caixa = new Ativo(100, "Caixa");
        Conta aplicacao = new Ativo(110, "Aplicacao", false);
        Lancamento l = new Lancamento(1, "Integralização e Subscrição do Capital Social", capitalInicial, caixa, 10000);
       
        System.out.println(jsonner.doJSon(capitalInicial));
        System.out.println(jsonner.doJSon(caixa));  
        System.out.println(jsonner.doJSon(aplicacao));          
        System.out.println(jsonner.doJSon(l));
        
        
         System.out.println(jsonner.doJSon(o));
        
    }     
    
    
    public static void main(String[] args){
      App app = new App();
      app.run2();
    }   
    
}
