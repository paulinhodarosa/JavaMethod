//Atividade 4
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/
public class Preguica extends Animal {
    private String acao;

    public Preguica(String nome, int idade, String acao){
        super(nome, idade);
        this.acao = acao;
    }

    public void mostrar() {
        super.mostrar();
        System.out.printf(acao);
     
    }

    public void GritoPreguica() {
        System.out.println("\nGrito!");
        super.SomAnimais("som/bichopreguiça.wav");
    }
}
