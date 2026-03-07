package com.ashcode.ashcode.services;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.SubscriptionService;
import com.ashcode.ashcode.dtos.subscription.CheckoutRequest;
import com.ashcode.ashcode.dtos.subscription.CheckoutResponse;
import com.ashcode.ashcode.dtos.subscription.PortalResponse;
import com.ashcode.ashcode.dtos.subscription.SubscriptionResponse;

@Service
public class SubscriptionServiceImplementation implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentSubscription'");
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCheckoutSessionUrl'");
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openCustomerPortal'");
    }

}
