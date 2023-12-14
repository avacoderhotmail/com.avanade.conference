package com.avanade.conference.service;

import com.avanade.conference.model.Course;
import com.avanade.conference.model.Registration;
import com.avanade.conference.model.RegistrationReport;
import com.avanade.conference.repository.CourseRepository;
import com.avanade.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        registrationRepository.save(registration);
        return registration;
    }


}
