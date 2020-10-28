package exceptions;

/**
 * @author Lorena Cáceres Manuel
 * @author Fredy Vargas Flores
 */
public class ErrorBDException extends Exception{

    public ErrorBDException() {
        super();
    }
    
    @Override
    public String getMessage(){
         return "Error BD"; 
    }
}
