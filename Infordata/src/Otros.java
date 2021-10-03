import java.util.Date;

public class Otros {
    int codigo;
    String modelo;
    String FechaCreada;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(String fechaCreada) {
        FechaCreada = fechaCreada;
    }

    public Otros(int codigo, String modelo, String fechaCreada) {
        this.codigo = codigo;
        this.modelo = modelo;
        FechaCreada = fechaCreada;
    }
}
