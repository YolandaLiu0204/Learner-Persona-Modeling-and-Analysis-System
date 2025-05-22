package com.example.controller;

import com.example.common.Result;
import com.example.entity.Admin;
import com.example.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    /**
     * web项目的一个接口的入口
     * 可以在这个方法上再加上一个url
     * 也可以指定请求方式：GET POST PUT DELETE
     * @return
     */
    @GetMapping("/admin")
    public Result findAll(){
        List<Admin> list = adminService.findAll();
        return Result.success(list);
    }

    @PostMapping("/login")
    public Result login(@RequestBody Admin admin) {
        Admin loginUser = adminService.login(admin);
        return Result.success(loginUser);
    }

}
