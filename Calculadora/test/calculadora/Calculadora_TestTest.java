package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author massa
 */
public class Calculadora_TestTest {

    private Calculadora_Test calc;

    /**
     *
     */
    @BeforeEach
    public void setUp() {
        calc = new Calculadora_Test();
    }

    // Testes para soma

    /**
     *
     */
    @Test
    public void testSomarDoisPositivos() {
        assertEquals(15, calc.somarDoispositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testSomarUmPositivoNegativo() {
        assertEquals(5, calc.somarUmpositivoNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testSomarUmNegativoPositivo() {
        assertEquals(5, calc.somarUmnegativoPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testSomarDoisNegativos() {
        assertEquals(-15, calc.somarDoisnegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testSomarUmPositivoZero() {
        assertEquals(10, calc.somarUmpositivoZero(10, 0));
    }

    /**
     *
     */
    @Test
    public void testSomarUmNegativoZero() {
        assertEquals(-10, calc.somarUmnegativoZero(-10, 0));
    }

    /**
     *
     */
    @Test
    public void testSomarUmZeroNegativo() {
        assertEquals(-5, calc.somarUmzeroNegativo(0, -5));
    }

    /**
     *
     */
    @Test
    public void testSomarUmZeroPositivo() {
        assertEquals(5, calc.somarUmzeroPositivo(0, 5));
    }

    /**
     *
     */
    @Test
    public void testSomarDoisZero() {
        assertEquals(0, calc.somarDoiszero(0, 0));
    }
    
    // Testes para subtração

    /**
     *
     */
    @Test
    public void testSubDoisPositivos() {
        assertEquals(5, calc.subDoispositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testSubUmPositivoNegativo() {
        assertEquals(15, calc.subUmpositivoNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testSubUmNegativoPositivo() {
        assertEquals(-15, calc.subUmnegativoPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testSubDoisNegativos() {
        assertEquals(-5, calc.subDoisnegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testSubUmPositivoZero() {
        assertEquals(10, calc.subUmpositivoZero(10, 0));
    }

    /**
     *
     */
    @Test
    public void testSubUmNegativoZero() {
        assertEquals(-10, calc.subUmnegativoZero(-10, 0));
    }

    /**
     *
     */
    @Test
    public void testSubDoisZero() {
        assertEquals(0, calc.subDoiszero(0, 0));
    }
    
    // Testes para multiplicação

    /**
     *
     */
    @Test
    public void testMultDoisPositivos() {
        assertEquals(50, calc.multDoispositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testMultUmPositivoNegativo() {
        assertEquals(-50, calc.multUmpositivoNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testMultUmNegativoPositivo() {
        assertEquals(-50, calc.multUmnegativoPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testMultDoisNegativos() {
        assertEquals(50, calc.multDoisnegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testMultUmPositivoZero() {
        assertEquals(0, calc.multUmpositivoZero(10, 0));
    }

    /**
     *
     */
    @Test
    public void testMultUmnegativoZero() {
        assertEquals(0, calc.multUmnegativoZero(-10, 0));
    }

    /**
     *
     */
    @Test
    public void testMultDoisZero() {
        assertEquals(0, calc.multDoiszero(0, 0));
    }
    
    // Testes para divisão

    /**
     *
     */
    @Test
    public void testDivDoisPositivos() {
        assertEquals(2, calc.divDoispositivos(10, 5));
    }

    /**
     *
     */
    @Test
    public void testDivUmPositivoNegativo() {
        assertEquals(-2, calc.divUmpositivoNegativo(10, -5));
    }

    /**
     *
     */
    @Test
    public void testDivUmNegativoPositivo() {
        assertEquals(-2, calc.divUmnegativoPositivo(-10, 5));
    }

    /**
     *
     */
    @Test
    public void testDivDoisNegativos() {
        assertEquals(2, calc.divDoisnegativos(-10, -5));
    }

    /**
     *
     */
    @Test
    public void testDivUmPositivoZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divUmpositivoZero(10, 0);
        });
    }

    /**
     *
     */
    @Test
    public void testDivUmnegativoZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divUmnegativoZero(-10, 0);
        });
    }

    /**
     *
     */
    @Test
    public void testDivDoiszero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divDoiszero(10, 0);
        });
    }

    
}