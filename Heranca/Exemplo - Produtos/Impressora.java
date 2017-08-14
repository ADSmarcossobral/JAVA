
public class Impressora extends ItemVenda{
    private int resolucao;
    private boolean colorida;

    public int getResolucao(){
        return this.resolucao;
    }

    public void setResolucao(int resolucao){
        this.resolucao = resolucao;
    }

    public boolean getColorida(){
        return this.colorida;
    }

    public void setColorida(boolean colorida){
        this.colorida = colorida;
    }

}