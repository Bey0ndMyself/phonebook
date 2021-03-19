package com.nosal.phonebook;

import com.nosal.phonebook.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
class PhonebookApplicationTests {

	@MockBean
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

}
