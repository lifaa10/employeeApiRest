package com.example.employeeRest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.employeeRest.entity.service.IUserService;

/**
 * 
 * @author lifa
 * Clase Controladora para endpoints de Usuario
 */
@RestController
public class UserController {
	
	@Autowired
	IUserService iUserService;
	
	
	/**
	 * Metodo para Validar Usuario Autorizado y generar Token
	 * @param idUser
	 * @param pass
	 * @return token
	 */
	@PostMapping("/user")
	public String getUser(@RequestParam("user") String idUser, @RequestParam("password") String pass) {
		
		return iUserService.get(idUser,pass);
	}

}
