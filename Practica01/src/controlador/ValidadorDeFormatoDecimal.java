package controlador;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class ValidadorDeFormatoDecimal implements ValidadorDeFormato {

    private static final int MAX_INTEGER_LIMIT = 8;
    private static final String SPLITTING_DELIMITER = ",";
    private static final int MAX_DECIMAL_LIMIT = 2;
    private String strError;

    @Override
    public boolean formatoCorrecto(String strValor) {

        boolean isInCorrectFormat;
        try {

            String[] parts = strValor.split(SPLITTING_DELIMITER);
            isInCorrectFormat = (parts[0].length() <= MAX_INTEGER_LIMIT);
            isInCorrectFormat = (isInCorrectFormat) && (parts[1].length() <= MAX_DECIMAL_LIMIT);
            Double.parseDouble(parts[0]+"."+parts[1]);

            if (!isInCorrectFormat) {
                strError = "Something is wrong in the format you processed, must be 12345678.12";
            }
        }
        catch (Exception e){
            isInCorrectFormat = false;
        }
        return isInCorrectFormat ;

    }

    @Override
    public String getError() {
        return strError;
    }
}
