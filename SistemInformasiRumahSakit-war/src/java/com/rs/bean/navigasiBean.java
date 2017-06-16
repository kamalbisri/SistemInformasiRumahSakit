/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.bean;

import com.rs.model.Dokter;
import com.rs.model.Kamar;
import com.rs.model.Pasien;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author USER
 */
@ManagedBean(name = "navigasiBean")
@RequestScoped
public class navigasiBean {
    
    public navigasiBean() {
        
    }
    public String goToHome() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "index.xhtml?faces-redirect=true";
    }
    
    public String goToDokterInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/dokter/form.xhtml?faces-redirect=true";
    }
    
    public String goToDokterListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/dokter/index.xhtml?faces-redirect=true";
    }
    public String goToKamarInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/kamar/form.xhtml?faces-redirect=true";
    }
    
    public String goToKamarListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/kamar/index.xhtml?faces-redirect=true";
    }
    public String goToPasienInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/pasien/form.xhtml?faces-redirect=true";
    }
    
    public String goToPasienListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/pasien/index.xhtml?faces-redirect=true";
    }
    
    
}
