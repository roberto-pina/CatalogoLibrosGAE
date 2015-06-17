package com.roberto.catalogodelibros;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Libro {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	Long id;
	@Persistent
	String titulo;
	@Persistent
	String autor;
	@Persistent
	Integer anio;
	@Persistent
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
	public int getAnio(){
		return anio;
	}
	public void setAnio(int anio){
		this.anio = anio;
	}
	public String getEditorial(){
		return editorial;
	}
	public void setEditorial(String editorial){
		this.editorial = editorial;
	}

}
