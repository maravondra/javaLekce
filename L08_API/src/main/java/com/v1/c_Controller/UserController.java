package com.v1.c_Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

  List<String> users = new ArrayList<>(Arrays.asList("Marek", "Petr", "Jana", "Eva"));

  @GetMapping
  public List<String> getAllUsers() {
    return users;
  }

  @PutMapping("/{username}")
  public String addUser(@PathVariable String username) {
    users.add(username);
    return "User " + username + " was added.";
  }

  @DeleteMapping("/{username}")
  public String deleteUser(@PathVariable String username) {
    if (users.remove(username)) {
      return "User " + username + " was removed.";
    } else {
      return "User " + username + " not found.";
    }
  }

}
