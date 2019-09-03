package br.com.meatApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meatApp.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
