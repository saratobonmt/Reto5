package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Category;
import co.usa.ciclo3.ciclo3.repository.crud.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {
	@Autowired
	private CategoryCrudRepository categoryCrudRepository;

	public List<Category> getAll() {
		return (List<Category>) categoryCrudRepository.findAll();
	}

	public Optional<Category> getCategory(Integer id) {
		return categoryCrudRepository.findById(id);
	}

	public Category save(Category category) {
		return categoryCrudRepository.save(category);
	}

	public void deleteById(int idCategory) {
		categoryCrudRepository.deleteById(idCategory);
	}
}
