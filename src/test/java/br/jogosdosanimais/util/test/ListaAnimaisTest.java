package br.jogosdosanimais.util.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.jogodosanimais.modelo.Animal;
import br.jogodosanimais.util.ListaAnimais;

public class ListaAnimaisTest {

	private ListaAnimais animais;
	private List<Animal> listaInvertida;

	@Before
	public void setUp(){
		animais = new ListaAnimais();
		animais.adiciona(new Animal("Macaco"));
		animais.adiciona(new Animal("Cachorro"));
		animais.adiciona(new Animal("Gato"));
		animais.adiciona(new Animal("Giraffa"));
		
	}

	@Test
	public void verificaTamanhoLista(){
		assertEquals(new Integer(4), new Integer(animais.totalNaLista()));
	}
	
	@Test
	public void carregaPrimeiroItemSemInverter(){
		
		assertEquals("Macaco", animais.primeiro().getNome());
	}
	
	@Test
	public void carregaUltimoItemSemInverter(){
		assertEquals("Giraffa",animais.ultimo().getNome());
	}
	
	@Test
	public void carregaPrimeiroItemInvertido(){
		listaInvertida = animais.listaInvertida();
		assertEquals("Giraffa", listaInvertida.get(0).getNome());
	}
	
	@Test
	public void carregaUltimoItemAposInvertido(){
		listaInvertida = animais.listaInvertida();
		int i = animais.getListaAnimais().size() - 1;
		assertEquals("Macaco", listaInvertida.get(i).getNome());
	}
	
}
