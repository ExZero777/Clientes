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
    
    private ContCan cance = new ContCan();
    private ContGrabar grab = new ContGrabar();
    
    
    public PrinClientes(){
        this.setSize(900, 500);
        this.setLayout(contenedor);
        this.setLocationRelativeTo(this);
        grupo.setAutoCreateGaps(true);
        grupo.setAutoCreateContainerGaps(true);
        this.agrComp();
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); 
        
         
        this.cancelar.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
        }); 
        this.grabar.addMouseListener(grab);
        
    
    } 

    private void agrComp(){
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
        
        this.add(grabar);
        this.add(cancelar);
    }
    
}
