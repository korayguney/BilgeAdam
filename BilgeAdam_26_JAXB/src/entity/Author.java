package entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author {
	
	private String name;
	private int age;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Author(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
