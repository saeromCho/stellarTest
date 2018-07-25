package net.hiskarma.stellarTest.controller;

import net.hiskarma.stellarTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/my_oauth_info")
    public Principal user(Principal principal) {
        return principal;
    }
}
