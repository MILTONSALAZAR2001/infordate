import java.util.Date;

public class Monitores {
    int Codigo;
    String modelo;
    int DefinicionMaxima;
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

    public int getDefinicionMaxima() {
        return DefinicionMaxima;
    }

    public void setDefinicionMaxima(int definicionMaxima) {
        DefinicionMaxima = definicionMaxima;
    }

    public String getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(String fechaCreada) {
        FechaCreada = fechaCreada;
    }

    public Monitores(int codigo, String modelo, int definicionMaxima, String fechaCreada) {
        Codigo = codigo;
        this.modelo = modelo;
        DefinicionMaxima = definicionMaxima;
        FechaCreada = fechaCreada;
    }
}
