package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.util.Evento;

public class Conta {
	
	private int    numero;
	private String agencia;
	private String titular;
	protected double saldo;
	private Data   dataAbertura;
	private int    Identificador; 

	//CONSTRUTORES
	
	public Conta(){
		
	}
	
	public Conta(String titular){
		this.titular = titular;
	}
	
	//FIM CONSTRUTORES
	
	
	//MÉTODOS DE ACESSO GET & SET
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setDataAbertura(Data data) {
		this.dataAbertura = data;
	}
	
	public String getTipo() {
		
		return "Conta";
	}

	//FIM MÉTODOS DE ACESSO
	
	
	//MÉTODOS DA CLASSE
	
	public void saca(double valor) {
			this.saldo = this.saldo - valor;
		}

	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public double calculaRendimento() {
		double rendimento = 0.0;
		rendimento += this.saldo;
		return rendimento;
	}
	
	public String recuperaDadosParaImpressao() {
		String dados;
		dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.agencia;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nData de Abertura: " + this.dataAbertura.formatada(); 	
		return dados;
		
	}
}
