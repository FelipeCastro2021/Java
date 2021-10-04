package Tarefa2;

public class Proprietario {
	public String nome;
	private double cpf;
	private double rg;
	private String dataNasc;
	
	public Proprietario(String nome, double cpf, double rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public double getRg() {
		return rg;
	}

	public void setRg(double rg) {
		this.rg = rg;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}
