package com.mg.codetest;

import com.mg.codetest.examples.a0.SimpleSpringContextLauncherApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = SimpleSpringContextLauncherApplication.class)
class CodetestApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true, "Application context should load successfully");
	}
}
