public class MainAnimal {
    // private String acao; 
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo("Bisonho", 10);
        Preguica sono = new Preguica("Sid", 7);
        Cachorro cao = new Cachorro("Billy", 5);
        
        Veterinario.examinar(cao);
        System.out.println("\n");
            //  ---------------------------->
        Veterinario.examinar(cavalo);
        System.out.println("\n");
            //  ---------------------------->  
        Veterinario.examinar(sono);
        System.out.println("\n");
    }
}


