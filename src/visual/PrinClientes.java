package visual;

import controladores.ContCan;
import controladores.ContGrabar;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import models.Clientes;


public class PrinClientes extends JFrame {
    private JButton grabar = new JButton("Grabar");
    private JButton cancelar = new JButton("Cancelar");
    
    private JTextField txtNom = new JTextField("");
    private JLabel lblNom = new JLabel("Nombre:");
    private JTextField txtApe = new JTextField("");
    private JLabel lblApe = new JLabel("Apellido:");
    private JTextField txtDni = new JTextField("");
    private JLabel lblDni = new JLabel("DNI:");
    private JTextField txtEmail = new JTextField("");
    private JLabel lblEmail = new JLabel("Email");
    private JTextField txtTel = new JTextField("");
    private JLabel lblTel = new JLabel("Telefono:");
    private JTextField txtCel = new JTextField("");
    private JLabel lblCel = new JLabel("Celular");
    private JTextField txtCalle = new JTextField("");
    private JLabel lblCalle = new JLabel("Calle:");
    private JTextField txtAlt = new JTextField("");
    private JLabel lblAlt = new JLabel("Altura:");
    private JTextField txtPiDto = new JTextField("");
    private JLabel lblPiDto = new JLabel("Piso/Dpto:");
    
    private GroupLayout grupo = new GroupLayout(this);
    private GridLayout contenedor = new GridLayout(8,5);
    
    
    
    
    private Clientes data;
    
    private ContGrabar grab = new ContGrabar(txtNom,txtApe,txtDni,txtEmail,txtTel,txtCel,txtCalle,txtAlt,txtPiDto);

    public PrinClientes(Clientes data) {
        this.setSize(900, 500);
        this.setLayout(contenedor);
        this.setLocationRelativeTo(this);
        grupo.setAutoCreateGaps(true);
        grupo.setAutoCreateContainerGaps(true);
        this.data = data;
        this.agrComp(data);
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); 
        
         
        this.cancelar.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
        }); 
        this.grabar.addMouseListener(grab);    }
    
  
    private void agrComp(Clientes data){
        if (data==null){
            this.add(lblNom);
            this.add(txtNom);
            this.add(lblApe);
            this.add(txtApe);
            this.add(lblDni);
            this.add(txtDni);
            this.add(lblEmail);
            this.add(txtEmail);
            this.add(lblTel);
            this.add(txtTel);
            this.add(lblCel);
            this.add(txtCel);
            this.add(lblCalle);
            this.add(txtCalle);
            this.add(lblAlt);
            this.add(txtAlt);
            this.add(lblPiDto);
            this.add(txtPiDto);
        } 
        else{
            
       
        this.add(lblNom); 
        this.add(txtNom);
        txtNom.setText(data.getNombre());
        
        
        
        this.add(lblApe);
        this.add(txtApe);
        txtApe.setText(data.getApellido());
        this.add(lblDni);
        this.add(txtDni);
        txtDni.setText(data.getDni().toString());
        this.add(lblEmail);
        this.add(txtEmail);
        txtEmail.setText(data.getEmail());
        this.add(lblTel);
        this.add(txtTel);
        txtTel.setText(data.getTelefono());
        this.add(lblCel);
        this.add(txtCel);
        txtCel.setText(data.getCelular());
        this.add(lblCalle);
        this.add(txtCalle);
        txtCalle.setText(data.getCalle());
        this.add(lblAlt);
        this.add(txtAlt);
        txtAlt.setText(data.getAltura());
        this.add(lblPiDto);
        this.add(txtPiDto);
        txtPiDto.setText(data.getPisodpto());
        }
        
        
        this.add(grabar);
        this.add(cancelar);



    }

 

}
        

