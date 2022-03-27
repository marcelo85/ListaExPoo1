package Ex3_ArvoreGenealogica;

public class Programa {

	public static void main(String[] args) {
		
		Mae mae = new Mae("Maria Rita",64);
        Pai pai = new Pai("Ricardo",67);
        Filho filho = new Filho ("Marcelo",37);
        
        
        System.out.println("Nome :" + filho.getNome());
        System.out.println("Idade :" + filho.getIdade());
        System.out.println("Nome do Mãe :" + mae.getNome());
        System.out.println("Nome do Pai :" + pai.getNome());
               
    }

}
