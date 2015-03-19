package Exe01;

public class Inicio {

	public static void main(String[] args) {
		
		FitasInfantil fi = new FitasInfantil();
		FitasLancamentos fl = new FitasLancamentos();		
		Fitas f = new Fitas();
		
		f.setValorLoc(2);
		
		fi.setTitulo("Turma do Bolinha");
		fi.setValorLoc(2);
		
		fl.setTitulo("O Poderoso Chefão");
		fl.setValorLoc(2);
		
				
		System.out.println(fi.valorLoc());
		System.out.println(fl.valorLoc());
		System.out.println(f.valorLoc);

	}

}
