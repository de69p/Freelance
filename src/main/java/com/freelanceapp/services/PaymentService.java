package com.freelanceapp.services;

import com.freelanceapp.models.Payment;
import com.freelanceapp.models.enums.PaymentStatus;

import java.util.List;
import java.util.Optional;

public interface PaymentService {

    /**
     * Retrieve all payments from the database.
     *
     * @return a list of all payments
     */
    List<Payment> getAllPayments();

    /**
     * Retrieve a specific payment by its ID.
     *
     * @param id the ID of the payment to retrieve
     * @return an optional containing the payment if found, or empty otherwise
     */
    Optional<Payment> getPaymentById(Long id);

    /**
     * Save a payment to the database.
     *
     * @param payment the payment to save
     * @return the saved payment
     */
    Payment savePayment(Payment payment);

    /**
     * Delete a specific payment by its ID.
     *
     * @param id the ID of the payment to delete
     */
    void deletePayment(Long id);

    /**
     * Retrieve all payments made by a specific client.
     *
     * @param clientId the ID of the client
     * @return a list of payments made by the client
     */
    List<Payment> getPaymentsByClientId(Long clientId);

    /**
     * Retrieve all payments received by a specific freelancer.
     *
     * @param freelancerId the ID of the freelancer
     * @return a list of payments received by the freelancer
     */
    List<Payment> getPaymentsByFreelancerId(Long freelancerId);

    /**
     * Retrieve all payments with a specific status.
     *
     * @param status the status of the payments to retrieve
     * @return a list of payments with the specified status
     */
    List<Payment> getPaymentsByStatus(PaymentStatus status);
}

