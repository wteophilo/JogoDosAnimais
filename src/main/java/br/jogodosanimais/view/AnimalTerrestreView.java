package br.jogodosanimais.view;

import javax.swing.JOptionPane;

import br.jogodosanimais.modelo.Animal;
import br.jogodosanimais.util.ListaAnimais;

public class AnimalTerrestreView implements ViewGeneric{

	private ListaAnimais listaAnimais;

	public AnimalTerrestreView(ListaAnimais listaAnimais) {
		this.listaAnimais = listaAnimais;
		perguntas();
	}
	
	public void perguntas(){
		int acao = 1;
		for (Animal animal : listaAnimais.listaInvertida()){
			acao = JOptionPane.showConfirmDialog(null, "O animal que voc� pensou � "+animal.toString()+"?","Animais",JOptionPane.YES_NO_OPTION);
			if (JOptionPane.YES_OPTION == acao){
				PerguntarFrequentes.vencer();
				break;
			}
		}
		if (acao == JOptionPane.NO_OPTION){
			String nome = PerguntarFrequentes.aprender();
			listaAnimais.listaInvertida();
			Animal animal = PerguntarFrequentes.completeASentenca(nome,listaAnimais);
			alteraLista(animal);
		}
	}

	private void alteraLista(Animal animal) {
		listaAnimais.adiciona(animal);
		PerguntarFrequentes.perder();	
	}

	public ListaAnimais getListaAnimais() {
		return listaAnimais;
	}

}
