package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Library;
import co.usa.ciclo3.ciclo3.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibraryService {
	@Autowired
	private LibraryRepository libraryRepository;

	public List<Library> getAll() {
		return libraryRepository.getAll();
	}

	public Library getLibrary(Integer id) {
		return libraryRepository.getLibrary(id);
	}

	public Library save(Library library) {
		if (library.getId() == null) {
			return libraryRepository.save(library);
		} else {
			Library libraryAux = libraryRepository.getLibrary(library.getId());
			if (libraryAux == null) {
				return libraryRepository.save(library);
			} else {
				return library;
			}
		}
	}

	public Library update(Library library) {
		if (library.getId() != null) {
			if (libraryRepository.getLibrary(library.getId()) != null) {
				library.setCategory(libraryRepository.getLibrary(library.getId()).getCategory());
				return libraryRepository.save(library);
			}
		}
		return library;
	}

	public String deleteLibraryById(int idLibrary) {
		libraryRepository.deleteLibraryById(idLibrary);
		return "Library delete";
	}

}
