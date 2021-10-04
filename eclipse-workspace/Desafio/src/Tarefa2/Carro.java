package Tarefa2;

public class Carro {
	public String modelo;
	public String cor;
	public String ano;
	public String marca;
	private String chassi;
	private String proprietario;
	public double velocMax;
	private double velocAtual;
	public int numPortas;
	public boolean temTetoSolar;
	public int numMarchas;
	public boolean temCambioAutomatico;
	public double volumeComb;
	
	public void acelera() {
		this.velocAtual++;
	}
	
	public void freia() {
		this.velocAtual = 0;
	}
	
	public void trocaMarcha() {
		this.numMarchas++;
	}
	
	public void reduzMarcha() {
		if (this.velocAtual > 0) {
			System.out.println("Abaixe a velocidade para dar marcha ré");
			return;
		}
		this.numMarchas--;
	}
	
	public void autonomia(double consumoMedio) {
		this.volumeComb /= consumoMedio;
	}
	
	public void exibirAutonomia(double consumo) {
		autonomia(consumo);
		System.out.println("Consumo médio: " + this.volumeComb);
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public double getVelocAtual() {
		return velocAtual;
	}
	public void setVelcAtual(double velcAtual) {
		this.velocAtual = velcAtual;
	}
}	
