package main.java;

public class Personagem {

    private Arma arma;
    private Armadura armadura;
    private Classe classe;

    public Personagem(FabricaAbstrata fabrica) {
        this.arma = fabrica.createArma();
        this.armadura = fabrica.createArmadura();
        this.classe = fabrica.createClasse();
    }

    public String getArma() {
        return this.arma.defArma();
    }

    public String getArmadura() {
        return this.armadura.defArmadura();
    }

    public String getClasse() {
        return this.classe.defClasse();
    }
}
