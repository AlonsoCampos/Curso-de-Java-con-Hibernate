/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HibernateUtil;
import Model.Sucursales;
import Model.Usuarios;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alonso Campos
 */
public class UsuarioController {
    
    public static boolean CreateUsuario(String username, String password, String tipo, 
            String pregunta,String respuesta,Sucursales sucursal)
    {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        sesion.beginTransaction();
        try {
            Usuarios usuario = new Usuarios();
            usuario.setUsername(username);
            usuario.setPassword(password);
            usuario.setTipo(tipo);
            usuario.setPreguntaSeguridad(pregunta);
            usuario.setRespuesta(respuesta);
            usuario.setSucursales(sucursal);
            sesion.save(usuario);
            sesion.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
        
    }
    
    public static List<Sucursales> SucursalesShow(){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        List<Sucursales> sucursales = sesion.createCriteria(Sucursales.class).list();
        return sucursales;
    }
    
    public static Sucursales SucursalShow(int claveSucursal){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Sucursales sucursal = (Sucursales) sesion.createCriteria(Sucursales.class)
                .add(Restrictions.eq("claveSucursal", claveSucursal)).uniqueResult();
        return sucursal;
    }
    
    
}
