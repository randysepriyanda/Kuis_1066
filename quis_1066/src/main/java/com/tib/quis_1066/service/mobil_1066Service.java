/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.service;

import com.tib.quis_1066.entity.Mobil_1066;
import com.tib.quis_1066.repo.Mobil_1066Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa
 */

  @Service("adminService")
@Transactional
public class mobil_1066Service {
     @Autowired
    private Mobil_1066Repo repo;

    public Mobil_1066 insert(Mobil_1066 mobil_1066) {
        return repo.save(mobil_1066);
    }
    
    public Mobil_1066 update(Mobil_1066 mobil_1066) {
        return repo.save(mobil_1066);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1066 getById(Long id_admin){
        return repo.findOne(id_admin);
    }
    
    public List<Mobil_1066> getAll(){
        return repo.findAllMobil_1066();
    }
}


  

