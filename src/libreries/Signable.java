package libreries;

import exceptions.AutenticacionFallidaException;
import exceptions.ErrorBDException;
import exceptions.ErrorServerException;
import exceptions.UsuarioExistenteException;
import exceptions.UsuarioNoEncontradoException;
 
/**
 * @author Fredy Vargas Flores
 * @author Lorena Cáceres Manuel
 */
public interface Signable {
    
    public Usuario signUp (Usuario u) throws UsuarioExistenteException, ErrorBDException, ErrorServerException; 
    public Usuario logIn (Usuario u) throws AutenticacionFallidaException, ErrorBDException, ErrorServerException, UsuarioNoEncontradoException; 
 
}
