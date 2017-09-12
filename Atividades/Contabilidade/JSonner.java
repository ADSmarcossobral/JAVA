
public class JSonner{

    public String doJSon(JSonable obj){
        String rep = "{\n";
        for(int iCont = 0; iCont < obj.getCampos().length; iCont++){
            rep = rep + "\t\"" + obj.getCampos()[iCont].getNome() + "\" : ";
            if(obj.getTiposAtributos()[iCont] == JSonnable.STRING)
                rep = rep + "\"" + obj.getCampos()[iCont].getValor() + "\"";
            else


        }
        return rep;
    }

}
