package main.java;

public class FabricaArqueiro implements FabricaAbstrata {

    @Override
    public Arma createArma() {
        return new Arco();
    }

    @Override
    public Armadura createArmadura() {
        return new ArmaduraLeve();
    }

    @Override
    public Classe createClasse() {
        return new Arqueiro();
    }
}