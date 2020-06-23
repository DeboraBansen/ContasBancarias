package com.mod.dados;

public class ContaBancaria {
	private long cpf;
	protected float saldo;
	
	public ContaBancaria() {
		
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float sacar(float valor) {
		saldo-=valor;
		return valor;
	}
	public String gerarExtrato() {
		return "Saldo disponivel : R$"+this.saldo;
	}
	public String toString() {
		return "CPF:"+this.cpf;
	}
	
}
