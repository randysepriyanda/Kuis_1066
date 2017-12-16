/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.quis_1066.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa
 */
@Entity
@Table(name = "aksesoris_1066")

public class Aksesories_1066 implements Serializable {     
 

 
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aksesories;
  
    private String nama_aksesories;
    @Column(length = 255, nullable = true)
    private String merek;
     @Column(length = 255, nullable = true)
     
      private String harga;
     
     @OneToMany
    @JoinColumn(name="id_mobil")
    private Set<Mobil_1066> Mobil_1066;

    public Long getId_aksesories() {
        return id_aksesories;
    }

    public void setId_aksesories(Long id_aksesories) {
        this.id_aksesories = id_aksesories;
    }

    /**
     * @return the name
     */
    public String getnama_aksesories() {
        return nama_aksesories;
    }

    /**
     * @param name the name to set
     */
    public void setnama_aksesories(String nama_aksesories) {
        this.nama_aksesories = nama_aksesories;
    }

    /**
     * @return the description
     */
    public String getmerek() {
        return merek;
    }

    /**
     * @param description the description to set
     */
    public void setmerek(String merek) {
        this.merek =merek;
    }
    
    
     public String getharga() {
        return harga;
    }

    /**
     * @param description the description to set
     */
    public void setharga(String harga) {
        this.harga =harga;
    }
    
   public Set<Mobil_1066> getmobil_1066() {
        return Mobil_1066;
    }

    
    public void setMobil_1066(Set<Mobil_1066> Mobil_1066) {
        this.Mobil_1066 = Mobil_1066;
    }
    
}

   


