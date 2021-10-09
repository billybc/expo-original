package com.mitocode;

import com.mitocode.observer2.PesoARGObservador;
import com.mitocode.observer2.PesoMXObservador;
import com.mitocode.observer2.SolObservador;
import com.mitocode.observer2.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);
		
		System.out.println("Si desea cambiar 10 dalares obtendra : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 12 dolares obtendra : ");
		subject.setEstado(12);
	}
}
