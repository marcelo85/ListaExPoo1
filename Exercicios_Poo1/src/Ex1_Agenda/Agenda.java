package Ex1_Agenda;

public class Agenda {
	int quantContatos = 2;
	 Contato contatos[] = new Contato[quantContatos];
	 
	 public void adicionarNovoContato(Contato c){
		 boolean sucesso = false;
		 
		 for(int i = 0; i < quantContatos; i++){
		      if(contatos[i] == null){
		        
		        contatos[i] = c;
		        sucesso = true;
		        break;
		      }
		 }
		 
		 if(sucesso){
			 System.out.println("\nContato cadastrado com sucesso.\n");
		 }
		 else{
		      System.out.println("\nErro: Lista de contatos cheia.\n");
		 }
	 }
	 
	 public Contato pesquisarContato(String nome){
		    Contato contato = null;
		     
		    for(int i = 0; i < contatos.length; i++){

		      if((contatos[i] != null) && (contatos[i].nome.equals(nome))){
		        contato = contatos[i];
		        break;
		      }
		    }
		     
		    return contato;
	}
		   

		  public void excluirContato(String nome){
		    Contato contato = null;
		    boolean excluido = false;
		     

		    for(int i = 0; i < contatos.length; i++){

		      if((contatos[i] != null) && (contatos[i].nome.equals(nome))){
		        contatos[i] = null;
		        System.out.println("\nContato excluído com sucesso.\n");
		        excluido = true;
		        break;
		      }
		    }
		     
		    if(!excluido){
		      System.out.println("\nContato não encontrado.\n");
		    }
		  }

}
