package com.cui.jack.controller;

import com.cui.jack.domain.User;
import com.cui.jack.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/users",method = RequestMethod.GET)
    public String userList(@RequestParam(value = "p",defaultValue = "1") Integer page, ModelMap map){


        Sort sort = new Sort("mobile");

        Pageable pageable = new PageRequest(page-1,2,sort);

        Page<User> list =  userRepository.findAll(pageable);

        map.addAttribute("list", list);

        log.warn("This is a warn message");

        return "userList";
    }

    @RequestMapping(value = "/user/{id}" , method = RequestMethod.GET)
    public String userFindOne(@PathVariable("id") Long id, ModelMap map){
        User user = userRepository.findOne(id);

        map.addAttribute("name",user.getUserName());
        return "userList";
    }


    @PutMapping(value="/user/{id}")
    public User userUpdate(
            @PathVariable("id") Long id,
            @RequestParam("mobile") String mobile,
            @RequestParam("userName") String userName){

        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setMobile(mobile);

        return userRepository.save(user);
    }

}
