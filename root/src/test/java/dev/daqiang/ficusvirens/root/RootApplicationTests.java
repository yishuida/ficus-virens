package dev.daqiang.ficusvirens.root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RootApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("Testing");
    }

}
