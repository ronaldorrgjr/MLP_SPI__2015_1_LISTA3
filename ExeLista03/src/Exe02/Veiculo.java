package Exe02;

public class Veiculo {
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double valorKmRodado;
	protected double kmInicial;
	protected double kmFinal;	
	
	
	public Veiculo(String placa, String marca, String modelo, int ano, double valorKmRodado, double kmInicial, double kmFinal){
		this.ano = ano;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.valorKmRodado = valorKmRodado;
		this.kmFinal = kmFinal;
		this.kmInicial = kmInicial;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}
	
	public double valorLocacao(){
		return (this.kmFinal - this.kmInicial) * this.valorKmRodado;
	}
	
}
