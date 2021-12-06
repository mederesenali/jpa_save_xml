package com.example.jpa_save_xml.api;

import com.example.jpa_save_xml.db.model.OurXmlClass;
import com.example.jpa_save_xml.service.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@RestController
@Slf4j
@RequiredArgsConstructor
public class TestController {
   private final Service service;

    @GetMapping("")
    public void home() throws JAXBException, IOException {
        log.info("starting to save db  !!!");
        OurXmlClass ourXmlClass = new OurXmlClass();
        ourXmlClass.setExample("Book1");
        service.saveXmlToDb(ourXmlClass);
        log.info("saved to db   !!!");
    }
}
