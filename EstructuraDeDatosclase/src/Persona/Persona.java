/*
 * Fecha: 22/02/2017 Primer clase hecha, se crea la clase Persona.
 * Clase Persona: plantilla donde se instancia el objeto de tipo persona.
 * Instancia: variablle en la que se almacenan los atributos y metodos de la clase.
 */
package Persona;

/**
 *
 * @author Luisa Maria Perilla C. - 1088034091
 */
public class Persona {
    private String nombre;
    private int cedula=1088034091;
    private String direccion;
    private String telefono;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
