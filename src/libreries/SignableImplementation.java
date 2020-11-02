package libreries;

import libreries.Signable;
import libreries.Message;
import libreries.Tipo;
import libreries.Usuario;
import exceptions.AutenticacionFallidaException;
import exceptions.EmailExistenteException;
import exceptions.EmailNoExisteException;
import exceptions.ErrorBDException;
import exceptions.ErrorServerException;
import exceptions.UsuarioExistenteException;
import exceptions.UsuarioNoEncontradoException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Fredy Vargas Flores
 * @author Lorena Cáceres Manuel
 */
public class SignableImplementation implements Signable {

    // private ResourceBundle rb = ResourceBundle.getBundle("controlDB.Configuration");
    private Socket socket;
    private Message message;
    //  int port = Integer.parseInt(rb.getString("port"));

    @Override
    public Usuario signUp(Usuario u) throws EmailExistenteException, ErrorBDException, ErrorServerException, UsuarioExistenteException{
        try {
            // socket = new Socket(rb.getString("host"), port);
            socket = new Socket("127.0.0.1", 5555);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            message = new Message(u, Tipo.SIGNUP);
            oos.writeObject(message);
            System.out.println("MENSAJE ESCRITO");
            try {
                message = (Message) ois.readObject();
                System.out.println(message.getUsuario().getUsuario() + " Este usuarios a vuelto");
                switch(message.getTipoMensaje()){
                    case EMAIL_EXISTENTE:
                        throw new EmailExistenteException();
                    case ERROR_BASE_DE_DATOS:
                        throw new ErrorBDException();
                    case ERROR_SERVIDOR:
                        throw new ErrorServerException();
                    case USUARIO_EXISTENTE:
                        throw new UsuarioExistenteException();
                    case OK:
                        return message.getUsuario();
                }
            } catch (ClassNotFoundException ex) {
                // Logger.getLogger(Libreries.SignableImplementationCliente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ois.close();
                oos.close();
                socket.close();
            }
        } catch (IOException ex) {
        }
        return null;

    }

    @Override
    public Usuario logIn(Usuario u) throws AutenticacionFallidaException, ErrorBDException, ErrorServerException, UsuarioNoEncontradoException {
        try {
            //socket = new Socket(rb.getString("host"), port);
            socket = new Socket("127.0.0.1", 5555);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            message = new Message(u, Tipo.LOGIN);
            oos.writeObject(message);
            System.out.println("hasta");
            try {
                // Message  sms = (Message) ois.readObject();
                message = (Message) ois.readObject();
                System.out.println(message.getUsuario().getUsuario() + " Este usuarios a vuelto");
                switch(message.getTipoMensaje()){
                    case CONTRASENA_ERRONEA:
                        throw new AutenticacionFallidaException();
                    case ERROR_BASE_DE_DATOS:
                        throw new ErrorBDException();
                    case ERROR_SERVIDOR:
                        throw new ErrorServerException();
                    case USUARIO_NO_EXISTE:
                        throw new UsuarioNoEncontradoException();
                    case OK:
                        return message.getUsuario();
                }
            } catch (ClassNotFoundException ex) {
                // Logger.getLogger(Libreries.SignableImplementationCliente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                ois.close();
                oos.close();
                socket.close();
            }
        } catch (IOException ex) {
           
        }
        return null;

    }
}
