package br.ufac.academico.repositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.ufac.academico.entidades.Aluno;

public class AlunoRepositorio {

	EntityManagerFactory emf;
	EntityManager em;

	public AlunoRepositorio(){
		emf = Persistence.createEntityManagerFactory("AcademicoPU");
		em = emf.createEntityManager();
	}

	public void adicionar(Aluno aluno){

		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		
	}
	
	public Aluno recuperar(int id){
		return em.find(Aluno.class, id);
	}
	
	public void atualizar(Aluno aluno){
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
	}
	
	public void remover(Aluno aluno){
		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> recuperarTodos(){

		Query qrAlunos = em.createQuery("select aluno from Aluno aluno");
		
		return qrAlunos.getResultList();
	}
	
	public void encerrar(){
		em.close();
		emf.close();
	}

}
