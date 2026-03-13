package br.com.fiapride.model;

public class Veiculo {

    private String nomeDono, placa, modelo;
    private double capacidadeTanque, quantidadeTotalCombustivel;

    public Veiculo(String nomeDono, String placa, String modelo, double capacidadeTanque){
        this.setNomeDono(nomeDono);
        this.setPlaca(placa);
        this.setModelo(modelo);
        this.setCapacidadeTanque(capacidadeTanque);
        this.setQuantidadeTotalCombustivel(0);

    }

    public void abastecerVeiculo(double litroConbustivel){
        if (litroConbustivel > capacidadeTanque){
            System.err.println("Erro de Segurança: Quantidade maior do que a suportada no tanque do veículo!");
            return;
        }
        if (litroConbustivel <= 0) {
            System.err.println("Erro de Segurança: Tentativa de abastecer com valor negativo bloqueada!");
        }
        this.quantidadeTotalCombustivel += litroConbustivel;
        System.out.println("Veículo abastecido com sucesso! Quantidade atual: " + this.quantidadeTotalCombustivel + " litros.");
    }

    public void gastarCombustivel(double litroGasto){
        if (litroGasto > capacidadeTanque){
            System.err.println("Erro de Segurança: Impossível gastar mais que a quantidade suportada no tanque do veículo!");
            return;
        }
        if (litroGasto < 0) {
            System.err.println("Erro de Segurança: ");
        }
        this.quantidadeTotalCombustivel -= litroGasto;
        System.out.println("Gasto registrado! Quantidade atual: " + this.quantidadeTotalCombustivel + " litros.");
    }


    public String getNomeDono() {
        return nomeDono;
    }

    private void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    private void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getQuantidadeTotalCombustivel() {
        return quantidadeTotalCombustivel;
    }

    private void setQuantidadeTotalCombustivel(double litroConbustivel) {
        if (litroConbustivel <= capacidadeTanque){
            if (litroConbustivel >= 0) {
                this.quantidadeTotalCombustivel = litroConbustivel;
            } else {
                System.err.println("Erro de Segurança: Tentativa de abastecer com valor negativo bloqueada!");
            }

        } else {
            System.err.println("Erro de Segurança: Quantidade maior do que a suportada no tanque do veículo!");
        }
    }
}

