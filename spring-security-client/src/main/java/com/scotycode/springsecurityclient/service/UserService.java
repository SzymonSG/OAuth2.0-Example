package com.scotycode.springsecurityclient.service;

import com.scotycode.springsecurityclient.entity.User;
import com.scotycode.springsecurityclient.entity.VerificationToken;
import com.scotycode.springsecurityclient.model.UserModel;

import java.util.Optional;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationTokenForUser(String token, User user);

    String validateVerifactionToken(String token);

    VerificationToken generateNewVerificationToken(String oldtoken);

    User findUserByEmail(String email);

    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    Optional<User> getUserByPasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);
}
