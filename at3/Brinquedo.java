//Atividade 3
/* IFPR Campus Cascavel
Aluno: Paulo Henrique da Rosa
Professor: Nelson Bellicanta
Disciplina: Programação Orientada à Objetos (POO)
*/
public class Brinquedo {
    private String nome;
    private String faixaEtaria;
    private Float preco;
     
    
    public Brinquedo(String nome) {
       this.nome =nome;
    }

    public Brinquedo(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }


        // set e get Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return nome;
    }

        // set e get Preço
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Float getPreco(float preco) {
        return preco;
    }

    public void mostrar() {
        System.out.printf("\nNome: " + this.nome + "\nPreço: R$ " + this.preco + "\nFaixa etaria: " + this.faixaEtaria);
    }
                // set e get Faixa Etaria
    
        public String getFaixa(String faixaEtaria) {
            return faixaEtaria;
        }
        public void setFaixa(String faixaEtaria) {
            String[] valores = {"0-2","3-5","6-10", "10+"};
            
        boolean out = false;
        for(String i : valores) {
            if (i == faixaEtaria) {
                out = true;
                    break;
            }
        }
    
           if (out) {
            this.faixaEtaria = faixaEtaria;
         } 
         
        
    }
    
}