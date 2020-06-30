package com.example.employeeRest.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.employeeRest.entity.models.User;

public interface IUserDao extends CrudRepository<User, String>{

}
