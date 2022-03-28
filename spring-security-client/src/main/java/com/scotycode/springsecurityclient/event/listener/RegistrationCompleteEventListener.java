package com.scotycode.springsecurityclient.event.listener;


import com.scotycode.springsecurityclient.entity.User;
import com.scotycode.springsecurityclient.event.RegistrationCompleteEvent;
import com.scotycode.springsecurityclient.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
@RequiredArgsConstructor
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    private final UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the verification Token for the user with link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();

        userService.saveVerificationTokenForUser(token,user);

        String url =
                event.getApplicationUrl() +
                "/verifyRegistration?token="
                + token;
        //JavaSendMessged implement
        log.info("Click link to verify account: {}",url) ;



        //Send Mail to user
    }
}
