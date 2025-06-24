package com.example.shrmp3.controller;

import java.util.List;
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> 3eef8fa (initial commit)

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
<<<<<<< HEAD
import com.example.shrmp3.service.OrganizationMemberService;

//@RestController
//@RequestMapping("/api/members")
//@CrossOrigin(origins = "*")
//public class OrganizationMemberController {
//
//    @Autowired
//    private OrganizationMemberService service;
//
//    @PostMapping
//    public OrganizationMember add(@RequestBody OrganizationMember member) {
//        return service.addMember(member);
//    }
//
//    @GetMapping
//    public List<OrganizationMember> getAll() {
//        return service.getAllMembers();
//    }
//
//    @GetMapping("/{id}")
//    public OrganizationMember getById(@PathVariable String id) {
//        return service.getMemberById(id);
//    }
//
//    @PutMapping("/{id}")
//    public OrganizationMember update(@PathVariable String id, @RequestBody OrganizationMember member) {
//        return service.updateMember(id, member);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable String id) {
//        service.deleteMember(id);
//    }
//    
//    @GetMapping("/empid/{empId}")
//    public ResponseEntity<?> getByEmpId(@PathVariable String empId) {
//        OrganizationMember member = service.getByEmpId(empId);
//        if (member != null) {
//            return ResponseEntity.ok(member);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
//        }
//    }
//}
=======
import com.example.shrmp3.dto.LoginRequest;
import com.example.shrmp3.dto.LoginResponse;
import com.example.shrmp3.service.OrganizationMemberService;

>>>>>>> 3eef8fa (initial commit)

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "*")
public class OrganizationMemberController {

    @Autowired
    private OrganizationMemberService service;

<<<<<<< HEAD
    @PostMapping
=======
    @PostMapping("/save")
>>>>>>> 3eef8fa (initial commit)
    public OrganizationMember add(@RequestBody OrganizationMember member) {
        return service.addMember(member);
    }

<<<<<<< HEAD
    @GetMapping
=======
    @GetMapping("/all")
>>>>>>> 3eef8fa (initial commit)
    public List<OrganizationMember> getAll() {
        return service.getAllMembers();
    }

    @GetMapping("/{id}")
    public OrganizationMember getById(@PathVariable String id) {
        return service.getMemberById(id);
    }

    @PutMapping("/{id}")
    public OrganizationMember update(@PathVariable String id, @RequestBody OrganizationMember member) {
        return service.updateMember(id, member);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteMember(id);
    }

<<<<<<< HEAD
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
//        String username = loginData.get("username");
//        String password = loginData.get("password");
//        OrganizationMember user = service.login(username, password);
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }
=======
>>>>>>> 3eef8fa (initial commit)

    @GetMapping("/empid/{empId}")
    public ResponseEntity<?> getByEmpId(@PathVariable String empId) {
        OrganizationMember member = service.getByEmpId(empId);
        if (member != null) {
            return ResponseEntity.ok(member);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
    }
    
<<<<<<< HEAD
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> loginData) {
        String empId = loginData.get("empId");
        String password = loginData.get("password");

        OrganizationMember user = service.loginByEmpId(empId, password);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
=======

    
    @PostMapping("/save2")
    public LoginResponse register(@RequestBody OrganizationMember employee) {
        return service.register(employee);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        return service.login(request);
>>>>>>> 3eef8fa (initial commit)
    }
}  
