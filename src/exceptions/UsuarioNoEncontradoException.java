package exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class UsuarioNoEncontradoException extends Exception {
    public UsuarioNoEncontradoException(){
        super("El usuario introducido no se ha encontrado");
    }
}
