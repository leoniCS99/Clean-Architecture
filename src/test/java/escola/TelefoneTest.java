package escola;

import escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {


    @Test
    void naoDeveriaCriarTelefoneComDDsInvalidos(){
       assertThrows(IllegalArgumentException.class,
               () -> new Telefone(null, "1221212"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "1221212"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "1221212"));

    }

    @Test
    void deveriaPermetirCriarTelefoneComDDDEnumeroValidos(){
        String ddd = "11";
        String numero = "12345678";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero,telefone.getNumero());
    }

}
