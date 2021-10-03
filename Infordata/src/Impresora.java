import java.util.Date;

public class Impresora {
    int Codigo;
    String modelo;
    String velocidad;
    String FechaCreada;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(String fechaCreada) {
        FechaCreada = fechaCreada;
    }

    public Impresora(int codigo, String modelo, String velocidad, String fechaCreada) {
        Codigo = codigo;
        this.modelo = modelo;
        this.velocidad = velocidad;
        FechaCreada = fechaCreada;
    }
}
