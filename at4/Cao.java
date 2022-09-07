//Atividade 4
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/
public class Cao extends Animal{
    private String acao;

    public Cao(String nome, int idade, String acao){
        super(nome, idade);
        this.acao = acao;
    }


    public void mostrar() {
        super.mostrar();
        System.out.printf(acao);

    }

    public void Latido() {
        System.out.println("\nLatido!");
        super.SomAnimais("som/cao.wav");
    }

}