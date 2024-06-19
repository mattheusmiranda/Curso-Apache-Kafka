package com.miranda.paymentservice.service;

import com.miranda.paymentservice.model.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {
    void sendPayment(Payment payment);
}
