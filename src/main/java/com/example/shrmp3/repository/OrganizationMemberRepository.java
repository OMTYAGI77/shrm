package com.example.shrmp3.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.shrmp3.bo.OrganizationMember;

public interface OrganizationMemberRepository extends MongoRepository<OrganizationMember, String> {
    Optional<OrganizationMember> findByUsernameAndPassword(String username, String password);
    Optional<OrganizationMember> findByEmpId(String empId);
    Optional<OrganizationMember> findByEmpIdAndPassword(String empId, String password);
    
}
