package com.kairos.service;

import com.kairos.entity.Admin;
import com.kairos.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    public Admin addAdmin(Admin admin) {
        return adminRepo.save(admin);
    }
}
