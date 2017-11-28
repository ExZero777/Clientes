package visual;

import controladores.ContBuscar;
import controladores.ContCancelar;
import controladores.ContGrabar;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Principal extends JFrame {
    private JButton Cancelar = new JButton("Cancelar");
    private JButton Guardar =  new JButton("Guardar");
    private JButton Buscar =  new JButton("Buscar");
    
    private JTextField txtDni = new JTextField("");
    private JTextField txtEmail = new JTextField("");
    private JLabel lblDni = new JLabel("DNI:");
    private JLabel lblEmail = new JLabel("EMAIL:");
    
    private GroupLayout grupo = new GroupLayout(this);
    private GridLayout contenedor = new GridLayout(8,5);
            

    private ContCancelar canc = new ContCancelar();    
    private ContBuscar bus = new ContBuscar(txtEmail,txtDni);   
     
     
                
    public Principal() {
       this.setSize(900, 500);
        this.setLayout(contenedor);
        this.setLocationRelativeTo(this);
        grupo.setAutoCreateGaps(true);
        grupo.setAutoCreateContainerGaps(true);
        this.agrComp();
        this.setVisible(true);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); 
        
        
        this.Cancelar.addMouseListener(canc);
        this.Buscar.addMouseListener(bus);
    }

    
    
    private void agrComp(){
        this.add(lblDni);
        this.add(txtDni);
        this.add(lblEmail);
        this.add(txtEmail);
        this.add(Buscar);
        this.add(Cancelar);
    }
    
}
