import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		 Scanner leitor = new Scanner(System.in);
		 
		 int idade;
		 double media=0;
		 int numalunos=0;
		 int quantidade;
		 
		 System.out.println("qtos alunos tem na turma?");
		 quantidade = leitor.nextInt();
		 
		 while (numalunos < quantidade) {
			 numalunos = numalunos + 1;
			 System.out.println("Digite a idade aluno " + numalunos);
			 idade = leitor.nextInt();
			 media = media + idade;
		 }
		
		 media = media / (double)numalunos;
		 
		 System.out.println(media);
				 
		leitor.close();		 

		}
	}


