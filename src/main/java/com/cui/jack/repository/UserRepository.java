package com.cui.jack.repository;

import com.cui.jack.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
* 这个接口就好比是数据模型一样，默认具有findOne，findAll方法，参数可以传入User数据类
* 可以自定义一些方法，比如findByAge方法
* */
public interface UserRepository extends JpaRepository<User, Integer> {

//    Page<User> findAll(Pageable pageable);

}
