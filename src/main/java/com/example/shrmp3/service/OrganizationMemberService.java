package com.example.shrmp3.service;

import java.util.List;

import com.example.shrmp3.bo.OrganizationMember;
import com.example.shrmp3.dto.LoginRequest;
import com.example.shrmp3.dto.LoginResponse;

//public interface OrganizationMemberService {
//    OrganizationMember addMember(OrganizationMember member);
//    List<OrganizationMember> getAllMembers();
//    OrganizationMember getMemberById(String id);
//    OrganizationMember updateMember(String id, OrganizationMember updatedMember);
//    void deleteMember(String id);
//    OrganizationMember getByEmpId(String empId);
//}

public interface OrganizationMemberService {
    OrganizationMember addMember(OrganizationMember member);
    List<OrganizationMember> getAllMembers();
    OrganizationMember getMemberById(String id);
    OrganizationMember updateMember(String id, OrganizationMember updatedMember);
    void deleteMember(String id);
    OrganizationMember login(String username, String password);
    OrganizationMember getByEmpId(String empId);
//    OrganizationMember loginByEmpId(String empId, String password);
	LoginResponse register(OrganizationMember employee);
	LoginResponse login(LoginRequest request);
}