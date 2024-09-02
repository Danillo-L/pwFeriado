import java.time.LocalDate;

public class TesteFeriado {
    public static void main(String[] args)
    {
        Feriado feriado = new Feriado(
                TipoFeriadoEnum.NACIONAL,
                "Dia da independência",
                LocalDate.of(2024,9,7)
        );

        Feriado feriado1 = new Feriado (
                TipoFeriadoEnum.ESTADUAL,
                "Dia da Consciência Negra",
                LocalDate.of(2024, 11, 20)
        );

        Feriado feriado2 = new Feriado(
                TipoFeriadoEnum.MUNICIPAL,
                "Aniversário da cidade",
                LocalDate.of(2024, 3, 16)
        );

        System.out.println(feriado + "\n");
        System.out.println(feriado1 + "\n");
        System.out.println(feriado2);

    }
}
