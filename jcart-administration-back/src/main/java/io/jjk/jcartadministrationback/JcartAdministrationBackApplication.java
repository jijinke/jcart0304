package io.jjk.jcartadministrationback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.jjk.jcartadministrationback.dao")
public class JcartAdministrationBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcartAdministrationBackApplication.class, args);
    }

}
