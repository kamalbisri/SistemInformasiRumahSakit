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
@Table(name = "dokter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dokter.findAll", query = "SELECT d FROM Dokter d")
    , @NamedQuery(name = "Dokter.findByIddokter", query = "SELECT d FROM Dokter d WHERE d.iddokter = :iddokter")
    , @NamedQuery(name = "Dokter.findByNama", query = "SELECT d FROM Dokter d WHERE d.nama = :nama")
    , @NamedQuery(name = "Dokter.findByJk", query = "SELECT d FROM Dokter d WHERE d.jk = :jk")
    , @NamedQuery(name = "Dokter.findByTLahir", query = "SELECT d FROM Dokter d WHERE d.tLahir = :tLahir")
    , @NamedQuery(name = "Dokter.findByTglLahir", query = "SELECT d FROM Dokter d WHERE d.tglLahir = :tglLahir")
    , @NamedQuery(name = "Dokter.findByEmail", query = "SELECT d FROM Dokter d WHERE d.email = :email")
    , @NamedQuery(name = "Dokter.findByNohp", query = "SELECT d FROM Dokter d WHERE d.nohp = :nohp")
    , @NamedQuery(name = "Dokter.findBySpesialis", query = "SELECT d FROM Dokter d WHERE d.spesialis = :spesialis")})
public class Dokter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddokter")
    private Long iddokter = 0L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "jk")
    private String jk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "t_lahir")
    private String tLahir;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tgl_lahir")
    @Temporal(TemporalType.DATE)
    private Date tglLahir;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "nohp")
    private String nohp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "spesialis")
    private String spesialis;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "alamat")
    private String alamat;

    public Dokter() {
    }

    public Dokter(Long iddokter) {
        this.iddokter = iddokter;
    }

    public Dokter(Long iddokter, String nama, String jk, String tLahir, Date tglLahir, String email, String nohp, String spesialis, String alamat) {
        this.iddokter = iddokter;
        this.nama = nama;
        this.jk = jk;
        this.tLahir = tLahir;
        this.tglLahir = tglLahir;
        this.email = email;
        this.nohp = nohp;
        this.spesialis = spesialis;
        this.alamat = alamat;
    }

    public Long getIddokter() {
        return iddokter;
    }

    public void setIddokter(Long iddokter) {
        this.iddokter = iddokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getTLahir() {
        return tLahir;
    }

    public void setTLahir(String tLahir) {
        this.tLahir = tLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
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
        hash += (iddokter != null ? iddokter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dokter)) {
            return false;
        }
        Dokter other = (Dokter) object;
        if ((this.iddokter == null && other.iddokter != null) || (this.iddokter != null && !this.iddokter.equals(other.iddokter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rs.model.Dokter[ iddokter=" + iddokter + " ]";
    }
    
}
