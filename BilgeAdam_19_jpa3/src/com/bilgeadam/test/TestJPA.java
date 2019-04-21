package com.bilgeadam.test;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.bilgeadam.models.Author;
import com.bilgeadam.models.Book;
import com.bilgeadam.models.Category;
import com.bilgeadam.models.Library;
import com.bilgeadam.serviceintf.CrudService;
import com.bilgeadam.services.BookService;
import com.bilgeadam.utils.EntityUtils;

public class TestJPA {

	private static final Logger logger = Logger.getLogger(TestJPA.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);
		persistMockData();
		//testBookService();
	}
	
	public static void testBookService() {
		BookService bookService = new BookService();
		bookService.findAll().stream().forEach(System.out::println);
//		
//		System.out.println(bookService.findbyId(1));;
		
		//bookService.deleteFromDatabase(3);
		
	}
	
	
	public static void persistMockData() {
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");
		em.getTransaction().begin();
		
		Author author1 = new Author("Dan Brown", "Rome/Italy","+145215112");
		Author author2 = new Author("JRR Tolkien", "Nice/Italy","+145215782");
		Author author3 = new Author("Orhan Pamuk", "Istanbul/Turkey","+9055487541");
		Author author4 = new Author("Koray Güney", "Ankara/Turkey","+90578554695");
		
		Library library1 = new Library("Central Library");
		Library library2 = new Library("Side-village Library");
		
		Book book1 = new Book("Yüzüklerin Efendisi 1", 16543431651L, 30, Category.SCI_FI, author2);
		Book book2 = new Book("Yüzüklerin Efendisi 2", 16532316501L, 45, Category.DRAMA, author1);
		Book book3 = new Book("Yüzüklerin Efendisi 3", 16576731651L, 23, Category.SCI_FI, author3);
		Book book4 = new Book("Yüzüklerin Efendisi 4", 16516443451L, 30, Category.KIDS, author4);
		
//		book1.getLibraries().add(library1);
//		book2.getLibraries().add(library1);
//		book2.getLibraries().add(library2);
//		book3.getLibraries().add(library2);
//		book4.getLibraries().add(library1);
//		
//		em.persist(author1);
//		em.persist(author2);
//		em.persist(author3);
//		em.persist(author4);
//		
//		em.persist(book1);
//		em.persist(book2);
//		em.persist(book3);
//		em.persist(book4);
//		
//		em.persist(library1);
//		em.persist(library2);
//		
//		logger.info("All data persisted");
		
		BookService bookService = new BookService();
		//bookService.updateAtDatabase(book1);
		
		bookService.findAll().stream().forEach(System.out::println);
		
		em.getTransaction().commit();
	}

}
