package cz.engeto.wedding.service;

import cz.engeto.wedding.model.JsonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReadService {

    @Autowired
    private JsonProperties jsonProperties;

    public String readFile() {
        return jsonProperties.toString();
    }

    public int getPrice() {
        return jsonProperties.getMaximalPriceOFGiff();
    }

}
