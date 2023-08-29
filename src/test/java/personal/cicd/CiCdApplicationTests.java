package personal.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource("classpath:application-test.properties")
@SpringBootTest
class CiCdApplicationTests {

	@Test
	void contextLoads() {
	}

}
