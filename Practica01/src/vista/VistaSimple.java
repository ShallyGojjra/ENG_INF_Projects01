package vista;

import controlador.*;
import modal.View;

public class VistaSimple implements IVistaSimple {
    
    private String strValor;
    private String strError;    
    
    public VistaSimple() {
        this.borrarDatos();
    }
    
    @Override
    public Object GetValor() {
        return this.strValor;
    }
        
    @Override
    public String GetError() {
        return this.strError;
    }
    
    @Override
    public boolean PedirValor( String strTipoDeDato ) {
        return this.PedirValor( "Introduce valor: ", strTipoDeDato );
    }    
    
    @Override
    public boolean PedirValor( String strMensaje, String strTipoDeDato ) {
        this.borrarDatos();
        boolean bExito = false;

        View view = new View();
        view.showMessage(strMensaje);
        String strAuxValor = view.getValor();

        if ( strAuxValor.equals( "" ) ) {
            this.strError = view.getError();
        }        
        else {
            ValidadorDeFormato vdfValidador;
            EFormatSupport eFormatSupport = EFormatSupport.valueOf(strTipoDeDato.toUpperCase());
            switch (eFormatSupport){
                case DATE: vdfValidador = new ValidadorDeFormatoData();
                    break;
                case INTEGER: vdfValidador = new ValidadorDeFormatoEntero();
                    break;
                case DECIMAL:vdfValidador = new ValidadorDeFormatoDecimal();
                    break;
                case STRING: vdfValidador = new ValidadorDeFormatoCadena();
                    break;
                case TIME: vdfValidador = new ValidadorDeFormatoHora();
                    break;
                default: vdfValidador = null;
                    break;
            }
            if ( vdfValidador.formatoCorrecto( strAuxValor) ) {
                this.strValor = strAuxValor;
                bExito = true;
            }
            else {
                this.strError = vdfValidador.getError();
            }
        }                
        
        return bExito;
    }
    
    private void borrarDatos( ) {
        this.strValor = "";    
        this.strError = "";
    }
}

