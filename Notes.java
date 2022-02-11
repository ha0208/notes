package com.example.note.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "notesttable1")
public class Notes {

	@Id
	private int id;
	private String notesname;
	private Long notespageno;
	private String notestopic;

}
