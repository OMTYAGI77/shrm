package com.example.shrmp3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shrmp3.bo.OrganizationMember;
import com.example.shrmp3.dto.LoginRequest;
import com.example.shrmp3.dto.LoginResponse;
import com.example.shrmp3.service.OrganizationMemberService;


@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "*")
public class OrganizationMemberController {

    @Autowired
    private OrganizationMemberService service;

    //save by all
    @PostMapping("/save")
    public OrganizationMember add(@RequestBody OrganizationMember member) {
        return service.addMember(member);
    }

    //get by all 
    @GetMapping("/all")
    public List<OrganizationMember> getAll() {
        return service.getAllMembers();
    }

    //
    @GetMapping("/{id}")
    public OrganizationMember getById(@PathVariable String id) {
        return service.getMemberById(id);
    }

    
    //update by id bais
    @PutMapping("/{id}")
    public OrganizationMember update(@PathVariable String id, @RequestBody OrganizationMember member) {
        return service.updateMember(id, member);
    }

    //delete by id bais
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteMember(id);
    }


    //get by employee id
    @GetMapping("/empid/{empId}")
    public ResponseEntity<?> getByEmpId(@PathVariable String empId) {
        OrganizationMember member = service.getByEmpId(empId);
        if (member != null) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
    }
    

    //register
    @PostMapping("/save2")
    public LoginResponse register(@RequestBody OrganizationMember employee) {
        return service.register(employee);
    }

    //login
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return service.login(request);
    }
}  
