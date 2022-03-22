package com.mycompany.logindsnuevo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class VerificadorArchivo {

    public boolean verificarExistenciaArchivo(String ruta, String nombre) {
        boolean bandera = false;

        File archivo = new File(ruta);

        if (archivo.getName().equals("usuarios.txt")) {

            bandera = true;

        }
        return bandera;
    }

    public boolean validarEstructuraArchivo(String ruta, String nombre) {
        boolean bandera = false;

        File archivo = new File(ruta);
        FileReader fr = null;
        BufferedReader br = null;
        int columnas = 0;
        try {

            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {

                String arreglo[] = linea.split(" ");
                columnas = arreglo.length;
                

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo vacio");
            e.printStackTrace();
            // TODO: handle exception
        }

        if (columnas == 2) {
            
            bandera=true;

        } else {
            JOptionPane.showMessageDialog(null, "Estructura incorrecta");
        }

        return bandera;
    }

}
