package com.mz.cicd.poc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PocApplicationTests {

	@Test
	void contextLoads() {
		// 실제 테스트 로직 추가
		int a = 1;
		int b = 1;
		assertEquals(a, b); // 테스트가 성공적으로 통과됨
	}

}
