package com.postechfiap.meu_hospital.core.domain.services;

public interface PasswordService {
    String encryptPassword(String rawPassword);
    boolean matches(String rawPassword, String encodedPassword);
}
