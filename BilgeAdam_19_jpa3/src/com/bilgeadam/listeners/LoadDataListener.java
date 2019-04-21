package com.bilgeadam.listeners;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.bilgeadam.utils.EntityUtils;

public class LoadDataListener<T> {

	@PrePersist
	public void prePersistMetodu(T entity) {
		System.out.println("prePersistMetodu");
	}

	@PreUpdate
	public void preUpdateMetodu(T entity) {
		System.out.println("preUpdateMetodu");
	}

	@PreRemove
	public void preRemoveMetodu(T entity) {
		System.out.println("preRemoveMetodu");
	}

	@PostLoad
	public void postLoadMetodu(T entity) {
		System.out.println("postLoadMetodu");
	}

	@PostPersist
	public void postPersistMetodu(T entity) {
		System.out.println("postPersistMetodu");
	}

	@PostUpdate
	public void postUpdateMetodu(T entity) {
		System.out.println("postUpdateMetodu");
	}

	@PostRemove
	public void postRemoveMetodu(T entity) {
		System.out.println("postRemoveMetodu");
	}
}
