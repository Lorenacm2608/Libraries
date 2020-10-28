package exceptions;

/**
 * @author Lorena Cáceres Manuel
 * @author Fredy Vargas Flores
 */
public class ErrorServerException extends Exception {

    public ErrorServerException() {
        super();
    }
    
     @Override
    public String getMessage(){
         return "Error desde el servidor"; 
    }
    
}
