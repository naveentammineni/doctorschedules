package org.naveen.web.rest;

import com.codahale.metrics.annotation.Timed;
import org.naveen.domain.Doctor;
import org.naveen.repository.DoctorRepository;
import org.naveen.service.DoctorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorResource {

    private final Logger log = LoggerFactory.getLogger(UserResource.class);

    private final DoctorService doctorService;

    private final DoctorRepository doctorRepository;

    public DoctorResource(DoctorService doctorService, DoctorRepository doctorRepository) {

        this.doctorService = doctorService;
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/")
    public ResponseEntity<List<Doctor>> getAllUsers() {
        final List<Doctor> doctors = doctorService.findAll();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }

}
