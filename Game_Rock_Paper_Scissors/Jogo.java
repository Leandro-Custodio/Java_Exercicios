/*
	Desenvolvedor: Leandro Artur Custodio
	Github: Leandro-Custodio
	Linkedin: Leandro Artur Custodio
	&&
	Desenvolvedor: Lucas André Besen
	Git-hub: Lucas-Besen
	Linkedin: Lucas André Besen
	
 */
package Game_Rock_Paper_Scissors;


public class Jogo {

	private int escolha1 = -1, escolha2 = -1;
	private boolean ganhou, empatou;

	public void setPrimeiroJogador(int escolha1) {
		this.escolha1 = escolha1;
	}
	//Receive first player choice

	public void setSegundoJogador(int escolha2) {
		this.escolha2 = escolha2;
	}
	//Receive second player choice

	public int getEscolha1() {
		return escolha1;
	}

	public int getEscolha2() {
		return escolha2;
	}



	public boolean VerificaJogador1Win() {
		if (escolha1 == 0 && escolha2 == 2) {
			// Rock(User1) e Scissors(User2)
			ganhou = true;
		} else if (escolha1 == 1 && escolha2 == 0) {
			// Paper(User1) e Rock(User2)
			ganhou = true;
		} else if (escolha1 == 2 && escolha2 == 1) {
			// Scissors(User1) e Paper(User2)
			ganhou = true;
		} 
		else
			ganhou = false;

		return ganhou;
	}
	//Checks if first player wins, if not obviously second player wins
	public boolean Empate() {
		if (escolha1 == escolha2) {

			empatou = true;
			escolha1 = -1;
			escolha2 = -1;
		} else
			empatou = false;

		return empatou;
	}
	//In case of a draw returns this method in main


	public int GeraOpcao() {
		double numero = Math.random();
		//create a double number between 0 to 1
		int numInt = (int)Math.floor(numero*10);
		//multiply by 10 and then transform it into integer
		int escolha = numInt%3;
		//The "%" guarantees the generated numbers being 0 to 2
		//there are 3 options

		return escolha;
	}
	//Generates the option of "IA" 

}
