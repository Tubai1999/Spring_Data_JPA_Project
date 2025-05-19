package com.springDataJPA.spring.data.jpa;

//import com.springDataJPA.spring.data.jpa.Entity.Application_user;
import com.springDataJPA.spring.data.jpa.Entity.ApplicationUser;
import com.springDataJPA.spring.data.jpa.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {
	@Autowired
	UserRepository userRepository;

//	@Test
//	void getId(){
//		ApplicationUser user = ApplicationUser.builder()
//				.age(10)
//				.name("Sumanaaj")
//				.gender("Male")
//				.build();
//
//		userRepository.save(user);
//		System.out.println(user.toString());
//	}

	@Test
	void getDataAfterTime(){
		List<ApplicationUser> user = userRepository.findByLocalDateTimeAfter(LocalDateTime.of(2025,3,10,0,0));
		System.out.println(user);
	}

	@Test
	void getUserByName(){
		ApplicationUser user = userRepository.findByNameAndId("suman",3L);
		System.out.println(user);
	}
}
