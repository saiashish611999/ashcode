package com.ashcode.ashcode.contracts;

import com.ashcode.ashcode.dtos.subscription.CheckoutRequest;
import com.ashcode.ashcode.dtos.subscription.CheckoutResponse;
import com.ashcode.ashcode.dtos.subscription.PortalResponse;
import com.ashcode.ashcode.dtos.subscription.SubscriptionResponse;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);

}
