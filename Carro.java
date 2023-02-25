import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Carro {

	private String cor;
	private String modelo;
	private String marca;
 

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	


	// O método criado abaixo é um método construtor que no caso foi criado para
	// demonstrar
	// como utilizar um método construtor e salvar os dados do atributo.
	public void controiCarro(String cor, String modelo, String marca) {

		setCor(cor);
		setModelo(modelo);
		setMarca(marca);

	}
}
