package com.example.shrmp3.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Document(collection = "organization_members")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationMember {
    @Id
    private String id;

    private String empId; // Employee ID
    private String name;
    private String role; // Admin, Manager, Intern, etc.
    private String username;
    private String password;
    private String department;
    private String joiningDate;
    private String pan;
    private String aadhar;
    private String performance;
    private String attendance;
}