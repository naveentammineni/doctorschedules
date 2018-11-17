package org.naveen.service;

import org.naveen.domain.Doctor;
import org.naveen.repository.DoctorRepository;
import org.naveen.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository repository) {
        doctorRepository = repository;
    }

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

}
