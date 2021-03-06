package com.reporting.metier.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the flux_cdrs database table.
 * 
 */
@Entity
@Table(name="flux_cdrs",schema="tableref")
@NamedQuery(name="FluxCdr.findAll", query="SELECT f FROM FluxCdr f")
public class FluxCdr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;

	private String nom;

	public FluxCdr() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}