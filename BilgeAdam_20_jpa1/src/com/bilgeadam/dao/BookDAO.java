package com.bilgeadam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bilgeadam.models.Book;
import com.bilgeadam.utils.EntityUtils;

public class BookDAO implements CrudRepository<Book> {

	@Override
	public List<Book> findAll() {
		EntityManager em = null;
		List<Book> booklist = null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			//booklist = em.createQuery("SELECT b FROM Book b").getResultList();
			booklist = em.createNamedQuery("findAllBooks").getResultList();
		} finally {
			EntityUtils.closeEntityManager(em);
		}
		return booklist;
	}

	@Override
	public Book findById(int id) {
		
		EntityManager em = null;
		Book foundbook;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			//foundbook = em.find(Book.class, id);
			foundbook = (Book) em.createNamedQuery("findBookById").setParameter("bookid", id).getSingleResult();
		} finally {
			EntityUtils.closeEntityManager(em);
		}
		return foundbook;
	}

	@Override
	public void persistToDB(Book book) {
		EntityManager em = null;
		Book foundbook;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			em.persist(book);
			em.getTransaction().commit();
		} finally {
			EntityUtils.closeEntityManager(em);
		}
	}

	@Override
	public void deleteFromDB(int id) {
		
		EntityManager em = null;
		Book foundbook;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			Book  book = em.find(Book.class, id);
			em.remove(book);
			em.getTransaction().commit();
		} finally {
			EntityUtils.closeEntityManager(em);
		}
		
		
	}

	@Override
	public void deleteFromDB(Book b) {
		EntityManager em = null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			Book foundbook = em.createQuery("SELECT b FROM Book b WHERE b.book_name =:bookname", Book.class).setParameter("bookname", b.getBook_name()).getSingleResult();
			Book  book = em.find(Book.class, foundbook.getBook_id());
			em.remove(book);
			em.getTransaction().commit();
		} finally {
			EntityUtils.closeEntityManager(em);
		}
	}

	@Override
	public void updateAtDB(String b) {
		EntityManager em = null;
		try {
			em = EntityUtils.getEntityManager("mysqlPU");
			em.getTransaction().begin();
			Book foundbook = em.createQuery("SELECT b FROM Book b WHERE b.book_name =:bookname", Book.class).setParameter("bookname", b).getSingleResult();
			
			foundbook.setBook_price(1000);
			
			em.merge(foundbook);
			em.getTransaction().commit();
		} finally {
			EntityUtils.closeEntityManager(em);
		}
	}

	@Override
	public boolean isExistsOnDB(Book t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
}
