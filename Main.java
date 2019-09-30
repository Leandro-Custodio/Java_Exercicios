import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String retorno ="";
		String retorno1 ="";
		int sosai =0;
		int tam1=-1,escolha,escolha1;
		while(tam1<=0) {
			tam1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantos Participantes são \nObs: Tem que ser maior que 0\n"));
		}
		String Imprime ="";
		String VetorNomePiloto[] = new String [tam1]; 
		String VetorModelo[] = new String [tam1]; 
		int VetorAno[] = new int [tam1];
		int VetorPosicao[] = new int [tam1];
		int VetorPodioPosicao[] = new int [tam1];
		int VetorPodioNome[] = new int [tam1];
		int NumeroCorridas[] = new int [10];
		String titulos[] = new String [3];
		int guia =0;
		for(int k= 0;k<tam1;k++) {
			VetorNomePiloto[k] = JOptionPane.showInputDialog("Digite o Nome "+(k+1)+"º Participante \n");	
			VetorAno[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano do "+(k+1)+"º Carro \n"));
			VetorModelo[k] = JOptionPane.showInputDialog("Digite o Modelo do "+(k+1)+"º Carro \n");	
			VetorPosicao[k]=0;

		}
		//Cadastro dos Participantes

		for(int k= 0;k<tam1;k++) {
			retorno+=k+"º "+VetorNomePiloto[k]+" Com o Carro "+VetorModelo[k]+"\n";
		}
		//Faz A Lista

		JOptionPane.showMessageDialog(null,retorno);
		//Imprime a Lista
		do {
			String[] opt = { "Começar", "Listar","Sair" };
			escolha = JOptionPane.showOptionDialog(null, "Escolha umas das opçoes para continuar", "OPÇOES",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);

			switch(escolha) {

			case 0:
				//Começou

				String[] opt2 = { "Ultrapassar", "Finalizar","Pódio","Listar","Sair" };
				escolha1 = JOptionPane.showOptionDialog(null, "Escolha umas das opçoes para continuar", "OPÇOES",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt2, opt2[0]);

				do {
					switch(escolha1) {

					case 0:
						//Ultrapassar
						int sai=0;
						int aux=0;
						do {
							aux=(Integer.parseInt(JOptionPane.showInputDialog(" Qual Carro Vai Ultrapassar"))+1); 
							VetorPosicao[aux]+=aux;
							sai=Integer.parseInt(JOptionPane.showInputDialog(" Digite 1 Para Uma nova Ultrapassagem e 0 Para Finalizar"));
						}while(sai!=0);

					case 1:
						//Finalizar


					case 2:
						//Podio

						for(int i=0;i<tam1;i++) {
							for(int j=0;j<tam1;j++) {
								if(VetorPosicao[i]>VetorPosicao[j]&&i!=j) {
									VetorPodioPosicao[i]=VetorPosicao[i];
									VetorPodioNome[i]=i;
								}
							}
						}
					case 3:
						//Listar
						retorno ="";
						for(int k= 0;k<tam1;k++) {
							retorno1+=VetorPodioPosicao[k]+"º Lugar "+" o Piloto"+VetorNomePiloto[VetorPodioNome[k]]+"\n";
						}
						//Faz A Lista

						JOptionPane.showMessageDialog(null,retorno1);
						//Imprime a Lista

						break;
					default:
						//Sair


					}
					sosai=Integer.parseInt(JOptionPane.showInputDialog(" Digite 1 Para Uma nova volta e 0 Para Sair"));
				}while(sosai!=0);
			case 1:
				//Listar
				retorno ="";
				for(int k= 0;k<tam1;k++) {
					retorno+=k+"º "+VetorNomePiloto[k]+"Com o Carro "+VetorModelo[k]+"\n";
				}
				//Faz A Lista

				JOptionPane.showMessageDialog(null,retorno);

			case 2:
				//Sair
				sosai=1;
				break;
			}
			NumeroCorridas[guia] += 1;
			titulos[guia]= "Na "+NumeroCorridas[guia]+"ª Corrida o Vencedor Foi o Carro "+VetorNomePiloto[VetorPodioNome[0]]+"\n";
			for(int i=0;i<3;i++)
				if(guia>i)
					Imprime = titulos[i];
			JOptionPane.showMessageDialog(null,Imprime);
			sosai=Integer.parseInt(JOptionPane.showInputDialog(" Digite 1 Para um novo jogo e 0 Para Sair"));
		}while(sosai!=0);
	}
}
