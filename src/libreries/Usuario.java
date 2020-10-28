package libreries;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author Nadir Essadi
 */
public class Usuario implements Serializable{
    /** Aqui es donde creamos nuestros atributos de la clase usuario pero en este caso son "private"  ya que solo se usan en esta clase **/
    private Integer id;
    private String usuario;
    private String email;
    private String nombre;
    private Estado estado;
    private Privilegio privilegio;
    private String contrasenia;
    private Date ultimoAcceso;
    private Date UltimaContrasena;
    
    
    /** Constructor para crear un usuario vacio */ 
    public Usuario(String usuario){
        this.usuario=usuario;
        this.privilegio=privilegio.USER;
        this.estado=estado.ENABLE;
    }

    public Usuario(Integer id, String usuario, String email, String nombre, Estado estado, Privilegio privilegio, String contrasenia, Date ultimoAcceso, Date UltimaContrasenia) {
        this.id = id;
        this.usuario = usuario;
        this.email = email;
        this.nombre = nombre;
        this.estado = estado;
        this.privilegio = privilegio;
        this.contrasenia = contrasenia;
        this.ultimoAcceso = ultimoAcceso;
        this.UltimaContrasena = UltimaContrasenia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Privilegio getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(Privilegio privilegio) {
        this.privilegio = privilegio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public Date getUltimaContrasenia() {
        return UltimaContrasena;
    }

    public void setUltimaContrasenia(Date UltimaContrasena) {
        this.UltimaContrasena = UltimaContrasena;
    }
    /** Creamos el setDatos donde vamos a observar los datos del usuario  **/
    public void getDatos(){
        System.out.println("El id "+id);
        System.out.println("El usuario "+usuario);
        System.out.println("El email "+email);
        System.out.println("El nombre "+nombre);
        
        
        
        System.out.println("La contraseña es "+contrasenia);
        System.out.println("El ultimo acceso ha sido el "+ultimoAcceso);
        System.out.println("La ultima contraseña ha sido "+UltimaContrasena);
    }
     
}