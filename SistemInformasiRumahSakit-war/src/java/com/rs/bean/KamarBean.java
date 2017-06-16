/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.bean;

import com.rs.facade.KamarFacadeLocal;
import com.rs.model.Kamar;

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
@ManagedBean(name = "kamarBean")
@SessionScoped
public class KamarBean implements Serializable{
    
    @EJB
    private KamarFacadeLocal kamarDao;
    private List<Kamar> kamars = new ArrayList<>();
    private Kamar kamar;
    
    public KamarBean(){
        
    }
    
    public Kamar getKamar(){
        return kamar;
    }
    
    public void setKamar(Kamar kamar){
        this.kamar = kamar;
    }
    
    public List<Kamar> getKamars(){
        kamars = kamarDao.findAll();
        return kamars;
    }
    
    public void submitKamar(ActionEvent e){
        try{
            if(this.getKamar().getIdkamar() == 0){kamarDao.create(this.getKamar()); return;}
            kamarDao.edit(this.getKamar());
        }
        catch(Exception ex){
            System.out.print(ex.toString());
        }
    }
    
    public void edit(Kamar k){
        this.kamar = k;
    }
    
    public void add(ActionEvent e){
        this.kamar = new Kamar();
    }
}
