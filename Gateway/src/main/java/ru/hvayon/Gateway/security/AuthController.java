package ru.hvayon.Gateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.hvayon.Gateway.request.UserInfoRequest;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
    @Autowired
    private AuthService restService;

    @PostMapping(value = "/authorize", produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody OAuthTokenRequest user) {
        return restService.login(user.username, user.password, user.clientId, user.clientSecret);
    }

    @PostMapping(value = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createUser(@RequestBody UserInfoRequest user) {
        return restService.createUser(user);
    }

}
