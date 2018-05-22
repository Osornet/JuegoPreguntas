/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.juegoPreguntas.modelo.persistencia.daos.hibernate.HibernateHelper;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author JAVIER
 */
public class PruebaImagenes {

 public static void main(String[] args){
     try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/juego", "root", "1234");
            String sql = "Select imagen from imagen";
            ImageIcon icono = null;
            InputStream in = null;
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                in = rs.getBinaryStream("imagen");
                try {
                    BufferedImage bu = ImageIO.read(in);
                    icono = new ImageIcon(bu);
                    Image img = icono.getImage();
                    
                } catch (IOException ex) {
                    Logger.getLogger(PruebaImagenes.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }

        } catch (SQLException ex) {
            Logger.getLogger(PruebaImagenes.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    public void obtenerImagen() {
        

    }

}
