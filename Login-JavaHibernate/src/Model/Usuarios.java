package Model;
// Generated 9/12/2015 09:55:33 AM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer clave;
     private Sucursales sucursales;
     private String username;
     private String password;
     private String tipo;
     private String preguntaSeguridad;
     private String respuesta;

    public Usuarios() {
    }

    public Usuarios(Sucursales sucursales, String username, String password, String tipo, String preguntaSeguridad, String respuesta) {
       this.sucursales = sucursales;
       this.username = username;
       this.password = password;
       this.tipo = tipo;
       this.preguntaSeguridad = preguntaSeguridad;
       this.respuesta = respuesta;
    }
   
    public Integer getClave() {
        return this.clave;
    }
    
    public void setClave(Integer clave) {
        this.clave = clave;
    }
    public Sucursales getSucursales() {
        return this.sucursales;
    }
    
    public void setSucursales(Sucursales sucursales) {
        this.sucursales = sucursales;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getPreguntaSeguridad() {
        return this.preguntaSeguridad;
    }
    
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
    public String getRespuesta() {
        return this.respuesta;
    }
    
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }




}


