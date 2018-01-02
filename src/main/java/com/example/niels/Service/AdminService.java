package com.example.niels.Service;

import com.example.niels.dao.dao.AdminMapper;
import com.example.niels.dao.domain.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin findAdmin(Integer id) {
        return adminMapper.findAdmin(id);
    }
}
