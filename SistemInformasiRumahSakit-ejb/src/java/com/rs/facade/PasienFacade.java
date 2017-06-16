/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.facade;

import com.rs.model.Pasien;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class PasienFacade extends AbstractFacade<Pasien> implements PasienFacadeLocal {

    @PersistenceContext(unitName = "SistemInformasiRumahSakit-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PasienFacade() {
        super(Pasien.class);
    }
    
}
