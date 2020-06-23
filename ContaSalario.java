package com.mod.dados;

public class ContaSalario extends ContaBancaria {
	private long cnpjEmpresa;
	
	public long getCnpjEmpresa() {
		
		return cnpjEmpresa;
		
	}
	
	public void setCnpjEmpresa(long cnpjEmpresa) {
		
		this.cnpjEmpresa = cnpjEmpresa;
		
	}
	
	public ContaSalario() {
		super();
	}
	
	public boolean depositar(float valor, long cnpjEmpresa) {
		if(cnpjEmpresa==this.cnpjEmpresa) {
			this.saldo+=valor;
			return true;
		}
		return false;
	}
	public String gerarExtrato() {
		return "Conta Salario: \n"+"CNPJ da empresa: "+this.cnpjEmpresa+"\n"+super.gerarExtrato();
	}
	public String toString() {
		return "Conta Salario: \n"+super.toString()+"\n"+"CNPJ: "+this.cnpjEmpresa;
	}
}
