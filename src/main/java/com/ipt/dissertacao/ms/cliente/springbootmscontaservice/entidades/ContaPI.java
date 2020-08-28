package com.ipt.dissertacao.ms.cliente.springbootmscontaservice.entidades;

import java.util.*;
import javax.persistence.*;

@Entity(name = "conta_pi")
public class ContaPI {
	@OneToOne
	@JoinColumn(name="fk_dict")
	DICT dict;
	
	@OneToMany(mappedBy = "conta")
	List<Movimento> movimentos = new ArrayList<Movimento>();
	
	@Id
	long Id;
	@Column(name="saldo_total")
	double saldoTotal;
	@Column(name="saldo_bloqueado")
	double saldoBloqueado;
	@Column(name="situacao_conta")
	String situacaoConta;
	@Column(name="id_cliente")//é uma fk para dados de outro micro serviço
	long idCliente;
	@Column(name="data_criacao")
	Date dataCriacao;
	public DICT getDict() {
		return dict;
	}
	public void setDict(DICT dict) {
		this.dict = dict;
	}
	public List<Movimento> getMovimentos() {
		return movimentos;
	}
	public void setMovimentos(List<Movimento> movimentos) {
		this.movimentos = movimentos;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}
	public double getSaldoBloqueado() {
		return saldoBloqueado;
	}
	public void setSaldoBloqueado(double saldoBloqueado) {
		this.saldoBloqueado = saldoBloqueado;
	}
	public String getSituacaoConta() {
		return situacaoConta;
	}
	public void setSituacaoConta(String situacaoConta) {
		this.situacaoConta = situacaoConta;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
