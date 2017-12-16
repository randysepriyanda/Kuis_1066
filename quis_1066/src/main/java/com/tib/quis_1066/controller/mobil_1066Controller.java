/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.controller;

import com.tib.quis_1066.entity.Mobil_1066;
import com.tib.quis_1066.service.mobil_1066Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa
 */

 
 
 
@RestController
@RequestMapping("/mobil_1066")
public class mobil_1066Controller {

    @Autowired
    private mobil_1066Service mobil_1066Service;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1066 insert(@RequestBody Mobil_1066 mobil_1066) {
        return mobil_1066Service.insert(mobil_1066);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1066 update(@RequestBody Mobil_1066 mobil_1066) {
        return mobil_1066Service.update(mobil_1066);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_mobil}")
    public boolean delete(@PathVariable("id_mobil") Long id) {
        return mobil_1066Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_mobil}")
    public Mobil_1066 getById(@PathVariable("id_mobil_1066") Long id_mobil){
        return mobil_1066Service.getById(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1066> getAll(){
        return mobil_1066Service.getAll();
    }
}

   

