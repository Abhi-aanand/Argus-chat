package com.arguschat.services;

import com.arguschat.dto.SignupRequest;
import com.arguschat.entities.Customer;

public interface AuthService {
    Customer createCustomer(SignupRequest signupRequest);
}
