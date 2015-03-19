package Exe01;

public class Fitas {
	protected String titulo;
	protected double valorLoc;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getValorLoc() {
		return valorLoc;
	}
	public void setValorLoc(double valorLoc) {
		this.valorLoc = valorLoc;
	}
	
	public void valorLoc(double acrescimo){
		this.valorLoc += this.valorLoc * acrescimo;
	}
}
