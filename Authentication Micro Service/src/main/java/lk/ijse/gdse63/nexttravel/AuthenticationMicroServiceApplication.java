package lk.ijse.gdse63.nexttravel;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuthenticationMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationMicroServiceApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper(){
        return  new ModelMapper();
    }

}
