//Atividade 4
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/
public class MainAnimal {
    private String acao;
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("Bisonho", 10, "\nCorrendo");
        Preguica sono = new Preguica("Sid", 7, "\nSubindo na árvore");
        Cao cao = new Cao("Billy", 5, "\nCorrendo");
        
        cao.mostrar();
        cao.Latido();

        cavalo.mostrar();
        cavalo.Relincho();

        sono.mostrar();
        sono.GritoPreguica();

        // cao.mostrar();
		// cavalo.mostrar();
        // sono.mostrar();

    }
}