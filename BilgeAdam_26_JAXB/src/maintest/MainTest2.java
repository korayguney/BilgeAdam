package maintest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import entity.Book;

public class MainTest2 {

	public static void main(String[] args) throws JAXBException {
		
		File file = new File("D:\\BilgeAdam\\26.Hafta (01-02 Haziran 2019)\\book.xml");
	
		JAXBContext context = JAXBContext.newInstance(Book.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Book book = (Book)unmarshaller.unmarshal(file);
		System.out.println("======================================");
		System.out.println("Book ISBN : " + book.getISBN());
		System.out.println("Book name : " + book.getName());
		System.out.println("Book author : " + book.getAuthor().getName());
		System.out.println("Book price : " + book.getPrice());
		System.out.println("======================================");
		
		
		
	}

}
