package com.bilgeadam.testDAO;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.bilgeadam.dao.BookDAO;
import com.bilgeadam.models.Author;
import com.bilgeadam.models.Book;
import com.bilgeadam.models.Category;
import com.bilgeadam.models.Library;
import com.bilgeadam.utils.EntityUtils;

public class TestJPA {

	private static final Logger logger = Logger.getLogger(TestJPA.class.getName());
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.getRootLogger().setLevel(Level.INFO);
		
		persistDumbRecordToDB();
		
	}

	private static void persistDumbRecordToDB() {
		
		Author author1 = new Author("Orhan Pamuk");
		Author author2 = new Author("Azra Kohen");
		Author author3 = new Author("Duygu Asena");
		Author author4 = new Author("Dan Brown");
		Author author5 = new Author("JK Rowling");
		
		Library library1 = new Library("Centeral Lib", "Atatürk cad.Pendik/Ýstanbul");
		Library library2 = new Library("Big Lib", "Ýnönü cad.Kadýköy/Ýstanbul");
		
		Book book1 = new Book("Kar", 25, LocalDate.of(2000, 5, 15), 651686515L, Category.TRAVELLING);
		Book book2 = new Book("Melekler ve Þeytanlar", 30, LocalDate.of(2012, 4, 15), 7463746432L, Category.SCIFI);
		Book book3 = new Book("Fi", 28, LocalDate.of(2015, 12, 23), 556456151L, Category.IT);
		Book book4 = new Book("Harry Potter and Philosopher's Stone", 34, LocalDate.of(2001, 3, 15), 546845656L, Category.SCIFI);
		Book book5 = new Book("Uzun Ýnce Bulut:Gelibolu", 36, LocalDate.of(2016, 1, 15), 565565616L, Category.HISTORY);
		
		book1.getLibraries().add(library1);
		book2.getLibraries().add(library1);
		book2.getLibraries().add(library2);
		book3.getLibraries().add(library2);
		book4.getLibraries().add(library1);
		book5.getLibraries().add(library1);
		book5.getLibraries().add(library2);
		
		book1.setAuthor(author1);
		book2.setAuthor(author4);
		book3.setAuthor(author2);
		book4.setAuthor(author5);
		book5.setAuthor(author3);
		
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");
//		em.getTransaction().begin();
//		
//		/*
//		 * Persist books to DB
//		 */
//		em.persist(book5);
//		em.persist(book4);
//		em.persist(book3);
//		em.persist(book2);
//		em.persist(book1);
//
//		/*
//		 * Persist authors to DB
//		 */
//		em.persist(author1);
//		em.persist(author2);
//		em.persist(author3);
//		em.persist(author4);
//		em.persist(author5);
//		
//		/*
//		 * Persist libraries to DB
//		 */
//		em.persist(library1);
//		em.persist(library2);
//		
//		em.getTransaction().commit();
		
		BookDAO bookDAO = new BookDAO();
//		List<Book> books = bookDAO.findAll();
//		
//		for (Book book : books) {
//			System.out.println(book);
//		}
//		
//		Book book = bookDAO.findById(3);
//		logger.info(book);
		
//		books.stream().forEach(book -> System.out.println(book));;
		
//		EntityUtils.closeEntityManager(em);
		
//		Author author6 = new Author("JRR Tolkien");
//		
//		Book book6 = new Book("Yüzüklerin Efendisi: Ýki Kule", 26, LocalDate.of(2000, 5, 15), 156165561L, Category.SCIFI); 
//		bookDAO.persistToDB(book6);

//		bookDAO.deleteFromDB(book1);
		
//		bookDAO.updateAtDB("Fi");
		
//		List<Book> books = bookDAO.findAll();
//		
//		for (Book book : books) {
//			logger.info(book);
//		}
		
	//	List<Book> foundbook = em.createNamedQuery("getFirstBook", Book.class).getResultList();
		List<Book> foundbook = em.createNativeQuery("SELECT * FROM book WHERE bookprice >= 500", Book.class).getResultList();
		
		logger.info("----> "+foundbook.get(0));
		
		EntityUtils.closeEntityManager(em);
		
		
		logger.info("Book is found");
		
	}
	
	
	
	
	
}
