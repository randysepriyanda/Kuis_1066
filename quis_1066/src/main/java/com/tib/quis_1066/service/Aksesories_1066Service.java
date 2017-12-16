/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.service;

import com.tib.quis_1066.entity.Aksesories_1066;
import com.tib.quis_1066.entity.Mobil_1066;
import com.tib.quis_1066.repo.Aksesories_1066Repo;
import com.tib.quis_1066.repo.Mobil_1066Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa
 */

    @Service("AksesoriesService")
@Transactional
public class Aksesories_1066Service {
     @Autowired
    private Aksesories_1066Repo repo;

    public Aksesories_1066 insert(Aksesories_1066 aksesories_1066) {
        return repo.save(aksesories_1066);
    }
    
    public Aksesories_1066 update(Aksesories_1066 aksesories_1066) {
        return repo.save(aksesories_1066);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesories_1066 getById(Long id_aksesories){
        return repo.findOne(id_aksesories);
    }
    
    public List<Aksesories_1066> getAll(){
        return repo.findAllAksesories_1066();
    }
}


 
