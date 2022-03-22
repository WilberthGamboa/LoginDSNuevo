package com.mycompany.logindsnuevo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

import javax.sound.sampled.Line;
import javax.swing.JOptionPane;

public class AdministradorUsuarios {
    private int contador;

    private LinkedList<Usuario> listaUsuarios;


    public AdministradorUsuarios(){
        this.listaUsuarios = new LinkedList<Usuario>();
        this.contador=0;
    }



    public void administradorUsuarios(){
        File archivo = new File("usuarios.txt");
        FileReader fr = null;
        BufferedReader br = null;
     
        try {

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                
                String arreglo[] = linea.split(" ");
                Usuario usuario = new Usuario(arreglo[0], arreglo[1]);
                this.listaUsuarios.add(usuario);
           
                

            }

        } catch (Exception e) {
 
            e.printStackTrace();
            // TODO: handle exception
        }



        


    }
    


    public boolean verificarUsuario(String usuario, String contrasenia){
        boolean bandera = true;
        administradorUsuarios();

        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getLogin().equals(usuario)&&listaUsuarios.get(i).getContrasenia().equals(contrasenia)) {
                JOptionPane.showMessageDialog(null, "Usuario correcta");
                bandera=false;
            }
        }
        contador++;
   

        if (contador==3) {

             JOptionPane.showMessageDialog(null, "Error 3 intentos, programa cerrará");
             System.exit(0);
     
            
        }

        
        

        return bandera;

    }
    


    
}
