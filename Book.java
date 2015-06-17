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
	int a�o;
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
	public int getA�o(){
		return a�o;
	}
	public void setA�o(int a�o){
		this.a�o = a�o;
	}
	public String getEditorial(){
		return editorial;
	}
	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

}
