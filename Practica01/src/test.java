import controlador.ValidadorDeFormatoDecimal;
import controlador.ValidadorDeFormatoEntero;
import controlador.ValidadorDeFormatoHora;
import vista.VistaSimple;

public class test {
    
    public static void main ( String args[] ) {

        System.out.println(new ValidadorDeFormatoDecimal().formatoCorrecto("12345,12"));
        VistaSimple vs = new VistaSimple();
//        PLEASE HAVE A LOOK AT THE ENUM FOR THE DATA FORMAT SUPPORTED IN THE PROCESSES
        if ( vs.PedirValor( "integer" ) ) {
            System.out.println( "El valor introducido ( " + vs.GetValor() + " ) es correcto!" );
        }
        else {
            System.out.println( "Error: " + vs.GetError() );
        }

    }
    
}
