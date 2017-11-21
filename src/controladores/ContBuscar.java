package controladores;

import DAO.Datos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.Clientes;
import visual.PrinClientes;
import visual.Principal;


public class ContBuscar implements MouseListener{
    private JTextField txtEmail,txtDni;
    
    
    public ContBuscar(JTextField txtEmail, JTextField txtDni) {
      this.txtDni = txtDni;
      this.txtEmail = txtEmail;
    }

   

    @Override
    public void mouseClicked(MouseEvent e) {
       Datos datosDAO = new Datos();  
       Clientes data =null;   
       try {
           if (txtEmail.getText().equals("")){
               System.out.println("dni loco");
               txtEmail.setVisible(false);
             data = datosDAO.Buscar(null,txtDni.getText());
               if(data==null){
                   System.out.println("no hay nadita amigo");
                   
               }
               else{
                   PrinClientes priCli = new PrinClientes();
                     
                    System.out.println(data.getNombre());
                    System.out.println(data.getApellido());
                    System.out.println(data.getDni());
                   System.out.println(data.getEmail());
                   
                   
                   
               }
               
           }   
            else
               if(txtDni.getText().equals(0)){
               txtDni.setVisible(false);
               System.out.println("email loco");
               datosDAO.Buscar(txtEmail.getText(),null);
               }
           } catch (SQLException ex) {
            Logger.getLogger(ContBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
           JOptionPane.showMessageDialog(null, "Conexion Establecida");
     
       }
        
        
    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
    
    
    
}
