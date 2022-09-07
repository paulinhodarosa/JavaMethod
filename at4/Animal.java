//Atividade 4
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/

import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.crypto.ExemptionMechanism;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Animal {
	private String nome;
    private int idade;

 

    public Animal(String nome, int idade) {
		this.nome = nome;
        this.idade = idade;
	}

    public static void SomAnimais(String filePath) {
        File sound = new File(filePath);
    
    
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(sound));
                clip.start();

            try {
                Thread.sleep(2000);
            } catch(InterruptedException n){
                Thread.currentThread().interrupt();
            }

                clip.stop();

            } catch (Exception s) {
                System.out.println("ERRO");
            }
    
        }
    public void mostrar() {
        System.out.printf("\nNome: " + nome + "\nIdade: " + idade);
    }


}
