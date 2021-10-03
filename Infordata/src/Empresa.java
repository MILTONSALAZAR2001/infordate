public class Empresa {
    String nombre;
    String direccion;
    int NumeroEmpleados;
    String soporte;
    String DNI;
    String Telefono;
    String Domicilio;
    String FechaComprada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return NumeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        NumeroEmpleados = numeroEmpleados;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getFechaComprada() {
        return FechaComprada;
    }

    public void setFechaComprada(String fechaComprada) {
        FechaComprada = fechaComprada;
    }

    public Empresa(String nombre, String direccion, int numeroEmpleados, String soporte, String DNI, String telefono, String domicilio, String fechaComprada) {
        this.nombre = nombre;
        this.direccion = direccion;
        NumeroEmpleados = numeroEmpleados;
        this.soporte = soporte;
        this.DNI = DNI;
        Telefono = telefono;
        Domicilio = domicilio;
        FechaComprada = fechaComprada;
    }
}
