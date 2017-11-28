package controladores;

import DAO.Datos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import models.Clientes;

public class ContGrabar implements MouseListener {
    JTextField txtNom,txtApe,txtDni,txtEmail,txtTel,txtCel,txtCalle,txtAlt,txtPiDto;
    
    
    public ContGrabar(JTextField txtNom, JTextField txtApe, JTextField txtDni, JTextField txtEmail, JTextField txtTel, JTextField txtCel, JTextField txtCalle, JTextField txtAlt, JTextField txtPiDto) {
      this.txtNom = txtNom;
      this.txtApe = txtApe;
      this.txtDni = txtDni;
      this.txtEmail = txtEmail;
      this.txtTel = txtTel;
      this.txtCel = txtCel;
      this.txtCalle = txtCalle;
      this.txtAlt = txtAlt;
      this.txtPiDto = txtPiDto;   
    }

      
    @Override
    public void mouseClicked(MouseEvent e) {
       

        Datos daoDatos = new Datos();    
        
        
        try {
            daoDatos.Agregar(txtNom,txtApe,txtDni,txtEmail,txtTel,txtCel,txtCalle,txtAlt,txtPiDto);
        } catch (SQLException ex) {
            Logger.getLogger(ContGrabar.class.getName()).log(Level.SEVERE, null, ex);
        }
        

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
