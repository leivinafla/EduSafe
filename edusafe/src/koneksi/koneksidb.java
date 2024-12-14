/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksidb {
    Connection cn;
    public static Connection BukaKoneksi () {
    try {
        String url ="jdbc:mysql://localhost:3306/leivina_fatha_afilia_166732";
        String user ="root";
        String pass="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        Connection cn = DriverManager.getConnection(url, user, pass);
        return cn;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        
        return null;
    }
}
}


