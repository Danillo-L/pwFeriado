import java.time.LocalDate;

public class Feriado {
    private TipoFeriadoEnum tipo;
    private String descricao;
    private LocalDate data;

    public Feriado(TipoFeriadoEnum tipo, String descricao, LocalDate data) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
    }

    public TipoFeriadoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoFeriadoEnum tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString() {
        return descricao + "\n" + data + "\n" + tipo;
    }
}
