package com.example.shrmp3.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shrmp3.bo.OrganizationMember;
<<<<<<< HEAD
import com.example.shrmp3.repository.OrganizationMemberRepository;
import com.example.shrmp3.service.OrganizationMemberService;

//@Service
//public class OrganizationMemberServiceImpl implements OrganizationMemberService {
//
//    @Autowired
//    private OrganizationMemberRepository repository;
//
//    @Override
//    public OrganizationMember addMember(OrganizationMember member) {
//        return repository.save(member);
//    }
//
//    @Override
//    public List<OrganizationMember> getAllMembers() {
//        return repository.findAll();
//    }
//
//    @Override
//    public OrganizationMember getMemberById(String id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    @Override
//    public OrganizationMember updateMember(String id, OrganizationMember updatedMember) {
//        Optional<OrganizationMember> existing = repository.findById(id);
//        if (existing.isPresent()) {
//            updatedMember.setId(id);
//            return repository.save(updatedMember);
//        }
//        return null;
//    }
//
//    @Override
//    public void deleteMember(String id) {
//        repository.deleteById(id);
//    }
//    
//    public OrganizationMember getByEmpId(String empId) {
//        return repository.findByEmpId(empId).orElse(null);
//    }
//}

=======
import com.example.shrmp3.dto.LoginRequest;
import com.example.shrmp3.dto.LoginResponse;
import com.example.shrmp3.repository.OrganizationMemberRepository;
import com.example.shrmp3.service.OrganizationMemberService;

>>>>>>> 3eef8fa (initial commit)

@Service
public class OrganizationMemberServiceImpl implements OrganizationMemberService {

    @Autowired
    private OrganizationMemberRepository repository;

    @Override
    public OrganizationMember addMember(OrganizationMember member) {
        return repository.save(member);
    }

    @Override
    public List<OrganizationMember> getAllMembers() {
        return repository.findAll();
    }

    @Override
    public OrganizationMember getMemberById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public OrganizationMember updateMember(String id, OrganizationMember updatedMember) {
        Optional<OrganizationMember> existing = repository.findById(id);
        if (existing.isPresent()) {
            updatedMember.setId(id);
            return repository.save(updatedMember);
        }
        return null;
    }

    @Override
    public void deleteMember(String id) {
        repository.deleteById(id);
    }

    @Override
    public OrganizationMember login(String username, String password) {
        return repository.findByUsernameAndPassword(username, password).orElse(null);
    }

    @Override
    public OrganizationMember getByEmpId(String empId) {
        return repository.findByEmpId(empId).orElse(null);
    }
    
<<<<<<< HEAD
    public OrganizationMember loginByEmpId(String empId, String password) {
        return repository.findByEmpIdAndPassword(empId, password).orElse(null);
    }
=======
//    public OrganizationMember loginByEmpId(String empId, String password) {
//        return repository.findByEmpIdAndPassword(empId, password).orElse(null) ;
//    }
    
 //  Method 1: Register Employee
    public LoginResponse register(OrganizationMember employee) {
        Optional<OrganizationMember> existing = repository.findByEmpId(employee.getEmpId());
        if (existing.isPresent()) {
            return new LoginResponse("Employee ID already exists.");
        }

        repository.save(employee);
        return new LoginResponse("Employee registered successfully");
    }

    // ✅ Method 2: Login Employee
    public LoginResponse login(LoginRequest request) {
        Optional<OrganizationMember> empOpt = repository.findByEmpId(request.getEmpId());

        if (empOpt.isPresent()) {
        	OrganizationMember employee = empOpt.get();
            if (employee.getPassword().equals(request.getPassword())) {
                return new LoginResponse("Login successful. Welcome " + employee.getName() + "!");
            } else {
                return new LoginResponse("Incorrect password.");
            }
        } else {
            return new LoginResponse("Employee ID not found.");
        }
    }

	

>>>>>>> 3eef8fa (initial commit)
}