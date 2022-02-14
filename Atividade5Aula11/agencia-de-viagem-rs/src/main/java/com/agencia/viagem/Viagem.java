package com.agencia.viagem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Viagem {
	
	@Id
	private Long idViagem;
	
	@Column(nullable = false)
	private String nomeCliente;
	
	@Column(nullable = false)
	private String datadeIda;
	
	@Column
	private String datadeVolta;
	
	@Column(nullable = false)
	private String origem;
	
	@Column(nullable = false)
	private String destino;
	
	@Column(nullable = false)
	private int idadeClientes;
	
	@Column(nullable = false)
	private String dadosCartao;
	
	@Column(nullable = false)
	private int numerodeParcelas;

	public Long getIdViagem() {
		return idViagem;
	}

	public void setIdViagem(Long idViagem) {
		this.idViagem = idViagem;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getDatadeIda() {
		return datadeIda;
	}

	public void setDatadeIda(String datadeIda) {
		this.datadeIda = datadeIda;
	}

	public String getDatadeVolta() {
		return datadeVolta;
	}

	public void setDatadeVolta(String datadeVolta) {
		this.datadeVolta = datadeVolta;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getIdadeClientes() {
		return idadeClientes;
	}

	public void setIdadeClientes(int idadeClientes) {
		this.idadeClientes = idadeClientes;
	}

	public String getDadosCartao() {
		return dadosCartao;
	}

	public void setDadosCartao(String dadosCartao) {
		this.dadosCartao = dadosCartao;
	}

	public int getNumerodeParcelas() {
		return numerodeParcelas;
	}

	public void setNumerodeParcelas(int numerodeParcelas) {
		this.numerodeParcelas = numerodeParcelas;
	}
	
}
