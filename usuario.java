public class usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String contraseña;

    public usuario(){
        this.contraseña = dni+nombre;
    }

    public usuario(String nombre, String apellido, int edad, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.contraseña = dni+nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if(contraseña.length() < 10){
            System.out.println("Ingrese una contraseña más segura");
        }else{
            this.contraseña = contraseña;
            System.out.println("Contraseña cambiada con éxito");
        }
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void iniciar_sesion(){
        System.out.println("Sesión iniciada");
    }

    @Override
    public String toString() {
        return "usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "]";
    }
    
}
