package com.bilel.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import lombok.RequiredArgsConstructor;

@Configuration @EnableWebSecurity 
@EnableMethodSecurity(prePostEnabled = true)
@RequiredArgsConstructor 
public class SecurityConfig   {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.csrf().disable();
		 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		//consulter tous les produits

		 http.authorizeRequests().antMatchers("/api/all/**").hasAnyAuthority("ADMIN","USER");

		  //consulter un produit par son id

		 http.authorizeRequests().antMatchers(HttpMethod.GET,"/api/**").hasAnyAuthority("ADMIN","USER");

		  //ajouter un nouveau produit
		 http.authorizeRequests().antMatchers(HttpMethod.POST,"/api/**").hasAuthority("ADMIN");

		  //modifier un produit
		 http.authorizeRequests().antMatchers(HttpMethod.PUT,"/api/**").hasAuthority("ADMIN");

		 //supprimer un produit
		 http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/api/**").hasAuthority("ADMIN");

		 http.authorizeRequests().anyRequest().authenticated();
		  http.addFilterBefore(new JWTAuthorizationFilter(),
		 UsernamePasswordAuthenticationFilter.class);
	    return http.build();
	}


 
}
