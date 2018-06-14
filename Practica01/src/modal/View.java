package modal;

import java.util.Scanner;

public class View {

    //================================ VARIABLES =============================================
    private String strError;

    private String strValor;


    //================================ SOME WORKING STUFF =============================================
    public String getError(){

        return strError;

    }

    public String getValor(){

        strValor = new Scanner(System.in).nextLine();
        if(strValor == ""){
            strError ="You got to introduce some data to process!";
        }
        return (strValor != null)? strValor : (strError = "Something went worng while fetching data") ;

    }

    public void showMessage(String strMessageToShow){

        System.out.println(strMessageToShow);

    }


}
