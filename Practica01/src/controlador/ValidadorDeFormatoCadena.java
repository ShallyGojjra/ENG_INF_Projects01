package controlador;

public class ValidadorDeFormatoCadena implements ValidadorDeFormato {

    private String strError;

    @Override
    public boolean formatoCorrecto(String strValor) {
        return true;
    }

    @Override
    public String getError() {

        strError =  "Must be a string to validate.";
        return strError;
    }
}
