package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.Clientes;



public class Datos {
   Connection conect;
   PreparedStatement s;
   String user = "root";
   String password = "";
   String url = "jdbc:mysql://localhost:3306/Clientes";
   String driver= "com.mysql.jdbc.Driver";   

    public Clientes Buscar(String email, String dni) throws SQLException{
        Integer rst=0;
        Clientes unCliente = null;
        Integer dn = 0;
        String em ="";
       try {
            
            Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
            
            if(dni == null){
                
                s=conect.prepareStatement("select id,nombre,apellido,dni,email,telefono,celular,calle,altura,pisodpto from cliente");
                //em = email;
                
                  ResultSet resultado = s.executeQuery();
                        
            while(resultado.next()){
              
                 unCliente= new Clientes(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("apellido"),resultado.getInt("dni"),resultado.getString("email"),resultado.getString("telefono"),resultado.getString("celular"),resultado.getString("calle"),resultado.getString("altura"),resultado.getString("pisodpto"));
                 System.out.println("jojo");
                
           
            }
              if (email.equals(unCliente.getEmail())){
              
                   System.out.println("encontradijillo");
                  return unCliente;
              }
              else{
                unCliente= null;   
                System.out.println("ñoooouuu!!");   
              }
            }
                
                  
       
            
            
            else{
             
                s=conect.prepareStatement("select id,nombre,apellido,dni,email,telefono,celular,calle,altura,pisodpto from cliente ");
               // dn= Integer.valueOf(dni);
                System.out.println("dni");
                
                  ResultSet resultado = s.executeQuery();
                        
             while(resultado.next()){
              
                 unCliente= new Clientes(resultado.getInt("id"),resultado.getString("nombre"),resultado.getString("apellido"),resultado.getInt("dni"),resultado.getString("email"),resultado.getString("telefono"),resultado.getString("celular"),resultado.getString("calle"),resultado.getString("altura"),resultado.getString("pisodpto"));
                 System.out.println("jojo2");
                
             
            }
             
              if (dni.equals(unCliente.getDni().toString())){
              
                   System.out.println("encontradijillo2");
                 return unCliente;
              }
              else{
                unCliente= null;   
                System.out.println("ñoooouuu!!2");   
              }
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
    
 
    public void Agregar(JTextField txtNom, JTextField txtApe, JTextField txtDni, JTextField txtEmail, JTextField txtTel, JTextField txtCel, JTextField txtCalle, JTextField txtAlt, JTextField txtPiDto) throws SQLException {
        Integer rst=0;
        
      
        try {
            Class.forName(driver);
            conect=DriverManager.getConnection(url,user,password);
         
            if (txtNom == null){
                
            s=conect.prepareStatement("insert into cliente (nombre,apellido,dni,email,telefono,celular,calle,altura,pisodpto) values (?,?,?,?,?,?,?,?,?)"); 
           
            s.setString(1, txtNom.getText());
            s.setString(2, txtApe.getText()) ;
            int dni= Integer.parseInt(txtDni.getText());
            s.setInt(3, dni) ;
            s.setString(4,txtEmail.getText());
            s.setString(5, txtTel.getText());
            s.setString(6, txtCel.getText());
            s.setString(7, txtCalle.getText()); 
            s.setString(8, txtAlt.getText());
            s.setString(9, txtPiDto.getText());
            
            s.executeUpdate();
            System.out.println("Re Nuevisimo!!!!"); 
            }
            else{
            s=conect.prepareStatement("Update cliente set nombre = ? ,apellido = ?,dni = ?,email = ?,telefono = ?,celular = ?,calle = ?,altura = ?,pisodpto = ? "); 
           
            s.setString(1, txtNom.getText());
            s.setString(2, txtApe.getText()) ;
            int dni= Integer.parseInt(txtDni.getText());
            s.setInt(3, dni) ;
            s.setString(4,txtEmail.getText());
            s.setString(5, txtTel.getText());
            s.setString(6, txtCel.getText());
            s.setString(7, txtCalle.getText()); 
            s.setString(8, txtAlt.getText());
            s.setString(9, txtPiDto.getText());
            
            s.executeUpdate();
            System.out.println("Actualizadisimo!!!!"); 
            } 
           } 
        catch (ClassNotFoundException e) {
              JOptionPane.showMessageDialog(null, e);}
       
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
             
        conect.close();
                
        
        

    }
    
    
    
}
