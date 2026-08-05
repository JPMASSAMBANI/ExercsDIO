package org.massambani;

import java.util.HashMap;
import java.util.Map;

public record User(String name, int age) {
	
	//Chama se com *User.mapUser* na Main
	public static void mapUser() {
		Map<String, User> users = new HashMap<>();
//		users.putIfAbsent("ana@email.com", new User("Ana", 25));
		System.out.println(users);
		users.putIfAbsent("ana@email.com", new User("Ana Maria", 30));
		System.out.println(users);
		System.out.println(users.containsKey("carlos@email.com"));
		System.out.println(users.getOrDefault("carlos@email.com", new User("Matheus", 40)));

	}

}
