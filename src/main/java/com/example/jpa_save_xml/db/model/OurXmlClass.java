package com.example.jpa_save_xml.db.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class OurXmlClass {
    @XmlElement(name = "example")
    private String example;

}
