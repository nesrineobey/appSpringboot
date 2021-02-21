package com.sip.ams.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sip.ams.entities.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    // on peut ajouter nos propres méthodes spécifiques. HQL = Hibernate Query Language
	
	// requette
	//@Query("");
	//public void add2();
}
