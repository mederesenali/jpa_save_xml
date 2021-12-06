package com.example.jpa_save_xml.db.model.repo;

import com.example.jpa_save_xml.db.model.SimpleTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<SimpleTest,Long> {
}
