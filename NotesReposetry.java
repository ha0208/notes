package com.example.note.repo;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.note.model.Notes;

@Repository
public interface NotesReposetry extends JpaRepository<Notes, Integer> {

	

}
