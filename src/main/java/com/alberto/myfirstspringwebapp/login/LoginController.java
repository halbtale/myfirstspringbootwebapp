package com.alberto.myfirstspringwebapp.login;

import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;

    LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        } else {
            model.put("errorMessage", "Wrong credentials");
            return "login";
        }
    }
}
