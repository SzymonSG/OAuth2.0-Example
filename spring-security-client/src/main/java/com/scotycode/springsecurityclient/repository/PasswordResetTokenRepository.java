package com.scotycode.springsecurityclient.repository;

import com.scotycode.springsecurityclient.entity.PasswordResetToken;
import com.scotycode.springsecurityclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken,Long> {
    PasswordResetToken findByToken(String token);
}
