package com.yuhao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);

    List<User> findByEmailLike(String email);

    List<User> findByEmailLikeOrEmailLike(String email, String email2);

    List<User> findByIdIn(List<Integer> ids);

}
