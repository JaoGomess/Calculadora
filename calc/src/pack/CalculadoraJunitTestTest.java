package pack;

import static org.junit.jupiter.api.Assertions.*;
import junit.framework.Assert;

import org.junit.jupiter.api.Test;

public class CalculadoraJunitTestTest {

	@SuppressWarnings("deprecation")
	@Test
	public void soma() {
		soma calc = new soma();
		int soma = calc.somar(3, 7);
		System.out.println(soma);
		Assert.assertEquals(10, soma);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void divisao() {
		divisao div = new divisao();
		int dividir = div.dividir(5, 2);
		System.out.println(dividir);
		Assert.assertEquals(2.5, dividir);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void subtracao() {
		subtracao sub = new subtracao();
		int subtrair = sub.subtrair(3, 13);
		System.out.println(subtrair);
		Assert.assertEquals(-7, subtrair);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void multiplicacao() {
		multiplicacao mult = new multiplicacao();
		int multiplica = mult.multiplicar(9, 7);
		System.out.println(multiplica);
		Assert.assertEquals(15, multiplica);
	}

}
