package br.jogodosanimais.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.jogodosanimais.modelo.Animal;

public class ListaAnimais {
	private List<Animal> animals = new ArrayList<Animal>();
	
	public void adiciona(Animal animal){
		this.animals.add(animal);
	}
	
	public List<Animal> getListaAnimais(){
		return animals;
	}
	
	public Animal primeiro(){
		return animals.get(0);
	}
	
	public Animal ultimo(){
		return animals.get(animals.size()-1);
	}
	
	public List<Animal> listaInvertida(){
		Collections.reverse(animals);
		return animals;
	}
	
	public Integer totalNaLista(){
		return animals.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animals == null) ? 0 : animals.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaAnimais other = (ListaAnimais) obj;
		if (animals == null) {
			if (other.animals != null)
				return false;
		} else if (!animals.equals(other.animals))
			return false;
		return true;
	}
	
	
}
