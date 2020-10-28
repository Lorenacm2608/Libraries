package exceptions;

/**
 * @author Lorena Cáceres Manuel
 * @author Fredy Vargas Flores
 */
public class AutenticacionFallidaException extends Exception {

    public AutenticacionFallidaException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Autenticación fallida";
    }
}
