package br.com.fiap.app;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Carro;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		List<Carro> frota = new ArrayList<>();
		
		Carro c = new Carro();
		c.setAno(2020);
		c.setPlaca("AGU-67R9");
		c.setMontadora("Honda");
		c.setModelo("FIT");
		
		frota.add(c);
		
		c = new Carro();
		c.setAno(2023);
		c.setPlaca("FIA-08Y5");
		c.setModelo("C180");
		c.setMontadora("Mercedes-Benz");
		
		frota.add(c);
		
		
		
		
	}
	

}
