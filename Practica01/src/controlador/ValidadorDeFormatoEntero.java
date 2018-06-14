package controlador;

public class ValidadorDeFormatoEntero implements ValidadorDeFormato {

    private static final int MAX_INTEGER_LIMIT = 10;
    private static String strError;

    @Override
    public boolean formatoCorrecto(String strValor) {

        boolean isInCorrectFormat;
        try {
            isInCorrectFormat = (strValor.length() <= MAX_INTEGER_LIMIT);
            Integer.parseInt(strValor);
            if (!isInCorrectFormat) {
                strError = "Something is wrong in the format you processed, must be 1234567890";
            }
        }
        catch (Exception e){
            isInCorrectFormat = false;
        }
        return isInCorrectFormat;

    }

    @Override
    public String getError() {
        return strError;
    }
}
