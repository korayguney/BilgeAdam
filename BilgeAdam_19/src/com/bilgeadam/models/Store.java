package com.bilgeadam.models;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

/*
 * POJO (Plain Old Java Object) ---> Model
 */
@Entity
@SqlResultSetMapping(name = "StoreMapping", 
classes = @ConstructorResult(
		targetClass = Store.class, 
		columns = {@ColumnResult(name = "storename"),
			   @ColumnResult(name = "storeaddress")}
		)
)
public class Store {
	
	@Id
	@GeneratedValue
	//@Column(columnDefinition = "BINARY(16)",updatable=false)
	private int id;
	
	//@Column(name="store_name",length=50,nullable=false,updatable=true)
	private String storename;
	private double storearea;
	private String storeaddress;
	
	public Store() {

	}
	
	public Store(String storename, String storeaddress) {
		super();
		this.storename = storename;
		this.storeaddress = storeaddress;
	}
	
	public Store(String storename, double storearea, String storeaddress) {
		super();
		this.storename = storename;
		this.storearea = storearea;
		this.storeaddress = storeaddress;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public double getStorearea() {
		return storearea;
	}

	public void setStorearea(double storearea) {
		this.storearea = storearea;
	}

	public String getStoreaddress() {
		return storeaddress;
	}

	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", storename=" + storename + ", storearea=" + storearea + ", storeaddress="
				+ storeaddress + "]";
	}
	
}
