package com.example.service;


import com.example.dto.CommonResponse;
import com.example.repository.EnrollmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseBuyerService {

    private final EnrollmentRepository enrollmentRepository;

    public ResponseEntity<CommonResponse> createBuyer() {
        return null;
    }

    public ResponseEntity<CommonResponse> deleteBuyer() {
        return null;
    }

    public ResponseEntity<CommonResponse> getBuyingHistory() {
        return null;
    }

}
