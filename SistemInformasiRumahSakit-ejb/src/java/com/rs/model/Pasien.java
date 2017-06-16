/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "pasien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasien.findAll", query = "SELECT p FROM Pasien p")
    , @NamedQuery(name = "Pasien.findByIdpasien", query = "SELECT p FROM Pasien p WHERE p.idpasien = :idpasien")
    , @NamedQuery(name = "Pasien.findByNamapasien", query = "SELECT p FROM Pasien p WHERE p.namapasien = :namapasien")
    , @NamedQuery(name = "Pasien.findByJkpasien", query = "SELECT p FROM Pasien p WHERE p.jkpasien = :jkpasien")
    , @NamedQuery(name = "Pasien.findByTmptLahir", query = "SELECT p FROM Pasien p WHERE p.tmptLahir = :tmptLahir")
    , @NamedQuery(name = "Pasien.findByTglPasien", query = "SELECT p FROM Pasien p WHERE p.tglPasien = :tglPasien")
    , @NamedQuery(name = "Pasien.findByPenyakit", query = "SELECT p FROM Pasien p WHERE p.penyakit = :penyakit")})
public class Pasien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpasien")
    private Long idpasien = 0L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "namapasien")
    private String namapasien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "jkpasien")
    private String jkpasien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tmpt_lahir")
    private String tmptLahir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tgl_pasien")
    @Temporal(TemporalType.DATE)
    private Date tglPasien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "penyakit")
    private String penyakit;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "alamat")
    private String alamat;

    public Pasien() {
    }

    public Pasien(Long idpasien) {
        this.idpasien = idpasien;
    }

    public Pasien(Long idpasien, String namapasien, String jkpasien, String tmptLahir, Date tglPasien, String penyakit, String alamat) {
        this.idpasien = idpasien;
        this.namapasien = namapasien;
        this.jkpasien = jkpasien;
        this.tmptLahir = tmptLahir;
        this.tglPasien = tglPasien;
        this.penyakit = penyakit;
        this.alamat = alamat;
    }

    public Long getIdpasien() {
        return idpasien;
    }

    public void setIdpasien(Long idpasien) {
        this.idpasien = idpasien;
    }

    public String getNamapasien() {
        return namapasien;
    }

    public void setNamapasien(String namapasien) {
        this.namapasien = namapasien;
    }

    public String getJkpasien() {
        return jkpasien;
    }

    public void setJkpasien(String jkpasien) {
        this.jkpasien = jkpasien;
    }

    public String getTmptLahir() {
        return tmptLahir;
    }

    public void setTmptLahir(String tmptLahir) {
        this.tmptLahir = tmptLahir;
    }

    public Date getTglPasien() {
        return tglPasien;
    }

    public void setTglPasien(Date tglPasien) {
        this.tglPasien = tglPasien;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpasien != null ? idpasien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasien)) {
            return false;
        }
        Pasien other = (Pasien) object;
        if ((this.idpasien == null && other.idpasien != null) || (this.idpasien != null && !this.idpasien.equals(other.idpasien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rs.model.Pasien[ idpasien=" + idpasien + " ]";
    }
    
}
