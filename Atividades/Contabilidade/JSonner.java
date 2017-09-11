
public class JSonner{

    public String doJSon(JSonnable obj){
        String rep = "{\n";
        for(int iCont = 0; iCont < obj.getNomeAtributos().lenght; iCont++){
            rep = rep + "\t\"" + obj.getNomeAtributos()[iCont] + "\" :";
        }
        return rep;
    }

}
