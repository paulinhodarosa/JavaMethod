//Atividade 4
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/
public class Cavalo extends Animal{
    private String acao;

    public Cavalo(String nome, int idade, String acao){
        super(nome, idade);
        this.acao = acao;
    }


    public void mostrar() {
        super.mostrar();
        System.out.printf(acao);

    }

    public void Relincho() {
        System.out.println("\nRelincho!");
        super.SomAnimais("som/cavalo.wav");
    }

}
