package com.mod.negocios;
import com.mod.dados.*;
public class Sistema {
	private ContaBancaria[] contasBancaria=new ContaBancaria[100];
	private int quantidade=0;
	
	public boolean cadastrarConta(ContaBancaria conta) {
		if(quantidade<100) {
			this.contasBancaria[quantidade]=conta;
			quantidade++;
			return true;
		}
		return false;
	}
	public String realizarSaque(ContaBancaria conta, float valor) {
		conta.sacar(valor);
		return this.obterExtrato(conta);
	}
	public boolean realizarDeposito(ContaCorrente conta,float valor) {
		return conta.depositar(valor);
	}
	public boolean realizarDeposito(ContaSalario conta, float valor,long cnpj) {
		return conta.depositar(valor, cnpj);
	}
	public ContaCorrente[] getContaCorrente() {
		int max=0;
		
		for(int i=0;i<quantidade;i++) {
			if(contasBancaria[i]instanceof ContaCorrente) {
				max++;
			}
		}
		ContaCorrente[] contasCorrente=new ContaCorrente[max];
		int qnt=0;
		for(int i=0;i<quantidade;i++) {
			if(contasBancaria[i] instanceof ContaCorrente) {
				contasCorrente[qnt]=(ContaCorrente)contasBancaria[i];
				qnt++;
			}
		}
		return contasCorrente;
	}
	public ContaSalario[] getContasSalario() {
        int max=0;
		
		for(int i=0;i<quantidade;i++) {
			if(contasBancaria[i]instanceof ContaSalario) {
				max++;
			}
		}
		ContaSalario[] contasSalario=new ContaSalario[max];
		int qnt=0;
		for(int i=0;i<quantidade;i++) {
			if(contasBancaria[i] instanceof ContaSalario) {
				contasSalario[qnt]=(ContaSalario)contasBancaria[i];
				qnt++;
			}
		}
		return contasSalario;
	}
	public int getQuantidadeContas() {
		return this.quantidade;
	}
	public ContaBancaria[] getContasBancarias() {
		return contasBancaria;
	}
	public String obterExtrato(ContaBancaria conta) {
		return conta.gerarExtrato();
	}
}
