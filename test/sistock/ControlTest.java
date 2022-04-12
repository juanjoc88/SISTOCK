
package sistock;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ControlTest {
    
    public ControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCadenaNoNula() {
        System.out.println("Cadena No Nula");
        String c = "";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.CadenaNoNula(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testDNIValido() {
        System.out.println("DNI Valido");
        int dni = 0;
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.DNIValido(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCUITValido() {
        System.out.println("CUIT Valido");
        String cuit = "";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.CUITValido(cuit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testValidarEmail() {
        System.out.println("validar Email");
        String email = "";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.validarEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testValidarCodE() {
        System.out.println("validar Cod E");
        int c = 0;
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.validarCodE(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCadenaNoNula2() {
        System.out.println("Cadena No Nula");
        String c = "Hola";
        Control instance = new Control();
        boolean expResult = true;
        boolean result = instance.CadenaNoNula(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testDNIValido2() {
        System.out.println("DNI Valido");
        int dni = 11111111;
        Control instance = new Control();
        boolean expResult = true;
        boolean result = instance.DNIValido(dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testCUITValido2() {
        System.out.println("CUIT Valido");
        String cuit = "33-11111111-0";
        Control instance = new Control();
        boolean expResult = true;
        boolean result = instance.CUITValido(cuit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testValidarEmail2() {
        System.out.println("validar Email");
        String email = "prueba@prueba.com";
        Control instance = new Control();
        boolean expResult = true;
        boolean result = instance.validarEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testValidarCodE2() {
        System.out.println("validar Cod E");
        int c = 20000;
        Control instance = new Control();
        boolean expResult = true;
        boolean result = instance.validarCodE(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCUITValido3() {
        System.out.println("CUIT Valido");
        String cuit = "33-11111111";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.CUITValido(cuit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testValidarEmail3() {
        System.out.println("validar Email");
        String email = "pruebaprueba.com";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.validarEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        @Test
    public void testCUITValido4() {
        System.out.println("CUIT Valido");
        String cuit = "3311111111-0";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.CUITValido(cuit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testValidarEmail4() {
        System.out.println("validar Email");
        String email = "prueba@pruebacom";
        Control instance = new Control();
        boolean expResult = false;
        boolean result = instance.validarEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
