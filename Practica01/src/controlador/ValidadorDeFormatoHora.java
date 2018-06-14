package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorDeFormatoHora implements ValidadorDeFormato {
    //    H(capita;) :  Hours ,m(samll) : minutes
    private String datePattern = "HH:mm";
    private String strError;

    @Override
    public boolean formatoCorrecto(String strValor) {
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
            simpleDateFormat.setLenient(false);
            date = simpleDateFormat.parse(strValor);
        } catch (Exception e) {
//            AS OF THIS CLASS IS A CONTROLER MUST NOT INTERACT WITH USER
            strError = e.getMessage();
        }

        return date != null;
    }

    @Override
    public String getError() {
        return strError;

    }
}