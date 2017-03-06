
package com.sgsvp.controladores;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author ariquelme
 */




public abstract class BD {
    
    public static Connection getConnection() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sgsvp"; //3306
            String user = "root";
            String password = "";
            cn= DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            cn=null;
            System.out.println("Error no se puede cargar el driver:" + e.getMessage());
        } catch (SQLException e) {
            cn=null;
            if(e.getErrorCode() == 0)
            {
                JOptionPane.showMessageDialog(null, "El servidor de base de datos no responde.\n"
                                                    + "Verifique que el servidor de base de datos este activo.\n"
                                                    + "También Verifique que exista la base de datos sgsvp", 
                                                    "Error: Coneccion Fallida.", JOptionPane.ERROR_MESSAGE);
                System.out.println("Error , base sin iniciar:" + e.getMessage());
            }
        }
        return cn;
    }
    
}
