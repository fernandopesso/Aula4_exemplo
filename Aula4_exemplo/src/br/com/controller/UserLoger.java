package br.com.controller;

import br.com.model.User;

public class UserLoger {

	public boolean validacaoLogin(String login, String senha) {
		
		User user = dummyUser();
		
		return user.getLogin().contentEquals(login) && user.getSenha().equals(senha);
	}
	
	public User dummyUser() {
		
		return new User("admin_root", "admin");
	}
}
