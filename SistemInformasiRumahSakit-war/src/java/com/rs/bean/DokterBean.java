/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.bean;


import com.rs.facade.DokterFacadeLocal;
import com.rs.model.Dokter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
@ManagedBean(name = "dokterBean")
@SessionScoped
public class DokterBean implements Serializable{
    
    @EJB
    private DokterFacadeLocal dokterDao;
    private List<Dokter> dokters = new ArrayList<>();
    private Dokter dokter;
    
    public DokterBean(){
        
    }
    
    public Dokter getDokter(){
        return dokter;
    }
    
    public void setDokter(Dokter dokter){
        this.dokter = dokter;
    }
    
    public List<Dokter> getDokters(){
        dokters = dokterDao.findAll();
        return dokters;
    }
    
    public void submitDokter(ActionEvent e){
        try{
            if(this.getDokter().getIddokter() == 0){dokterDao.create(this.getDokter()); return;}
            dokterDao.edit(this.getDokter());
        }
        catch(Exception ex){
            System.out.print(ex.toString());
        }
    }
    
    public void edit(Dokter d){
        this.dokter = d;
    }
    
    public void add(ActionEvent e){
        this.dokter = new Dokter();
    }
}
