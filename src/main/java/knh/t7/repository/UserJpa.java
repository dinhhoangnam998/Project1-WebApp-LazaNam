package knh.t7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import knh.t7.model.User;

public interface UserJpa extends JpaRepository<User, Integer> {

	User findByUsername(String username);

	User findByUsernameAndPassword(String username, String password);

}
