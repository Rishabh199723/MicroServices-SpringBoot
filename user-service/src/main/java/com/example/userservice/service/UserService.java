package com.example.userservice.service;

import com.example.userservice.Dto.Department;
import com.example.userservice.Dto.ResponseTemplate;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User userData) {
        return userRepository.save(userData);
    }

    public ResponseTemplate fetchUserWithTemplate(Long userId) {
        ResponseTemplate temp = new ResponseTemplate();
        User user = userRepository.findAllByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/findDepartment/"+user.getDepartmentId(),Department.class);
        temp.setUser(user);
        temp.setDepartment(department);
        return temp;
    }
}
