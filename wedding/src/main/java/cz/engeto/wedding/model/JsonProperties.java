package cz.engeto.wedding.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties
@PropertySource(value = "user.json")
public class JsonProperties {

    private String user;
    private String locationOfWedding;
    private int people;
    private int maximalPriceOFGiff;
}
