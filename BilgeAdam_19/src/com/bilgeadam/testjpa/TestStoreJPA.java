package com.bilgeadam.testjpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.bilgeadam.models.Store;

public class TestStoreJPA {

	public static void main(String[] args) {
		
		Store store1 = new Store("H&M", 1235.45 , "Hilltown AVM");
		Store store2 = new Store("Mavi Jeans", 535.45 , "Hilltown AVM");
		Store store3 = new Store("Ayakkabý Dünyasý", 105.60 , "Akasya AVM");
		Store store4 = new Store("Victoria Secret", 2200.45 , "Akasya AVM");
		Store store5 = new Store("Saat&Saat", 535.45 , "Akyaka AVM");
		Store store6 = new Store("Zara", 3200.50 , "Nautilus AVM");
		
		List<Store> stores = new ArrayList<>();
		stores.add(store1);
		stores.add(store2);
		stores.add(store3);
		stores.add(store4);
		stores.add(store5);
		stores.add(store6);
		
		//persistStore(stores);
		//findStore(5);
		//updateStore("Akyaka AVM", "Zorlu AVM");
		findAllStore();
		
	}

	private static void findAllStore() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
		EntityManager em = emf.createEntityManager();
		
		List<Store> stores = em.createQuery("SELECT s FROM Store s", Store.class).getResultList();
		//Store store = em.createQuery("SELECT s FROM Store s WHERE s.id=:id", Store.class).setParameter("id", 10).getSingleResult();
		//int stores = em.createQuery("SELECT s FROM Store s").getFirstResult();
		Store store = (Store) em.createNativeQuery("SELECT storename,storeaddress FROM jpadb.store WHERE id=1","StoreMapping").getSingleResult();
		
		//stores.stream().forEach(System.out::println);
		System.out.println(store);
		
		em.clear();
		em.close();
		emf.close();
		
	}

	private static void updateStore(String currentStoreAddr, String updatedStoreAddr) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		Query q = em.createQuery("UPDATE Store s SET storeaddress =:updateaddr WHERE storeaddress =:currentaddr");
		q.setParameter("updateaddr", updatedStoreAddr);
		q.setParameter("currentaddr", currentStoreAddr);
		int result = q.executeUpdate();
		
		if(result > 0) System.out.println("Store addr is updated");
		
		em.getTransaction().commit();
		
		em.clear();
		em.close();
		emf.close();
	}

	private static void findStore(int storeId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
		EntityManager em = emf.createEntityManager();
		
		Store store = em.find(Store.class, storeId);
		System.out.println(store);
		
		em.clear();
		em.close();
		emf.close();
	}

	private static void persistStore(List<Store> stores) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		for (Store store : stores) {
			em.persist(store);
		}
		
		System.out.println("Data persisted");
		em.getTransaction().commit();
		em.clear();
		em.close();
		emf.close();
	}

}
