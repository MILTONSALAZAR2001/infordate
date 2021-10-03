public class Alquiler {
    int codigo;
    int precio;
    String ResolucionMax;
    String Capacidad;

    public Alquiler(int codigo, int precio, String resolucionMax, String capacidad) {
        this.codigo = codigo;
        this.precio = precio;
        ResolucionMax = resolucionMax;
        Capacidad = capacidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getResolucionMax() {
        return ResolucionMax;
    }

    public void setResolucionMax(String resolucionMax) {
        ResolucionMax = resolucionMax;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }
}
