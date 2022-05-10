package hugoAPI.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrimeiraRestApiApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(4,2+2);
	}

}
