package com.mycompany.logindsnuevo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sistema {

  private VerificadorArchivo verificadorArchivo;
  private AdministradorUsuarios administradorUsuarios;

  public Sistema(){
    verificadorArchivo = new VerificadorArchivo();
    administradorUsuarios = new AdministradorUsuarios();

  }
  
  // Metodos

  public boolean verificarArchivoUsuario() {

    String ruta = "usuarios.txt";
    String fileName = "usuarios.txt";
    boolean verificadorExistenciaArchivo = false;
    boolean validarEstructuraArchivo = false;
    boolean verificarArchivoUsuario = false;

    verificadorExistenciaArchivo = verificadorArchivo.verificarExistenciaArchivo(ruta, fileName);

    if (verificadorExistenciaArchivo) {
      JOptionPane.showMessageDialog(null, "Archivo encontrado");

      validarEstructuraArchivo = verificadorArchivo.validarEstructuraArchivo(ruta, fileName);

      if (validarEstructuraArchivo) {
        JOptionPane.showMessageDialog(null, "Estructura Correcta");
        verificarArchivoUsuario=true;

      } else {

      }

    } else {
      alertaArchivoUsuariosNoExiste();
    }

    /*
     * try {
     * File myObj = new File(ruta);
     * Scanner myReader = new Scanner(myObj);
     * while (myReader.hasNextLine()) {
     * String data = myReader.nextLine();
     * // System.out.println(data);
     * }
     * myReader.close();
     * } catch (FileNotFoundException e) {
     * System.out.println("An error occurred.");
     * e.printStackTrace();
     * }
     */

    // verificadorArchivo.validarEstructuraArchivo(ruta, nombre);

    return verificarArchivoUsuario;
  }

  public void mostrarInterfazUsuario() {

    /*
     * try (Scanner sc = new Scanner(System.in)) {
     * 
     * 
     * 
     * // Use sc as you need
     * 
     * } catch (Exception e) {
     * 
     * // handle exception
     * 
     * }
     * if (verificadorArchivo.verificarExistenciaArchivo(ruta, nombre)) {
     * verificarArchivoUsuario(ruta,nombre);
     * 
     * } else {
     * 
     * }
     * 
     */

  }

  public void ingresarUsuarioContra() {
    String usuario=null;
    String contrasenia=null;

    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Leer usuario");
        usuario = sc.nextLine();
        System.out.println("Leer contraseña");
        contrasenia = sc.nextLine();
        /*
      try (Scanner sc = new Scanner(System.in)){
        
        
       
        
      } catch (Exception e) {
        
         // handle exception
       
        }
        */
  
  
    } while (administradorUsuarios.verificarUsuario(usuario, contrasenia));
    
    
  }

  public void verificarArchivoContra() {

  }

  public void mostrarMenu() {

  }

  public void alertaArchivoUsuariosNoExiste() {
    JOptionPane.showMessageDialog(null, "Archivo no encontrado, el programa se cerrará");
    System.exit(0);
  }

  public static void main(String[] args) {
    boolean verificadorArchivo=false;
    Sistema sistema = new Sistema();
    verificadorArchivo =sistema.verificarArchivoUsuario();
    if (verificadorArchivo) {
      sistema.ingresarUsuarioContra();
      
    } else {
      
    }
    
    // sistema.mostrarInterfazUsuario();

  }

}
