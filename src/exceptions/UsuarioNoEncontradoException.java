package exceptions;

/**
 * @author Lorena Cáceres Manuel
 * @author Fredy Vargas Flores
 */
public class UsuarioNoEncontradoException extends Exception {

    public UsuarioNoEncontradoException() {
        super();
    }
     @Override
    public String getMessage(){
         return "Usuario no encontrado"; 
    }
}
