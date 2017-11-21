package DAO;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Clientes;
import visual.PrinClientes;
import visual.Principal;


public class Datos {
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/Clientes";
   String driver= "com.mysql.jdbc.Driver";   

    public Clientes Buscar(String email, String dni) throws SQLException{
        Integer rst=0;
        Clientes unCliente= null;
        Integer dn = 0;
        String em ="";
       try {
            Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            
            if(dni == null){
                s=conect.prepareStatement("select id,nombre,apellido,dni,email from cliente");
                System.out.println("email");
            }else{
                s=conect.prepareStatement("select id,nombre,apellido,dni,email from cliente");
                dn= Integer.valueOf(dni);
                System.out.println("dni");
            }
            ResultSet resultado = s.executeQuery();
                        
            while(resultado.next()){
                unCliente= new Clientes(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("apellido"),resultado.getInt("dni"),resultado.getString("email"));
                System.out.println("jojo");
            }
         
           } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
      conect.close();
      return unCliente;
   }
   
    
}
