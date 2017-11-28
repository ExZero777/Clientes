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



public class ContBuscar implements MouseListener{
    private JTextField txtEmail,txtDni;
    
    
    public ContBuscar(JTextField txtEmail, JTextField txtDni) {
      this.txtDni = txtDni;
      this.txtEmail = txtEmail;
    }

   

    @Override
    public void mouseClicked(MouseEvent e) {
       Datos datosDAO = new Datos();  
       Clientes data = null;   
       try {
           if (txtEmail.getText().equals("")){
               System.out.println("dni loco");
               txtEmail.setVisible(false);
               data = datosDAO.Buscar(null,txtDni.getText());
               
               if(data==null){
                   System.out.println("no hay nadita amigo");
                   PrinClientes priCli =   new PrinClientes(data);
               }
               else{
                
                  PrinClientes priCli =   new PrinClientes(data);
                  
                    System.out.println(data.getNombre());
                    System.out.println(data.getApellido());
                    System.out.println(data.getDni());
                    System.out.println(data.getEmail());   
                   
               }
               
           }   
            else
               if(txtDni.getText().equals("") ){
               txtDni.setVisible(false);
               System.out.println("email loco");
              data = datosDAO.Buscar(txtEmail.getText(),null);
               if(data==null){
                   System.out.println("no hay nadita amigo");
                   
               }
               else{
                
                  PrinClientes priCli =   new PrinClientes(data);
                  
                    System.out.println(data.getNombre());
                    System.out.println(data.getApellido());
                    System.out.println(data.getDni());
                   System.out.println(data.getEmail());   
                   
                   
               }
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
