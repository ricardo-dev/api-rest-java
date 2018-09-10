package com.ricardo.pontointeligente.api.utils;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassowordUtilsTest {
	
	private static final String senha = "12345";
	private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
	
	
	@Test
	public void testSenhaNula() throws Exception {
		assertNull(PasswordUtils.gerarBCrypt(null));
	}
	
	@Test
	public void testGerarHashSenha() throws Exception {
		String hash = PasswordUtils.gerarBCrypt(senha);
		
		assertTrue(bCryptEncoder.matches(senha, hash));
	}
}
