package main.java;

public class FabricaGuerreiro implements FabricaAbstrata {

    @Override
    public Arma createArma() {
        return new Espada();
    }

    @Override
    public Armadura createArmadura() {
        return new ArmaduraPesada();
    }

    @Override
    public Classe createClasse() {
        return new Guerreiro();
    }
}