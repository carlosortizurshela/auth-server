package org.mutualser.oauth2;

import java.util.ArrayList;
import java.util.List;

import org.mutualser.oauth2.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

@Controller
public class UserController {

    private List<User> employees = new ArrayList<>();

    @GetMapping("/user")
    @ResponseBody
    public Optional<User> getEmployee(@RequestParam String email) {
        return employees.stream().findFirst();
    }

    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void postMessage(@RequestBody User employee) {
        employees.add(employee);
    }

}
