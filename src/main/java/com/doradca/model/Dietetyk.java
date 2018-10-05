package com.doradca.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
//@Table(name="Dieteyk")
public class Dietetyk implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_dietetyka;

	@Column
	private String imie;
	
	@Column
	private String nazwisko;
	
	@Column
	@Lob
	private String opis;
	
	public Dietetyk() {}
	

	public Dietetyk(String imie, String nazwisko, String opis) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.opis = opis;
	}

	public long getId_dietetyka() {
		return id_dietetyka;
	}

	public void setId_dietetyka(long id_dietetyka) {
		this.id_dietetyka = id_dietetyka;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	
	 public Dietetyk withImie(final String imie) {
	        this.imie = imie;
	        return this;
	    }
	 
	 public Dietetyk withNazwisko(final String nazwisko) {
	        this.nazwisko = nazwisko;
	        return this;
	    }
	 
	 
	 public Dietetyk withOpis(final String opis) {
	        this.opis = opis;
	        return this;
	    }

	@Override
	public String toString() {
		return "Dietetyk [id_dietetyka=" + id_dietetyka + ", imie=" + imie + ", nazwisko=" + nazwisko + ", opis=" + opis
				+ "]";
	}
	
	
	
}
