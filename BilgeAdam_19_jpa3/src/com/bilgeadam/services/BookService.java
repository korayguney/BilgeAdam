package com.bilgeadam.services;

import java.util.List;

import javax.persistence.EntityManager;

import com.bilgeadam.models.Book;
import com.bilgeadam.serviceintf.CrudService;
import com.bilgeadam.utils.EntityUtils;

public class BookService implements CrudService<Book> {
	
	@Override
	public List<Book> findAll() {
		List<Book> books;
		EntityManager em = null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			//books = em.createQuery("select b from Book b", Book.class).getResultList();
			books = em.createNamedQuery("findAllBook").getResultList();
		} finally {
			em.clear();
			EntityUtils.closeEntityManager(em);
		}
		return books;
	}

	@Override
	public Book findbyId(int id) {
		Book book;
		EntityManager em =null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			book = em.find(Book.class, id);
		} finally {
			em.clear();
			EntityUtils.closeEntityManager(em);
		}
		return book;
	}

	@Override
	public void persistToDatabase(Book book) {
		EntityManager em =null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			em.persist(book);
			System.out.println("persisted");
			em.getTransaction().commit();
		} finally {
			em.clear();
			EntityUtils.closeEntityManager(em);
		}
	}

	@Override
	public void deleteFromDatabase(int id) {
		EntityManager em =null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			Book foundbook = em.find(Book.class, id);
			em.remove(foundbook);
			System.out.println("removed");
			em.getTransaction().commit();
		} finally {
			em.clear();
			EntityUtils.closeEntityManager(em);
		}
	}

	@Override
	public void updateAtDatabase(Book book) {
		EntityManager em =null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			Book foundbook=null;
			if(book.getBook_id() == 0) {
				foundbook = findbyId(book.getBook_id()+1);
			} else {
				foundbook = findbyId(book.getBook_id());
			}
			foundbook.setBook_price(100);
			em.merge(foundbook);
			System.out.println("updated");
			em.getTransaction().commit();
		} finally {
			em.clear();
			EntityUtils.closeEntityManager(em);
		}
	}

	@Override
	public boolean existsAtDatabase(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteFromDatabase(Book object) {
		// TODO Auto-generated method stub
		
	}

	
}
