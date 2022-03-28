package com.scotycode.springsecurityclient.repository;

import com.scotycode.springsecurityclient.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository
        extends JpaRepository<VerificationToken,Long> {

    VerificationToken findByToken(String token);
}