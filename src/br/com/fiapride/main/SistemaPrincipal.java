package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("+____________________Iniciando o Sistema FiapRide__________________________+\n");

        Veiculo veiculo1 = new Veiculo("Carlos", "ABC-1234", "HB20",50.0);

        System.out.println("+----------------- Informações do veículo -----------------+");
        System.out.println("| Dono: " + veiculo1.getNomeDono());
        System.out.println("| Placa: " + veiculo1.getPlaca());
        System.out.println("| Modelo: " + veiculo1.getModelo());
        System.out.println("| Capacidade do tanque: " + veiculo1.getCapacidadeTanque());
        System.out.println("| Quantidade total de combustível atual: " + veiculo1.getQuantidadeTotalCombustivel());
        System.out.println("+----------------------------------------------------------+\n");
        System.out.println(">>> Abastecer " + veiculo1.getModelo() + " de " + veiculo1.getNomeDono());
        veiculo1.abastecerVeiculo(50.0);
        System.out.println("\n--- Realizando Viagens ---\n");
        System.out.println(">>> Veículo gastou 10L durante a viagem.");
        veiculo1.gastarCombustivel(10.0);



    }
}
