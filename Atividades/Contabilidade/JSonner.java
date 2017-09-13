
public class JSonner{

    public String doJSon(JSonnable obj){
        String rep = "{\n";
        for(int iCont = 0; iCont < obj.getCampos().length; iCont++){
            rep = rep + "\t\"" + obj.getCampos()[iCont].getNome() + "\" : ";
            if(obj.geCampos()[iCont].getTipo() == JSonnable.STRING)
                rep = rep + "\"" + obj.getCampos()[iCont].getValor() + "\"";
            else
                rep = rep + obj.getCampos()[iCont].getValor();
            if(iCont < obj.geCampos().length - 1)
                rep += ",";
            rep += "\n";
        }
        return rep + "}";
    }

}
