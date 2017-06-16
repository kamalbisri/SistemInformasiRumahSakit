/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.facade;

import com.rs.model.Dokter;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USER
 */
@Local
public interface DokterFacadeLocal {

    void create(Dokter dokter);

    void edit(Dokter dokter);

    void remove(Dokter dokter);

    Dokter find(Object id);

    List<Dokter> findAll();

    List<Dokter> findRange(int[] range);

    int count();
    
}
