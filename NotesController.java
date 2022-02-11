package com.example.note.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.note.model.Notes;
import com.example.note.service.NotesService;

@RestController
public class NotesController {

	@Autowired
	private NotesService notesService;

	@GetMapping("/allNotes")
	public List<Notes> getAllNotes() {
		List<Notes> books = new ArrayList<Notes>();
		return notesService.getAllNotes();
	}

	@PostMapping("save")
	public String save(@RequestBody Notes notes) {
		notesService.save(notes);
		return "saved Successfully";

	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id")int Id) {
		notesService.delete(Id);
		return "Sucess fully deleted";
	}
	

}
