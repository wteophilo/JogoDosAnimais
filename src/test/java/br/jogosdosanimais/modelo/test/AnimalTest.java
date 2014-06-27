package br.jogosdosanimais.modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.jogodosanimais.modelo.Animal;

public class AnimalTest {

	@Test
	public void carregaNome(){
		Animal animal = new Animal("Cachorro");
		assertEquals("Cachorro",animal.getNome());
	}

}
