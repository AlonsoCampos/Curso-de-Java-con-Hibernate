package Model;
// Generated 9/12/2015 09:55:33 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursales generated by hbm2java
 */
public class Sucursales  implements java.io.Serializable {


     private Integer claveSucursal;
     private String nombre;
     private String descripcion;
     private Set usuarioses = new HashSet(0);

    public Sucursales() {
    }

	
    public Sucursales(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Sucursales(String nombre, String descripcion, Set usuarioses) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.usuarioses = usuarioses;
    }
   
    public Integer getClaveSucursal() {
        return this.claveSucursal;
    }
    
    public void setClaveSucursal(Integer claveSucursal) {
        this.claveSucursal = claveSucursal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set usuarioses) {
        this.usuarioses = usuarioses;
    }




}


