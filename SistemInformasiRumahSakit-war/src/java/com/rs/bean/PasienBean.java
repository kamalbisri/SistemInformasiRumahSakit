/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.bean;

import com.rs.facade.PasienFacadeLocal;
import com.rs.model.Pasien;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author USER
 */
@ManagedBean(name = "pasienBean")
@SessionScoped
public class PasienBean implements Serializable{
    
    @EJB
    private PasienFacadeLocal pasienDao;
    private List<Pasien> pasiens = new ArrayList<>();
    private Pasien pasien;
    
    
    public PasienBean(){
        
    }
    
    public Pasien getPasien(){
        return pasien;
    }
    
    public void setPasien(Pasien pasien){
        this.pasien = pasien;
    }
    
    public List<Pasien> getPasiens(){
    pasiens = pasienDao.findAll();
    return pasiens;
    }
    
    public void submitPasien(ActionEvent e){
        try{
            if(this.getPasien().getIdpasien() == 0){pasienDao.create(this.getPasien()); return;}
            pasienDao.edit(this.getPasien());
        }
        catch(Exception ex){
            System.out.print(ex.toString());
        }
    }
    
    public void edit(Pasien p){
        this.pasien = p;
    }
    
    public void add(ActionEvent e){
        this.pasien = new Pasien();
    }
}
