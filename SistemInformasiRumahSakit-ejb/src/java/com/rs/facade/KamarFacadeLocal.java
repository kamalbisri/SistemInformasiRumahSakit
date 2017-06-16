/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.facade;

import com.rs.model.Kamar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author USER
 */
@Local
public interface KamarFacadeLocal {

    void create(Kamar kamar);

    void edit(Kamar kamar);

    void remove(Kamar kamar);

    Kamar find(Object id);

    List<Kamar> findAll();

    List<Kamar> findRange(int[] range);

    int count();
    
}
