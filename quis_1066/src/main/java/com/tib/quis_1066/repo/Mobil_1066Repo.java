/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.repo;

import com.tib.quis_1066.entity.Mobil_1066;
import java.util.List;
import java.util.Locale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mahasiswa
 */
public interface Mobil_1066Repo extends CrudRepository<Mobil_1066, Long> { 
    
     @Query("select c from mobil_1066 c")
   

    public Mobil_1066 save(Mobil_1066 mobil_1066);

    public List<Mobil_1066> findAllMobil_1066();
}


