package com.bilgeadam.testjpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.bilgeadam.models.Car;
import com.bilgeadam.utils.EntityUtils;

public class CarDAO {
	static final Logger logger = Logger.getLogger(CarDAO.class.getName());

	public static void main(String[] args) {

		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.WARN);
		
		List<Car> cars = new ArrayList<>();

		Car car1 = new Car("Tesla", 2018, 50000);
		Car car2 = new Car("Mercedes", 2020, 50000);
		Car car3 = new Car("BMW", 2019, 45000);
		Car car4 = new Car("Renault", 2013, 25000);
		Car car5 = new Car("Citroen DS", 2012, 100000);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		

		 //persistCars(cars);
		// findCarById(1);
		// findAllCars();
		//deleteCar(1);
		updateCar(2);
		
	}

	private static void updateCar(int i) {
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");

		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Car car1 = em.find(Car.class, i);
		car1.setModelyear(2020);
		logger.warn("Car ---> " + car1.getCarbrand());
		em.merge(car1);
		et.commit();
		
		logger.warn("BMW is updated");
		
		EntityUtils.closeEntityManager(em);
	}

	private static void deleteCar(int i) {
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");

		EntityTransaction et = em.getTransaction();
		et.begin();

		Car removedCar = em.find(Car.class, i);
		em.remove(removedCar);

		et.commit();
		logger.warn("Car is deleted");

		EntityUtils.closeEntityManager(em);
	}

	
	
	
	private static void findAllCars() {
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");

		List<Car> cars = em.createQuery("SELECT c FROM Car c", Car.class).getResultList();

		for (Car car : cars) {
			logger.warn(car.getId() + "-----> " + car);
		}

		EntityUtils.closeEntityManager(em);

	}

	private static void persistCars(List<Car> cars2) {
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");
		EntityTransaction et = em.getTransaction();
		et.begin();

		for (Car car : cars2) {
			em.persist(car);
		}

		et.commit();

		logger.warn("All cars are persisted");

		EntityUtils.closeEntityManager(em);
	}

	private static Car findCarById(int i) {
		EntityManager em = EntityUtils.getEntityManager("mysqlPU");
		Car car = em.find(Car.class, i);
		logger.warn(car);
		EntityUtils.closeEntityManager(em);
		return car;
	}

}
