package com.example.employeeRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.employeeRest.security.JWTAuthorizationFilter;


/**
 * 
 * @author lifa
 * Clase Principal para ejecutar aplicacion Spring
 *
 */
@SpringBootApplication
public class EmployeesRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesRestApplication.class, args);
	}
	
	
	/**
	 * @author lifa
	 * Clase Para Activar y Configuracion de la Seguridad web
	 *
	 */
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers(HttpMethod.GET).permitAll()
				.antMatchers(HttpMethod.POST).permitAll()
				.antMatchers(HttpMethod.PUT).permitAll()
				.anyRequest().authenticated();
		}
	}

}
