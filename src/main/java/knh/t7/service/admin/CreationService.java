package knh.t7.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import knh.t7.model.Author;
import knh.t7.model.Category;
import knh.t7.model.Creation;
import knh.t7.repository.AuthorJpa;
import knh.t7.repository.CategoryJpa;
import knh.t7.repository.CreationJpa;

@Service
public class CreationService {
	@Autowired
	private CreationJpa creationJpa;
	
	@Autowired
	private CategoryJpa categoryJpa;
	
	@Autowired
	private AuthorJpa authorJpa;

	public List<Creation> getAll() {
		return creationJpa.findAll();
	}

	public Creation getById(int id) {
		return creationJpa.getOne(id);
	}

	public void update(Creation creation) {
		creationJpa.save(creation);
	}

	public void deleteById(int id) {
		creationJpa.deleteById(id);
	}

	public void save(Creation creation) {

		creationJpa.save(creation);

	}

	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryJpa.findAll();
	}

	public List<Author> getAllAuthor() {
		// TODO Auto-generated method stub
		return authorJpa.findAll();
	}
}
