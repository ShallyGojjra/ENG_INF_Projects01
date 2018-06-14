package controlador;

public interface ValidadorDeFormato {
    
    public boolean formatoCorrecto(String strValor);
    
    public String getError();
}
