package br.edu.up;

import br.edu.up.model.Aluno;

public class Programa {

	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[3];
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Pedro";
		aluno1.matricula = "123";
		aluno1.nota1 = 10;
		aluno1.nota2 = 8;
		aluno1.nota3 = 7.5;
		
		alunos[0] = aluno1;
		
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Ana";
		aluno2.matricula = "321";
		aluno2.nota1 = 5;
		aluno2.nota2 = 10;
		aluno2.nota3 = 8;
		
		alunos[1] = aluno2;
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Carlos";
		aluno3.matricula = "231";
		aluno3.nota1 = 7;
		aluno3.nota2 = 6;
		aluno3.nota3 = 5.5;
		
		alunos[2] = aluno3;
		
		for (int i = 0; i < alunos.length; i++) {
			
			Aluno a = alunos[i];
			
			System.out.println("Nome " + a.nome );
			System.out.println("Nota 1:"  + a.nota1);
			System.out.println("Nota 2:" + a.nota2);
			System.out.println("Nota 3:" + a.nota3);
			
			System.out.println("Nota Final: " + a.getNotaFinal());
			
			
// 			System.out.println("Nota final: " + (a.nota1 + a.nota2 + a.nota3) /3);
			
//			double notaFinal = (a.nota1 + a.nota2 + a.nota3) /3;
//			System.out.println("Nota final:  " + notaFinal);
//			
			System.out.println();
			
			
		}
	}

}
