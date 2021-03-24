package calculadora;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

  private Calculadora calculadora;

  @Before
  public void init(){
    calculadora = new Calculadora();
  }

  @Test
  public void sumaTest(){
    assertEquals(7, calculadora.sumar("2","5"));
  }

}
