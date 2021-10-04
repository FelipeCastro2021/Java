package Tarefa2.teste;

import Tarefa2.Carro;
import Tarefa2.Endereco;
import Tarefa2.Marca;
import Tarefa2.Proprietario;

public class VeiculoTeste {
    public static void main(String[] args) {
	Carro car = new Carro();
	Proprietario pessoa = new Proprietario("Felipe Castro Ferreira", 52645678913D, 463019194);
	Endereco end = new Endereco("Rua dos Palmares", "Vila das Palmeiras", "Guarulhos", "SP", 08422225D, " ");
	Marca marca = new Marca();

	System.out.println(end.getBairro());

	for (int i = 0; i < 1200; i++) {
	    car.acelera();
	}

	System.out.println("Velocidade atual: " + car.getVelocAtual() + "Km/h");

	car.freia();

	System.out.println("Velocidade atual: " + car.getVelocAtual());
    }
}
