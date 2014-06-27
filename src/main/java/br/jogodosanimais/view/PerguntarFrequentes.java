package br.jogodosanimais.view;

import javax.swing.JOptionPane;

import br.jogodosanimais.modelo.Animal;
import br.jogodosanimais.util.ListaAnimais;

public class PerguntarFrequentes {

	public static String aprender() throws NullPointerException {
		String nome = null;
		nome = JOptionPane.showInputDialog("Qual o animal que você pensou?");
		if (nome.isEmpty()) {
			aprender();
		} else{
			return nome;
		}
		return "";
	}

	public static void perder() {
		JOptionPane.showMessageDialog(null,
				"Perdi... mas vou ganhar na próxima!");
	}

	public static void vencer() {
		JOptionPane.showMessageDialog(null, "Acertei novamente!");
	}
	
	public static void desistir() {
		JOptionPane.showMessageDialog(null, "Já está desistindo??? Tudo bem... tente de novamente mais tarde");
	}


	public static Animal completeASentenca(String nome ,ListaAnimais animais) throws NullPointerException{
		String animal = JOptionPane.showInputDialog(null, "Um(a) " + nome + " é .... mas um(a) "
				+ animais.primeiro() + " não.", "Complete...");
		if (animal.isEmpty()) {
			completeASentenca(nome,animais);
		}else{
			return new Animal(animal);
		}
		return null;
	}
	

}
