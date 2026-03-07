package com.ashcode.ashcode.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashcode.ashcode.contracts.PlanService;
import com.ashcode.ashcode.dtos.subscription.PlanResponse;

@Service
public class PlanServiceImplementation implements PlanService {

    @Override
    public List<PlanResponse> getAllActivePlans() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllActivePlans'");
    }

}
