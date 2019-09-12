import javax.swing.JOptionPane;

public class IF {

	public static void main(String[] args) {
		int opcao = 0;
		
		//
	 do{
	 	//JOption..Input Serve para imprimir em um layout a mensangem e esperar pelo usuario para digitar conforme o tipo da variavel 
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota do Aluno \n"));
		if (num1 > 90) {
			//JOption..Input Serve para imprimir em um layout a mensangem
			JOptionPane.showMessageDialog(null," A ");
			JOptionPane.showMessageDialog(null," Aprovado ");}
		else if (num1 < 90 & num1 >= 80 ) {
			JOptionPane.showMessageDialog(null," B ");
			JOptionPane.showMessageDialog(null," Aprovado ");}
		else if (num1 <= 70 & num1 > 80 ) {
			JOptionPane.showMessageDialog(null," C ");
			JOptionPane.showMessageDialog(null," Aprovado ");}
		else if (num1 <= 60 & num1 > 70 ) 
			JOptionPane.showMessageDialog(null," D ");	
		else 
			JOptionPane.showMessageDialog(null," F ");	
		
		opcao = Double.parseDouble(JOptionPane.showInputDialog(null," Nota digitada: "+ num1+" \nCaso Você digitou a nota errada digite 0 \nSe não digite qualquer numero"));
		//caso queria ter um if numa mensagem
		System.out.println(opcao == 0 ? "Voltando" : "Acabou");
		
	 }while(opcao == 0);
}
}
