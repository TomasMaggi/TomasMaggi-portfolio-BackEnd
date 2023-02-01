package com.AP.portfolio.Auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private TokenService tokenService;

    @PostMapping("/token")
    public String token(Authentication auth) {
        LOGGER.debug("token requested for user: '{}'", auth.getName());
        String token = tokenService.generateToken(auth);
        LOGGER.debug("token granted '{}'", token);
        return token;
    }
}
