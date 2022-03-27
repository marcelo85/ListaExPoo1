package Ex1_Agenda;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
	    String nome, email;
	    Contato c;
	     
	    
	    Agenda agenda = new Agenda();
	     
	    
	    while(true){
	      System.out.println("1. Cadastrar Novo Contato");
	      System.out.println("2. Pesquisar Contato");
	      System.out.println("3. Excluir Contato");
	      System.out.println("4. Sair");
	      System.out.print("Sua opção: ");
	      int opcao = Integer.parseInt(entrada.nextLine());
	       
	      switch(opcao){
	        case 1: 
	          System.out.print("\nNome: ");
	          nome = entrada.nextLine();
	          System.out.print("E-Mail: ");
	          email = entrada.nextLine();
	          
	          c = new Contato();
	          c.nome = nome;
	          c.email = email;
	          
	          agenda.adicionarNovoContato(c);
	          break;
	           
	        case 2: 
	          System.out.print("\nInforme o Nome: ");
	          nome = entrada.nextLine();
	           
	          
	          c = agenda.pesquisarContato(nome);
	          if(c == null){
	            System.out.println("\nContato não encontrado.\n");
	          }
	          else{
	            System.out.println("Contato encontrado:\nNome: " + c.nome +
	              "; E-Mail: " + c.email + "\n");
	          }
	           
	          break;
	           
	        case 3:
	          System.out.print("\nInforme o Nome: ");
	          nome = entrada.nextLine();
	           
	          
	          agenda.excluirContato(nome);
	           
	          break;
	           
	        case 4:
	          System.exit(0);
	      }
	    }

	}

}
