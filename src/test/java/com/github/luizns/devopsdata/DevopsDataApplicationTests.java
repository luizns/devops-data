package com.github.luizns.devopsdata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsDataApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void applicationContextTest() {
        DevopsDataApplication.main(new String[]{});
    }
}
