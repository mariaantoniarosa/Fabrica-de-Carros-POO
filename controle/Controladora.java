package controle;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Carro;
import modelo.Fabrica;
import visao.EntradaSaida;

public class Controladora {

	 
 
	// instaciar a fabrica
	private Carro carro = null;
	private Fabrica fabrica = new Fabrica();

	public void exibeMenu() {
		int opcao;

		boolean construir = false;
		do {

			opcao = EntradaSaida.solicitaOpcao();
			if (opcao == 3) {
				EntradaSaida.exibeMsgEncerraPrograma();
				System.exit(0);

			} else if (construir != true) {

				while (opcao != 0) {
					JOptionPane.showMessageDialog(null, "Primeiro construa o carro");
					opcao = EntradaSaida.solicitaOpcao();

				}
			}

			switch (opcao) {

			case 0:
				construir = true;
				int qtdeCarro = EntradaSaida.qtdeCarro();

				for (int i = 0; i < qtdeCarro; i++) {
					// solicitando informações sobre cada carro criado
					String cor = EntradaSaida.solicitaCor();
					String marca = EntradaSaida.solicitaMarca();
					String modelo = EntradaSaida.solicitaModelo();

					Carro carro = new Carro();
					carro.setCor(cor);
					carro.setMarca(marca);
					carro.setModelo(modelo);

					// carro.controiCarro(cor, modelo, marca);
					// este modelo acima é um método construtor que tem o mesmo efeito que os
					// "carro.setCor/ carro.setMarca/ carro.setModelo.

					fabrica.fabricarCarro(carro);
					// É preciso instanciar a fabrica, ou seja, criá-la para receber a lista de
					// carros construidos.
					System.out.println(carro.getCor());
					System.out.println(carro.getMarca());
					System.out.println(carro.getModelo()); // <- Somente testes para verificar se
					// estão funcionando
				}
				break;

			case 1:
				
				// relizar entrada e saida da cor e mordelo
				String corCar =  EntradaSaida.PedeCor();
				String mod = EntradaSaida.PedeModelo();
				
				fabrica.venderCarro(corCar, mod);
				break;

			case 2:
				String informacao = fabrica.geraInfo();
				EntradaSaida.exibeInfoCarro(informacao);
				break;

			}

		} while (opcao != 3);
		EntradaSaida.exibeMsgEncerraPrograma();
		System.exit(0);

	}

}
