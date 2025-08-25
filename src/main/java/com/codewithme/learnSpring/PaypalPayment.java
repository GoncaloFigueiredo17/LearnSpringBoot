package com.codewithme.learnSpring;

import org.springframework.stereotype.Service;

@Service
public class PaypalPayment implements PaymentService
{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal:");
        System.out.println("Amount:" + amount);
    }
}
