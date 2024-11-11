package com.aanos.backend.repository;

import com.aanos.backend.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Long> {
}
