package com.hib.jpaHib.entity.dto;


public class ProdutoDTO {

	

	private Long id;
	
	private String nome;

	private int quantidade;

	private double valor;
	
	
	
	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(Long id, String nome, int quantidade, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
