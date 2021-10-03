import java.util.Date;

public class CPUs {
    String modelo;
    int codigo;
    String MemoriaPrincipal;
    String FechaCreada;
    String PaisOrigen;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMemoriaPrincipal() {
        return MemoriaPrincipal;
    }

    public void setMemoriaPrincipal(String memoriaPrincipal) {
        MemoriaPrincipal = memoriaPrincipal;
    }

    public String getFechaCreada() {
        return FechaCreada;
    }

    public void setFechaCreada(String fechaCreada) {
        FechaCreada = fechaCreada;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public CPUs(String modelo, int codigo, String memoriaPrincipal, String fechaCreada, String paisOrigen) {
        this.modelo = modelo;
        this.codigo = codigo;
        MemoriaPrincipal = memoriaPrincipal;
        FechaCreada = fechaCreada;
        PaisOrigen = paisOrigen;
    }
}
