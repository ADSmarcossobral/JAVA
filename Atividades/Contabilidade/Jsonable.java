
public interface Jsonable{

    public static final int INT = 0;
    public static final int REAL = 1;
    public static final int STRING = 2;
    public static final int BOOLEAN = 3;

    public String[] getNomeAtributos();
    public String[] getValoresAtributos();
    public int[] getTiposAtributos();

}