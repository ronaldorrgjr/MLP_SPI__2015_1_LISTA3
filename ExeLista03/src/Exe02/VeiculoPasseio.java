package Exe02;

public class VeiculoPasseio extends Veiculo{
	private boolean arCondicionado;
	private int qtdePortas;
	
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public int getQtdePortas() {
		return qtdePortas;
	}
	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}
	
	public VeiculoPasseio(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, int qtdePortas, boolean arCondicionado){
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.qtdePortas = qtdePortas;
		this.arCondicionado = arCondicionado;
	}
	
	
}
