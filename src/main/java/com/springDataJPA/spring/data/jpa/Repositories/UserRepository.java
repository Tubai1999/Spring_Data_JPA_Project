package com.springDataJPA.spring.data.jpa.Repositories;

import com.springDataJPA.spring.data.jpa.Entity.ApplicationUser;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    List<ApplicationUser> findByLocalDateTimeAfter(LocalDateTime time);
    ApplicationUser findByNameAndId(String name, Long id);

//    List<ApplicationUser> findAllByOrderByName();
    List<ApplicationUser> findBy(Sort sort);
}
