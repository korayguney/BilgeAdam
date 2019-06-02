package mbean;

import java.io.File;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import models.Book;
import models.Books;

@ManagedBean
public class BookBean {
	
	
	private JAXBContext context;
	private File file;
	private List<Book> books;
	private double sum = 0.0;
	
	@PostConstruct
	public void init() throws JAXBException {
		context = JAXBContext.newInstance(Books.class);
		file = new File("D:\\BilgeAdam\\26.Hafta (01-02 Haziran 2019)\\book.xml");
		books = ((Books)context.createUnmarshaller().unmarshal(file)).getBooks();
	}

	public double getTotal() {
		/*
		
		books.stream().forEach(new Consumer<Book>() {

			@Override
			public void accept(Book t) {
				sum += t.getPrice();
			}
		});
		 */
		books.stream().forEach(t -> sum += t.getPrice());
		return sum;
	}
	
	
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
}
