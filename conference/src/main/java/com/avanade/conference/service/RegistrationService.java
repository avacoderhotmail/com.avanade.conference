package com.avanade.conference.service;

import com.avanade.conference.model.Registration;
import com.avanade.conference.model.RegistrationReport;

import jakarta.transaction.Transactional;
import java.util.List;

public interface RegistrationService {
    @Transactional
    Registration addRegistration(Registration registration);

}
