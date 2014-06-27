package br.jogodosanimais.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import br.jogodosanimais.modelo.Animal;
import br.jogodosanimais.util.ListaAnimais;

public class Main {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	private ListaAnimais animaisMarinhos = new ListaAnimais();
	private ListaAnimais animaisTerrestre = new ListaAnimais();
	private AnimalMarinhoView animalMarinhoView;
	private AnimalTerrestreView animalTerrestreView;

	public Main() {
		this.animaisMarinhos.adiciona(new Animal("Tubarão"));
		this.animaisTerrestre.adiciona(new Animal("Macaco"));
	}
	
	public static void main(String[] args) {
		new Main().start();
	}
	
	private void start() {
		montaTela();
		montaPainel();
		montaBotao();
	}

	private void montaBotao() {
		button = new JButton("Já Pensei!");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try{
					if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água?","Animais",JOptionPane.YES_NO_OPTION)){
						animalMarinhoView  = new AnimalMarinhoView(animaisMarinhos);
					}else{
						animalTerrestreView = new AnimalTerrestreView(animaisTerrestre);
					}
				}catch(NullPointerException ex){
					PerguntarFrequentes.desistir();
				}
			}
		});
		
		this.panel.add(button);
	}

	private void montaPainel() {
		this.panel = new JPanel();
		JLabel titulo = new JLabel("Pense em um animal...",SwingConstants.CENTER);
		titulo.setFont(new Font("Verdana",Font.BOLD,13));
		panel.add(titulo);
		this.frame.add(panel);
		
	}

	private void montaTela(){
		this.frame = new JFrame("Jogo dos Animais");
		this.frame.setSize(400,150);
		this.frame.setVisible(true);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public AnimalMarinhoView getAnimalMarinhoView() {
		return animalMarinhoView;
	}

	public AnimalTerrestreView getAnimalTerrestreView() {
		return animalTerrestreView;
	}
}
	
	
	
	

