package Exe02;

public class VeiculoCarga extends Veiculo{
	
	private double cargaTotal;

	public double getCargaTotal() {
		return cargaTotal;
	}

	public void setCargaTotal(double cargaTotal) {
		this.cargaTotal = cargaTotal;
	}
	
	public VeiculoCarga(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal, double cargaTotal){
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal);
		this.cargaTotal = cargaTotal;
	}
}
