package com.hiep.doan.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hiep.doan.services.Controller.UserController;
import com.hiep.doan.services.Entities.Users;
import com.hiep.doan.services.EntitiesRequest.UsersReq;
import com.hiep.doan.services.Services.UsersServices;
//import com.hiep.doan.services.jwtServices.UserUnknowException;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private UsersServices userService;

    @Captor
    private ArgumentCaptor<UsersReq> UserRequestArgumentCaptor;

    @Test
    public void postingANewUser() throws Exception {
    	UsersReq userRequest = new UsersReq();
        userRequest.setUsername("Lehoanghiep");
        userRequest.setPassword("123456");

        when(userService.createNewUser(UserRequestArgumentCaptor.capture())).thenReturn(true);

        this.mockMvc
                .perform(post("/api/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(userRequest)))
                .andExpect(status().isCreated())
                .andExpect(header().exists("Location"))
                .andExpect(header().string("Location", "http://localhost/api/books/1"));



                assertThat(UserRequestArgumentCaptor.getValue().getUsername(), is("Lehaonghiep"));
                assertThat(UserRequestArgumentCaptor.getValue().getPassword(), is("123456"));

    }

    @Test
    public void getallbookEndpointShouldTwoUsers() throws Exception {
        List<Users> list = new ArrayList<Users>();
        list.add(createUsers(3L,"LeHoangHiep","123456"));
        list.add(createUsers(4L,"LeHoang","123456"));
        when(userService.getlist()).thenReturn(list);
        this.mockMvc.
                perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$",hasSize(2)))
                .andExpect(jsonPath("$[0].username",is("LeHoangHiep")))
                .andExpect(jsonPath("$[0].password",is("123456")));
    }

    @Test
    public void getUserWithOneReturnUser() throws Exception {

        when(userService.findById(1)).thenReturn(createUsers(4L,"LeHoangHiep","123456"));
        this.mockMvc.
                perform(get("/api/users/4"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.username",is("LeHoangHiep")))
                .andExpect(jsonPath("$.password",is("123456")));
    }

//    @Test
//    public void getUserWithUnknowId() throws Exception {
//        when(userService.findById(1)).thenThrow(new UserUnknowException("User with id '42' is not found"));
//        this.mockMvc.
//                perform(get("/api/users/4"))
//                .andExpect(status().isNotFound());
//
//    }
    private Users createUsers(long id, String username, String password)
    {
        Users users = new Users();
//        users.setUsername(username);
//        users.setPassword(password);
//        users.setId(id);
        return users;
    }
}
