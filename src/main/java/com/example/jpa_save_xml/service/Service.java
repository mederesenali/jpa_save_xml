package com.example.jpa_save_xml.service;

import com.example.jpa_save_xml.db.model.OurXmlClass;
import com.example.jpa_save_xml.db.model.SimpleTest;
import com.example.jpa_save_xml.db.model.repo.TestRepo;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.StringWriter;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final TestRepo testRepo;

    public void saveXmlToDb(OurXmlClass ourXmlClass) throws JAXBException, IOException {
        var obj = marshal(ourXmlClass);
        SimpleTest test = new SimpleTest();
        test.setId(2L);
        test.setXmlField(obj);
        testRepo.save(test);
    }

    public String marshal(OurXmlClass ourXmlClass) throws JAXBException, IOException {
        StringWriter sw = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(OurXmlClass.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(ourXmlClass, sw);
        return sw.toString();
    }
}
