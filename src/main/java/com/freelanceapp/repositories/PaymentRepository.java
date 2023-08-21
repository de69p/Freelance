package com.freelanceapp.repositories;

import com.freelanceapp.models.Payment;
import com.freelanceapp.models.enums.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    List<Payment> findByClient_Id(Long clientId);
    List<Payment> findByFreelancer_Id(Long freelancerId);
    List<Payment> findByStatus(PaymentStatus status);
}
