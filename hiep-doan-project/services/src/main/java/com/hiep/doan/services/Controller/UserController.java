package com.hiep.doan.services.Controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.hiep.doan.services.Entities.Users;
import com.hiep.doan.services.EntitiesRequest.UsersReq;
import com.hiep.doan.services.Services.UsersServices;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private Session session;
    private static final Set<UserController> UserController = new CopyOnWriteArraySet<UserController>();
    private static HashMap<String, String> users = new HashMap<String, String>();
    private HashMap<String, String> user = new HashMap<String, String>();

    @Autowired
    private UsersServices userService;

    public static HashMap<Long, String> box = new HashMap<>();

    @PostMapping
    public ResponseEntity<Void> createNewUser(@Valid @RequestBody UsersReq userRequest, UriComponentsBuilder uriComponentsBuilder) {
        boolean check = userService.createNewUser(userRequest);
        UriComponents uriComponents = uriComponentsBuilder.path("api/users/check : {check}").buildAndExpand(check);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(uriComponents.toUri());
        if (check) {
            return new ResponseEntity<Void>(httpHeaders, HttpStatus.CREATED);

        }
        return new ResponseEntity<Void>(httpHeaders, HttpStatus.BAD_REQUEST);
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<List<UsersReq>> getAllUsers() {
        List<UsersReq> listUserRequests = new ArrayList<>();
        for (Users user : userService.getlist()) {
        	UsersReq userRequest = new UsersReq();
            userRequest.setUsername(user.getUsername());
            userRequest.setPassword(user.getPassword());
            listUserRequests.add(userRequest);
        }
        return ResponseEntity.ok(listUserRequests);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserByID(Session session, @PathVariable("id") int id) {
        Users users = userService.findById(id);
        if (users != null) {
            UsersReq userRequest = new UsersReq();
            userRequest.setUsername(users.getUsername());
            userRequest.setPassword(users.getPassword());
            return ResponseEntity.ok(userRequest);
        }

        return new ResponseEntity<Object>("Not Found User", HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}?{username}?{password}")
    public ResponseEntity<Boolean> updateUserById(@PathVariable("id") int id, @PathVariable("username") String username, @PathVariable("password") String password) {
        return ResponseEntity.ok(userService.updateByID(id, username, password));
    }

    ;

}

