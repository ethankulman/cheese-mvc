package org.launchcode.controllers;
import org.launchcode.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * Created by ethan on 4/3/17.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String index(Model model) {
        ArrayList<User> users = UserData.getAll();
        model.addAttribute("users", users);
        return "user/index";
    }

    @RequestMapping(value = "{userId}", method = RequestMethod.GET)
    public String showUserInfo(Model model, @PathVariable int userId) {
        User user = UserData.getById(userId);
        model.addAttribute("user", user);
        return "user/user";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String add(Model model, User user){
        model.addAttribute("user", user);
        return "user/add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String add(Model model, User user, String verify){
        model.addAttribute("user", user);
        if(user.getPassword().equals(verify) && !user.getUsername().isEmpty() && !user.getEmail().isEmpty()) {
            UserData.add(user);
            return "user/user";
        }
        else{
            return "user/add";
        }
    }

}
