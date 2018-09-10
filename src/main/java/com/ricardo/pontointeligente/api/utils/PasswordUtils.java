package com.ricardo.pontointeligente.api.utils;

import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ch.qos.logback.classic.Logger;

// Classe para gerar criptografia
public class PasswordUtils {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
		
	}
	
	public static String gerarBCrypt(String senha) {
		if(senha == null)
			return senha;
		
		log.info("Gerando Hash com BCrypt");
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}
}
