package ku.cs.kafe.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pawat Puttimit 6410406827
 */
@Configuration
public class ComponentConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

