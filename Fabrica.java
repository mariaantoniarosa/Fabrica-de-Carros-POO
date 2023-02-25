import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Fabrica {

	private String cor;
	private String modelo;
	private String marca;
	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();
	
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

	public ArrayList<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}

	public void fabricarCarro(Carro carro) {

		listaDeCarros.add(carro);
	}

	public String geraInfo() {
		String info = "";

		for (Carro carro : this.listaDeCarros) {
			info += "Cor: " + carro.getCor() + "\n Modelo: " + carro.getModelo() + "\n Marca: " + carro.getMarca()
					+ "\n";

		}
		return info;
	}

	public void venderCarro(String corCar, String mod) {
	//	int qtdeCarro = listaDeCarros.size();
		
		 for (int i=0; i<listaDeCarros.size(); i++) {
		//for (Carro carro : this.listaDeCarros) {
			 Carro carro = this.listaDeCarros.get(i);
			if (corCar.equals(carro.getCor()) && (mod.equals(carro.getModelo()))) {
				System.out.println(carro.getCor() + " " + carro.getModelo());
				this.listaDeCarros.remove(carro);
			}
		//	System.out.print(listaDeCarros.get(0));
		}
	}
}
