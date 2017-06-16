/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.facade;

import com.rs.model.Dokter;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USER
 */
@Stateless
public class DokterFacade extends AbstractFacade<Dokter> implements DokterFacadeLocal {

    @PersistenceContext(unitName = "SistemInformasiRumahSakit-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DokterFacade() {
        super(Dokter.class);
    }
    
}
