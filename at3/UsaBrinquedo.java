//Atividade 3
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/
public class UsaBrinquedo {
    
    public static void main(String [] Args) {
		Brinquedo brinquedo1 = new Brinquedo("bolinha de gude", 1);
        Brinquedo brinquedo2 = new Brinquedo("corda");
        Brinquedo brinquedo3 = new Brinquedo("carrinho de controle remoto");
        Brinquedo brinquedo4 = new Brinquedo("boneca de pano", 19.9f);


        brinquedo1.setFaixa("10+");
        brinquedo1.setNome("Bolita");
        brinquedo2.setPreco(7.90f);
        brinquedo2.setFaixa("6-10");
        brinquedo3.setFaixa("10+");
        brinquedo3.setPreco(59.90f);
        brinquedo4.setFaixa("0-2");

        brinquedo1.mostrar();
        brinquedo2.mostrar();
        brinquedo3.mostrar();
        brinquedo4.mostrar();
        

	}
}