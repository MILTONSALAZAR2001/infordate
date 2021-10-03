public class Proveedores {
    String NIF;
    String direccion;
    int fechaAdquirida;
    int CantidadProductos;

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFechaAdquirida() {
        return fechaAdquirida;
    }

    public void setFechaAdquirida(int fechaAdquirida) {
        this.fechaAdquirida = fechaAdquirida;
    }

    public int getCantidadProductos() {
        return CantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        CantidadProductos = cantidadProductos;
    }

    public Proveedores(String NIF, String direccion, int fechaAdquirida, int cantidadProductos) {
        this.NIF = NIF;
        this.direccion = direccion;
        this.fechaAdquirida = fechaAdquirida;
        CantidadProductos = cantidadProductos;
    }
}
