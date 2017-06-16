/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.facade;

import com.rs.model.Pasien;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USER
 */
@Local
public interface PasienFacadeLocal {

    void create(Pasien pasien);

    void edit(Pasien pasien);

    void remove(Pasien pasien);

    Pasien find(Object id);

    List<Pasien> findAll();

    List<Pasien> findRange(int[] range);

    int count();
    
}
