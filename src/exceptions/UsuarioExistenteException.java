package exceptions;

/**
 * @author Lorena Cáceres Manuel
 * @author Fredy Vargas Flores
 */
public class UsuarioExistenteException extends Exception {

    public UsuarioExistenteException() {
        super();
    }
    
    @Override
    public String getMessage(){
         return "Usuario existente"; 
    }

   
    
    
}
