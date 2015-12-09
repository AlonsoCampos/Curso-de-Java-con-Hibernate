/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.HibernateUtil;
import Model.Usuarios;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Alonso Campos
 */
public class UsuarioController {
    
    
    public static boolean Login (String username, String password){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        
        Usuarios usuario = (Usuarios) sesion.createCriteria(Usuarios.class)
                .add(Restrictions.eq("username", username)).uniqueResult();
        
        try {
            if(usuario!=null){
            
                if(usuario.getPassword().equals(password)){
                    JOptionPane.showMessageDialog(null, "Bienvenido usuario "+usuario.getUsername());
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Error la contraseña ingresada "
                            + "no corresponde con el usuario", "" ,JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "El usuario "+usuario.getUsername()+
                        " no existe", "" ,JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El usuario "+usuario.getUsername()+
                        " no existe", "" ,JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
            return false;
        }
    }
    
    
    
}
