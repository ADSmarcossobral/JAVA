public enum Tipo{
    VIP(1), MEIA(2), NORMAL(3);

    private final int tp;
    Tipo(int tp){
        this.tp = tp;
    }

    public String toString(){
        switch(this.tp){
            case VIP: return "VIP";
            case MEIA: return "MEIA";
            case NORMAL: return "NORMAL";
        }
    }

}