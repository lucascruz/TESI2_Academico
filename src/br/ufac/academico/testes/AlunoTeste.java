package br.ufac.academico.testes;

import br.ufac.academico.entidades.Aluno;
import br.ufac.academico.repositorios.AlunoRepositorio;

public class AlunoTeste {

	public static void main(String[] args) {

		AlunoRepositorio ar = new AlunoRepositorio();
	
		Aluno a = new Aluno();
		Aluno b = new Aluno();
		Aluno c = new Aluno();
		
		
		a.setNome("Macilon");
		a.setIdade(39);		
		
		b.setNome("Joao");
		b.setIdade(38);	
		
		c.setNome("Pedro");
		c.setIdade(37);	
		
		
		ar.adicionar(a);
		ar.adicionar(b);
		ar.adicionar(c);
		
		ar.encerrar();


	}

}
