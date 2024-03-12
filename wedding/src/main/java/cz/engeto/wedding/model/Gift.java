package cz.engeto.wedding.model;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Gift {

  private Long id;
  private String description;
  private BigDecimal price;

}
