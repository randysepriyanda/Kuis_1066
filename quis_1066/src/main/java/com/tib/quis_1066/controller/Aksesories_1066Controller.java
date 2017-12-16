/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.controller;

 
import com.tib.quis_1066.entity.Aksesories_1066;
import com.tib.quis_1066.service.Aksesories_1066Service;
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
@RequestMapping("/aksesories_1066")
public class Aksesories_1066Controller {

    @Autowired
    private Aksesories_1066Service aksesories_1066Service;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesories_1066 insert(@RequestBody Aksesories_1066 aksesories_1066) {
        return aksesories_1066Service.insert(aksesories_1066);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesories_1066 update(@RequestBody Aksesories_1066 aksesories_1066) {
        return aksesories_1066Service.update(aksesories_1066);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesories}")
    public boolean delete(@PathVariable("id_aksesories") Long id) {
        return aksesories_1066Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesories}")
    public Aksesories_1066 getById(@PathVariable("id_aksesories") Long id_aksesories){
        return aksesories_1066Service.getById(id_aksesories);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesories_1066> getAll(){
        return aksesories_1066Service.getAll();
    }
}

   