package controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorDeFormatoData implements ValidadorDeFormato {
//    d(smaller): day ,y(samll) : minutes, M(capital): month
    private String datePattern = "dd/MM/yyyy";
    private String strError;

    @Override
    public boolean formatoCorrecto(String strValor) {
        Date date = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
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
