package visao;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static String solicitaMarca() {
		String marca = JOptionPane.showInputDialog("Qual � a marca do carro?");
		return marca;
	}

	public static String solicitaModelo() {
		String modeloCarro = JOptionPane.showInputDialog("Qual � o modelo do carro?");
		return modeloCarro;
	}

	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Insira a cor do carro:");
		return cor;
	}

	public static int solicitaOpcao() {
		String[] opcoes = { "Fabricar Carros", "Vender um Carro", "Ver Informa��es dos Carros", "Sair do Programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a op��o desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static int qtdeCarro() {
		int qtdeCarro = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Informe a quantos carros ser�o fabricados:"));
		return qtdeCarro;
	}

	public static void exibeInfoCarro(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informa��es", JOptionPane.INFORMATION_MESSAGE);

	}
	public static void exibeMsgEncerraPrograma () { 
		JOptionPane.showMessageDialog(null, "O programa ser� encerrado!");
	}
	
	public static String PedeCor () { 
	String corCa=	JOptionPane.showInputDialog(null, "Informe a cor do carro ");
	return corCa;
	}
	public static String PedeModelo () { 
		String mod = JOptionPane.showInputDialog(null, "Informe o modelo do carro");
	return mod;
	}
}