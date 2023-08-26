package com.freelanceapp.services.impl;

import com.freelanceapp.models.Payment;
import com.freelanceapp.models.enums.PaymentStatus;
import com.freelanceapp.repositories.PaymentRepository;
import com.freelanceapp.services.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Optional<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    @Override
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }

    @Override
    public List<Payment> getPaymentsByClientId(Long clientId) {
        return paymentRepository.findByClient_Id(clientId);
    }

    @Override
    public List<Payment> getPaymentsByFreelancerId(Long freelancerId) {
        return paymentRepository.findByFreelancer_Id(freelancerId);
    }

    @Override
    public List<Payment> getPaymentsByStatus(PaymentStatus status) {
        return paymentRepository.findByStatus(status);
    }
}

