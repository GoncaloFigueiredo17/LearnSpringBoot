package com.codewithme.learnSpring;

public class stripePayment implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Strype:");
        System.out.println("Amount:" + amount);
    }
}
