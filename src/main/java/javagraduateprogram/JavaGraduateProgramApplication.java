package javagraduateprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ServletComponentScan
public class JavaGraduateProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaGraduateProgramApplication.class, args);
    }

}