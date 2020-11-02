package libreries;

import exceptions.AutenticacionFallidaException;
import exceptions.EmailExistenteException;
import exceptions.EmailNoExisteException;
import exceptions.ErrorBDException;
import exceptions.ErrorServerException;
import exceptions.UsuarioExistenteException;
import exceptions.UsuarioNoEncontradoException;
import libreries.Usuario;
 
/**
 * @author Fredy Vargas Flores
 * @author Lorena Cáceres Manuel
 */
public interface Signable {

    public Usuario signUp (Usuario usuario) throws EmailExistenteException, ErrorBDException, ErrorServerException, UsuarioExistenteException; 
    public Usuario logIn (Usuario usuario) throws AutenticacionFallidaException, ErrorBDException, ErrorServerException, UsuarioNoEncontradoException;
 
}