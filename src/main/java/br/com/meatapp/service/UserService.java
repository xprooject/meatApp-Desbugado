package br.com.meatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meatapp.domain.User;
import br.com.meatapp.repository.UserRepository;

@Service
public class UserService {

	@Autowired //A dependência automaticamente é instanciada pelo Spring pelo mecanismo de injeção de dependência
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
}
