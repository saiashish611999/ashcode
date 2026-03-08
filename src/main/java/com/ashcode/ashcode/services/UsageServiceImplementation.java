package com.ashcode.ashcode.services;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.UsageService;
import com.ashcode.ashcode.dtos.subscription.PlanLimitResponse;
import com.ashcode.ashcode.dtos.subscription.UsageTodayResponse;

@Service
public class UsageServiceImplementation implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTodayUsageOfUser'");
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCurrentSubscriptionLimitsOfUser'");
    }

}
