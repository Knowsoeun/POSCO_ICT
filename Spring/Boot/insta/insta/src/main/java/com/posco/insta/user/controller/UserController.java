package com.posco.insta.user.controller;

import com.posco.insta.aspect.TokenRequired;
import com.posco.insta.config.SecurityService;
import com.posco.insta.user.model.UserDto;
import com.posco.insta.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    SecurityService securityService;

    @GetMapping("/")
    public List<UserDto> getUser() {
        return userService.findUser();
    }
    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable String id) {
        UserDto userDto = new UserDto();
        userDto.setId(Integer.valueOf(id));
        return userService.findUserById(userDto);
    }
    @PostMapping("/")
    public Integer postUser(@RequestBody UserDto userDto) {
        return userService.insertUser(userDto);
    }
    @DeleteMapping("/{id}")
    public Integer deleteUserById(@PathVariable String id){
        UserDto userDto = new UserDto();
        userDto.setId(Integer.valueOf(id));
        return userService.deleteUserById(userDto);
    }
    @PutMapping("/{id}")
    public Integer updateUserById(@RequestBody UserDto userDto, @PathVariable String id) {
        userDto.setId(Integer.valueOf(id));
        return userService.updateUserById(userDto);
    }

    @PostMapping("/login")
    public Map loginUser(@RequestBody UserDto userDto){

        System.out.println(userDto);
        UserDto loginUser = userService.serviceLogin(userDto);
//        System.out.println(userService.serviceLogin(userDto));
//        System.out.println(loginUser.getId().toString());
        String token = securityService.createToken(
                loginUser.getId().toString()
               );

        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("name", loginUser.getName());
        map.put("userId", loginUser.getId());
        map.put("img", loginUser.getImg());
        return map;
    }

    @GetMapping("/token")
    @TokenRequired
    public String getToken(@RequestParam(value="token") String token){
        String subject = securityService.getSubject(token);
        return subject;
    }

    @GetMapping("/me")
    @TokenRequired
    public UserDto getUserByMe(){
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String tokenBearer = request.getHeader("Authorization");

        String id = securityService.getSubject(tokenBearer);

        UserDto userDto = new UserDto();
        userDto.setId(Integer.valueOf(id));
        return userService.findUserById(userDto);
    }
    @TokenRequired
    @GetMapping("/check")
    public Boolean check(){
        return true;
    }
    /*@GetMapping("/me")
    @TokenRequired
    public UserDto getUserByMe(){
        UserDto userDto = new UserDto();
        userDto.setId();

        return userService.findUserById(userDto);
    }*/
}
