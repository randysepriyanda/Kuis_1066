/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.repo;

import com.tib.quis_1066.entity.Aksesories_1066;
import com.tib.quis_1066.entity.Mobil_1066;
import java.util.List;
import java.util.Locale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Mahasiswa
 */
public interface Aksesories_1066Repo extends CrudRepository<Aksesories_1066, Long> { 
    
     @Query("select c from aksesories_1066 c")
   

    public List<Aksesories_1066> findAllAksesories_1066();

     
    @Query("select p from aksesories p where p.mobil.id_mobil= :id_mobil")
    public List<Aksesories_1066> findByAksesories(@Param("id_mobil") Long id_mobil);
    
  
}


