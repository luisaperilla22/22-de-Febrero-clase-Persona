/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatosclase;

import Persona.Persona;

/**
 *
 * @author Luisa Maria Perilla C. - 1088034091
 */
public class EstructuraDeDatosclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona luisa = new Persona();
        luisa.setNombre("Luisa Perilla");
        luisa.setDireccion("Zaguan de las Villas Etapa 1");
        luisa.setTelefono("3500873");
        System.out.println("        Hola Profe    ");
        System.out.println(" Nombre: " + luisa.getNombre() +
                           "\n Cedula: " + luisa.getCedula() +
                           "\n Direccion: " + luisa.getDireccion() + 
                           "\n Telefono: " + luisa.getTelefono());
    }
    
}
