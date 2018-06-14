package vista;

public interface IVistaSimple {
    
    public String GetError();
    public Object GetValor();
    
    public boolean PedirValor( String mensaje, String strTipoDeDato );
    public boolean PedirValor( String strTipoDeDato );    
    
}
