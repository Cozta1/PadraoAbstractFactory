package main.java;

public interface FabricaAbstrata {
    Arma createArma();
    Armadura createArmadura();
    Classe createClasse();
}