package com.vektorel.hibswingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "fotograf")
public class Fotograf implements java.io.Serializable {

    private Integer id;
    private byte[] image;

    public Fotograf() {
    }

    public Fotograf(byte[] image) {
        this.image = image;
    }

    @Id
    @SequenceGenerator(name = "seq_fotograf", allocationSize = 1, sequenceName = "seq_fotograf")
    @GeneratedValue(generator = "seq_fotograf", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "IMAGE", nullable = false)
    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

}
