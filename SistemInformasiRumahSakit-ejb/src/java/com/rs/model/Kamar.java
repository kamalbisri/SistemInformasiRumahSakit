/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "kamar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kamar.findAll", query = "SELECT k FROM Kamar k")
    , @NamedQuery(name = "Kamar.findByIdkamar", query = "SELECT k FROM Kamar k WHERE k.idkamar = :idkamar")
    , @NamedQuery(name = "Kamar.findByNamakamar", query = "SELECT k FROM Kamar k WHERE k.namakamar = :namakamar")
    , @NamedQuery(name = "Kamar.findByKapasitas", query = "SELECT k FROM Kamar k WHERE k.kapasitas = :kapasitas")
    , @NamedQuery(name = "Kamar.findBySisatempat", query = "SELECT k FROM Kamar k WHERE k.sisatempat = :sisatempat")})
public class Kamar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idkamar")
    private Long idkamar = 0L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "namakamar")
    private String namakamar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kapasitas")
    private int kapasitas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sisatempat")
    private int sisatempat;

    public Kamar() {
    }

    public Kamar(Long idkamar) {
        this.idkamar = idkamar;
    }

    public Kamar(Long idkamar, String namakamar, int kapasitas, int sisatempat) {
        this.idkamar = idkamar;
        this.namakamar = namakamar;
        this.kapasitas = kapasitas;
        this.sisatempat = sisatempat;
    }

    public Long getIdkamar() {
        return idkamar;
    }

    public void setIdkamar(Long idkamar) {
        this.idkamar = idkamar;
    }

    public String getNamakamar() {
        return namakamar;
    }

    public void setNamakamar(String namakamar) {
        this.namakamar = namakamar;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getSisatempat() {
        return sisatempat;
    }

    public void setSisatempat(int sisatempat) {
        this.sisatempat = sisatempat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkamar != null ? idkamar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kamar)) {
            return false;
        }
        Kamar other = (Kamar) object;
        if ((this.idkamar == null && other.idkamar != null) || (this.idkamar != null && !this.idkamar.equals(other.idkamar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rs.model.Kamar[ idkamar=" + idkamar + " ]";
    }
    
}
