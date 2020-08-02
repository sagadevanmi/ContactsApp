package com.sdk.crm.backend.repository;

import com.sdk.crm.backend.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company, Long> {
}