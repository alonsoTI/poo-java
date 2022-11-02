public class admin extends usuario{
    private String rol;
    private String token;
    private int codigo_empleado;

    public admin(String rol, String token, int codigo_empleado) {
        this.rol = rol;
        this.token = token;
        this.codigo_empleado = codigo_empleado;
    }

    public admin(String nombre, String apellido, int edad, int dni, String rol, String token, int codigo_empleado) {
        super(nombre, apellido, edad, dni);
        this.rol = rol;
        this.token = token;
        this.codigo_empleado = codigo_empleado;
    }
    
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public int getCodigo_empleado() {
        return codigo_empleado;
    }
    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    @Override
    public String toString() {
        return "admin [rol=" + rol + ", token=" + token + ", codigo_empleado=" + codigo_empleado + "]";
    }

    
}
