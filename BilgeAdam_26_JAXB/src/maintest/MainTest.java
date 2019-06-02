package maintest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import entity.Author;
import entity.Book;

public class MainTest {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Book book = new Book(15478256934L, "Harry Potter and Secret of Chambers", new Author("J.K.Rowling", 55), 26.50);
		
		JAXBContext context = JAXBContext.newInstance(Book.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(book, new FileOutputStream(new File("D:\\BilgeAdam\\26.Hafta (01-02 Haziran 2019)\\book.xml")));
		
		System.out.println("Finished");
		
		
	}

}
