package com.example.jpa_save_xml.db.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class SimpleTest {
    @Id
    private Long id;
    @Type(type = "com.example.jpa_save_xml.db.model.SQLXMLType")
    @Column(name = "xmlField", columnDefinition = "xml")
    private String xmlField;

}
