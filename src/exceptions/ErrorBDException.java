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
public class ErrorBDException extends Exception  {
    public ErrorBDException(){
        super("Error en la Base de Datos");
    }
    
}
