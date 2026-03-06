package com.ashcode.ashcode.contracts;

import java.util.List;

import com.ashcode.ashcode.dtos.subscription.PlanResponse;

public interface PlanService {

    List<PlanResponse> getAllActivePlans();

}
