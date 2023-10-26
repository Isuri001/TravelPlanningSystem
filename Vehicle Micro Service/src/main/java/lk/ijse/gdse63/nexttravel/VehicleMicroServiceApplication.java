package lk.ijse.gdse63.nexttravel;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VehicleMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleMicroServiceApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    @Bean
    public Gson getGson(){
        return new Gson();
    }

}
