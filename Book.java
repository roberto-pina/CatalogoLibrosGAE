package com.roberto.catalogodelibros;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String titulo;
	String autor;
	int año;
	String editorial;
	
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getAutor(){
		return autor;
	}
	public void setAutor(String autor){
		this.autor = autor;
	}
	public int getAño(){
		return año;
	}
	public void setAño(int año){
		this.año = año;
	}
	public String getEditorial(){
		return editorial;
	}
	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

}
