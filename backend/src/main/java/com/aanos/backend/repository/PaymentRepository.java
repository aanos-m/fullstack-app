package com.aanos.backend.repository;

import com.aanos.backend.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment ,Long> {
}
