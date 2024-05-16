package br.com.fiap.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private long id;
	
	private LocalDate data;
	
	private Carro carro;
	
	private List<Servico> servicos;
	
	private String responsavel;
	
	private boolean aprovado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public double getTotal() {
		//percorrer a lista de servicos e
		//acumular todos os servicos realizados
		double acumulador = 0;
		for (Servico s : this.servicos)
			acumulador = acumulador + s.getValor();
		return acumulador;
	}
	
	public void addServico(Servico s) {
		if (this.servicos == null) {
			this.servicos = new ArrayList<>();
		}
		this.servicos.add(s);
	}
}
