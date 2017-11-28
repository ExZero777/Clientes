package models;

public class Clientes {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer dni;
    private String email;
    private String telefono;
    private String celular;
    private String calle;
    private String altura;
    private String pisodpto;
    private Clientes cliente;

    public Clientes(int id, String nombre, String apellido, int dni, String email, String telefono, String celular, String calle, String altura, String pisodpto) {
        this.id =id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.email=email;
        this.telefono=telefono;
        this.celular=celular;
        this.calle=calle;
        this.altura=altura;
        this.pisodpto=pisodpto;         
        }

  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPisodpto() {
        return pisodpto;
    }

    public void setPisodpto(String pisodpto) {
        this.pisodpto = pisodpto;
    }
        
}
