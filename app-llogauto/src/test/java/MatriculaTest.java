import com.llogaauto.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MatriculaTest {


    @Test
    void testMatriculaValida() {
        assertTrue(Automobil.validarMatricula("1234LMN"));
        assertTrue(Automobil.validarMatricula("0000BBB"));
    }


    @Test
    void testMatriculaInvalida() {
        assertFalse(Automobil.validarMatricula("1234ABC")); // Té vocals (A)
        assertFalse(Automobil.validarMatricula("123ABC4")); // Ordre incorrecte
        assertFalse(Automobil.validarMatricula("123BBB"));  // Falta un número
        assertFalse(Automobil.validarMatricula("1234BÑB")); // Lletra no permesa (Ñ)
    }
}
