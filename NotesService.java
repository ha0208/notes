package com.example.note.service;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.note.model.Notes;
import com.example.note.repo.NotesReposetry;

@Service
public class NotesService {

	@Autowired
	private NotesReposetry notesreposetry;

	public List<Notes> getAllNotes() {
		return notesreposetry.findAll();

	}

	public void save(Notes notes) {
		notesreposetry.save(notes);
	}

	public void update(Notes notes) {
		notesreposetry.save(notes);
	}
      public void delete(int id) {
    	  notesreposetry.deleteById(id);  
      }
}
