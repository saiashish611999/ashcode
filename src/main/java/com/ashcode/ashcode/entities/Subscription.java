package com.ashcode.ashcode.entities;

import java.time.Instant;

import com.ashcode.ashcode.enums.SubscriptionStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;

    User user;

    Plan plan;

    String stripeCustomerId;

    String stripeSubscriptionId;

    Instant currentPeriodStart;

    Boolean cancelAtPeriodEnd;

    Instant createdAt;

    Instant updatedAt;

    SubscriptionStatus status;

}
