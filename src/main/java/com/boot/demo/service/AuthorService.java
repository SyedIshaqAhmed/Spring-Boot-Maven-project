package com.boot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.database.AuthorRepository;
import com.boot.demo.pojo.Author;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorrepository;

	public boolean insertAuthor(Author author) {
		this.authorrepository.save(author);
		return true;
	}

	public Author getAuthorById(int id) throws Exception {
		return
				this.authorrepository.findById(id).orElseThrow(()-> new Exception("Author id dosen't exist"));
	}

	public boolean deleteById(int id){
		this.authorrepository.deleteById(id);
		System.out.println("Deleted");
		return true;
	}


}
