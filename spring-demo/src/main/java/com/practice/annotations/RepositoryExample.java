package com.practice.annotations;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryExample {

	String repo;

	public String getRepo() {
		return repo;
	}

	public void setRepo(String repo) {
		this.repo = repo;
	}

	public RepositoryExample() {
		System.out.println("Repository class constructor");
	}

}
