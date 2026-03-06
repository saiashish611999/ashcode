package com.ashcode.ashcode.contracts;

import com.ashcode.ashcode.dtos.subscription.PlanLimitResponse;
import com.ashcode.ashcode.dtos.subscription.UsageTodayResponse;

public interface UsageService {

    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);

}
