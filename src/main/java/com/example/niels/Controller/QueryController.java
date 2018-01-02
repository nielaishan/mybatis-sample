package com.example.niels.Controller;

import com.example.niels.dao.domain.Admin;
import com.example.niels.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class QueryController {

    @Autowired
    private AdminService adminService;
    @RequestMapping("/queryusername")
    public String query() {
        Admin admin = adminService.findAdmin(1);
        return admin.getUsername();
    }
}
