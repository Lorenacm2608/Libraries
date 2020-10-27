/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import enumeraciones.Privilegio;
import static enumeraciones.Privilegio.USER;
import enumeraciones.Status;
import static enumeraciones.Status.ENABLE;
import java.util.Date;

/**
 *
 * @author Nadir Essadi
 */
public class Usuario {
    /** Aqui es donde creamos nuestros atributos de la clase usuario pero en este caso son "private"  ya que solo se usan en esta clase **/
    private int id;
    private String usuario;
    private String email;
    private String nombre;
    private Status estado;
    private Privilegio privilegio;
    private String contrasenia;
    private Date ultimoAcceso;
    private String UltimaContrasenia;
    
    /** Creamos el setDatos donde vamos a meter los datos del usuario que hay que meter manualmente **/
    public void setDatos(){
        
        System.out.println("Introduce el usuario");
        usuario=utilidades.Utilidades.introducirCadena();
        System.out.println("Introduce el email");
        email=utilidades.Utilidades.introducirCadena();
        System.out.println("Introduce el nombre");
        nombre=utilidades.Utilidades.introducirCadena();
        System.out.println("Introduce la contraseña");
        contrasenia=utilidades.Utilidades.introducirCadena();      
    }
    /** Creamos el setDatos donde vamos a observar los datos del usuario  **/
    public void getDatos(){
        System.out.println("El id "+id);
        System.out.println("El usuario "+usuario);
        System.out.println("El email "+email);
        System.out.println("El nombre "+nombre);
        
        if(estado==Status.ENABLE){
        System.out.println("El estado es activado");
        }else{
        System.out.println("El estado es desactivado");    
        }
        if(privilegio==Privilegio.ADMIN){
        System.out.println("El privilegio es admin");
        }else{
        System.out.println("El privilegio es user");    
        }
        
        System.out.println("La contraseña es "+contrasenia);
        System.out.println("El ultimo acceso ha sido el "+ultimoAcceso);
        System.out.println("La ultima contraseña ha sido "+UltimaContrasenia);
    }
    /** Constructor para crear un usuario vacio */ 
    public Usuario(){
        this.estado=ENABLE;
        this.privilegio=USER;
    }
    
    /** Aqui hemos generado todos los setters y getters de los atributos de la clase Usuario */
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
    
    public String getcontrasenia() {
        return contrasenia;
    }

    public void setcontrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getultimoAcceso() {
        return ultimoAcceso;
    }

    public void setultimoAcceso(Date ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    public String getUltimaContrasenia() {
        return UltimaContrasenia;
    }

    public void setUltimaContrasenia(String UltimaContrasenia) {
        this.UltimaContrasenia = UltimaContrasenia;
    }  
}
