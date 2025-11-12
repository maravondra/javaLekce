package com.v1.easy_example.a3.query;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("id")
public class QueryController {

    @GetMapping("v1/id")
    public String getId(@RequestParam String id) {
        return "Say hello to " + id;
    }

    @GetMapping("v2/id")
    public String getIdWithName(@RequestParam("id") String idClient) {
        return "Say hello to " + idClient;
    }

    @GetMapping("v3/id")
    public String getIdWithNameIn(@RequestParam(name = "id") String idClient) {
        return "Say hello to " + idClient;
    }


    // bez http://localhost:8080/v4/id
    // s http://localhost:8080/v4/id?id=15
    @GetMapping("v4/id")
    public String getParamOptional(@RequestParam(name = "id", required = false) String idClient) {
        return "Say hello to " + idClient;
    }

    @GetMapping("v5/id")
    public String getParamOptionalWithCondition(@RequestParam(name = "id", required = false) String idClient) {
        String returnString = "Say to hello";
        if (idClient != null) {
            returnString = returnString.concat(" to ").concat(idClient);
        }
        return returnString;
    }

    // jeste s pouziti Optional
    @GetMapping("v6/id")
    public String getWithOptional(@RequestParam(name = "id") Optional<String> id) {
        return "ID: " + id.orElseGet(() -> "not provide");
    }

    // dat default hodnotu
    @GetMapping("v7/id")
    public String getWithOptional(@RequestParam(name = "id", defaultValue = "000") String idClient) {
        return "ID: " + idClient;
    }

    // predat dva parametry
    @GetMapping("v8/ids")
    public String getTwoParams(@RequestParam(name = "id") String idClient, @RequestParam(name = "value") String value) {
        return "ID: " + idClient + " value: " + value;
    }

    // predat list of
    //      http://localhost:8080/spring-mvc-basics/api/foos?id=1,2,3
    //      http://localhost:8080/spring-mvc-basics/api/foos?id=1&id=2
    @GetMapping("v9/ids")
    public String getAllParams(@RequestParam(name = "id") List<String> id) {
        return "ID: " + id.toString();
    }
}
