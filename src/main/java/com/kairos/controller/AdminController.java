package com.kairos.controller;

import com.kairos.entity.Admin;
import com.kairos.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("addAdmin")
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        Admin savedAdmin = adminService.addAdmin(admin);
        return new ResponseEntity<>(savedAdmin, HttpStatus.OK);
    }

    @GetMapping("getAdminList")
    public ResponseEntity<List<Admin>> getAdminList() {
        List<Admin> adminList = adminService.getAdminList();
        return new ResponseEntity<>(adminList, HttpStatus.OK);
    }

    @GetMapping("getAdmin/{id}")
    public ResponseEntity<Admin> getAdmin(@PathVariable Long id) {
        Admin admin = adminService.getAdmin(id);
        return new ResponseEntity<>(admin, HttpStatus.OK);
    }
}
