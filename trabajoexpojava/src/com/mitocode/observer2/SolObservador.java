package com.mitocode.observer2;

public class SolObservador extends Observador{

	private double valorCambio = 7.50;
	
	public SolObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("GUA: " + (sujeto.getEstado() * valorCambio));
	}

}
