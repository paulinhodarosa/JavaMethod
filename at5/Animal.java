//Atividade 5
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/


public class Animal {
	private String nome;
    private int idade;
    // private String som;


    public Animal(String nome, int idade) {
		this.nome = nome;
        this.idade = idade;
	}

    public void mostrar() {
        System.out.printf("paciente " + nome + " examinado\n");
    }

    public void SomAnimais() {
        // this.som = som;
        System.out.println("Som emitido");
        
        }

}



