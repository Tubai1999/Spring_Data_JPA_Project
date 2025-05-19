package com.springDataJPA.spring.data.jpa.Controller;

import com.springDataJPA.spring.data.jpa.Entity.ApplicationUser;
import com.springDataJPA.spring.data.jpa.Repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Page<ApplicationUser> getAllData(
            @RequestParam (defaultValue = "id") String sortBy,
            @RequestParam (defaultValue = "0" ) int pagenumber
    ){
//        List<ApplicationUser> allData = userRepository.findAllByOrderByName();
//        List<ApplicationUser> allData = userRepository.findAll(Sort.by(sortBy ));
//        List<ApplicationUser> allData = userRepository.findAll(Sort.by(Sort.Direction.DESC,sortBy));

        Pageable pageable = PageRequest.of(pagenumber,5,Sort.by("name"));
        Page allData = userRepository.findAll(pageable);
        System.out.println(allData);
        return allData;
    }



}
