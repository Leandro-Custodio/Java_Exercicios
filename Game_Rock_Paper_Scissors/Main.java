package Game_Rock_Paper_Scissors;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String msg;
		int x;
		Jogo Metodo = new Jogo();
		Perguntas Pergunta = new Perguntas();
		//Objeto criado

		do {	
			switch(x=Pergunta.PerguntaOpcao()) {
			case 0:
				// User X IA - - HumanXluck
				do{
					JOptionPane.showMessageDialog(null, "Primeiro Jogador");
					Metodo.setPrimeiroJogador(Pergunta.PerguntaOpcao1());
					// Set in Method 
					JOptionPane.showMessageDialog(null, "Computador");
					Metodo.setSegundoJogador(Metodo.GeraOpcao());
					// Set in Method 
	
					if (Metodo.Empate()==true) {
						JOptionPane.showMessageDialog(null, "Empatou Jogue Novamente");
	
					}
					//valid if the game is a draw - - In Method
	
				}while(Metodo.Empate()==true);
				break;
	
			case 1:
				// User1 versus User2
				do{
					JOptionPane.showMessageDialog(null, "Primeiro Jogador");
					Metodo.setPrimeiroJogador(Pergunta.PerguntaOpcao1());
					// Set in Method
					JOptionPane.showMessageDialog(null, "Proximo Jogador");
					Metodo.setSegundoJogador(Pergunta.PerguntaOpcao1());
					// Set in Method
	
	
					if (Metodo.Empate()==true) {
						JOptionPane.showMessageDialog(null, "Empatou Jogue Novamente");
	
					}
					//valid if the game is a draw - - In Method
	
				}while(Metodo.Empate()==true);
	
	
				break;
			}
			
			if(x==0){
			msg = "Jogador 1: "+Pergunta.Traduz(Metodo.getEscolha1()) +"\nComputador: "+Pergunta.Traduz(Metodo.getEscolha2());
			//fill in the variable so that everything goes out in the same message -- JOptionPane 
				if (Metodo.VerificaJogador1Win())
				{
					JOptionPane.showMessageDialog(null, "O Primeiro Jogador Ganhou\n\n" + msg);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "O Computador Ganhou\n\n" + msg);
				}
			}
			
			else {
				msg = "Jogador 1: "+Pergunta.Traduz(Metodo.getEscolha1()) +"\nJogador 2: "+Pergunta.Traduz(Metodo.getEscolha2());
				//fill in the variable so that everything goes out in the same message -- JOptionPane
				if (Metodo.VerificaJogador1Win())
				{
					JOptionPane.showMessageDialog(null, "O Primeiro Jogador Ganhou\n\n" + msg);
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "O Segundo Jogador Ganhou\n\n" + msg);
				}
		
			}
		}while(Pergunta.JogarNovamente()==1);	
	}

}


