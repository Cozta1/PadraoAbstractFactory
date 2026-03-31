package test.java;

import main.java.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveRetornarArmaGuerreiro() {
        FabricaAbstrata fabrica = new FabricaGuerreiro();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Espada grande - Dano: 50", personagem.getArma());
    }

    @Test
    void deveRetornarArmaArqueiro() {
        FabricaAbstrata fabrica = new FabricaArqueiro();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Arco - Dano: 20", personagem.getArma());
    }

    @Test
    void deveRetornarArmaduraGuerreiro() {
        FabricaAbstrata fabrica = new FabricaGuerreiro();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Armadura Pesada - Defesa: 50", personagem.getArmadura());
    }

    @Test
    void deveRetornarArmaduraArqueiro() {
        FabricaAbstrata fabrica = new FabricaArqueiro();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Armadura Leve - Defesa: 20", personagem.getArmadura());
    }

    @Test
    void deveRetornarClasseGuerreiro() {
        FabricaAbstrata fabrica = new FabricaGuerreiro();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Classe: Guerreiro - Ataca à curta distancia", personagem.getClasse());
    }

    @Test
    void deveRetornarClasseArqueiro() {
        FabricaAbstrata fabrica = new FabricaArqueiro();
        Personagem personagem = new Personagem(fabrica);
        assertEquals("Classe: Arqueiro - Ataca à longa distância", personagem.getClasse());
    }
}