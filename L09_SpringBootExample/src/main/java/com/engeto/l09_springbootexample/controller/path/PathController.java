package com.engeto.l09_springbootexample.controller.path;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("src/main/java/com/engeto/path")
public class PathController {


    @GetMapping("v1/employee/{id}")
    public String getEmployeeById(@PathVariable String id) {
        return "ID " + id;
    }


    @GetMapping("v2/employee/{id}")
    public String getEmployeeByWihtName(@PathVariable("id") String employeeId) {
        return "ID " + employeeId;
    }

    @GetMapping("v3/employee/{id}")
    public String getEmployeeByWihtNameAsValue(@PathVariable(value = "id") String employeeId) {
        return "ID " + employeeId;
    }

    // multipe variables
    @GetMapping("v4/employee/{id}/{name}")
    public String getEmployeeIdAndName(
            @PathVariable(value = "id") String employeeId,
            @PathVariable(value = "name") String employeeName) {
        return "ID " + employeeId + " name " + employeeName;
    }

    //trochu jiny zpusob jak dostat informace
    @GetMapping("v5/employee/{id}/{name}")
    public String gerEmployeeWithMap(
            @PathVariable Map<String, String> pathVarsMap
    ) {
        String id = pathVarsMap.get("id");
        String name = pathVarsMap.get("name");
        if (id != null && name != null) {
            return "ID: " + id + ", name: " + name;
        } else {
            return "Missing Parameters";
        }
    }

    // optional
    @GetMapping(value = {
            "v6/employee",
            "v6/employee/{id}"
    })
    @ResponseBody
    public String getOptional(@PathVariable(value = "id", required = false) String employeId) {
        return "ID: " + employeId;
    }

    // optional value
    @GetMapping({"v7/employee", "v7/employee/{id}"})
    public String getWithOptional(@PathVariable(value = "id", required = false) Optional<String> employeeId) {
        return "ID: " + employeeId.orElseGet(() -> " missing");
    }

    //Out of the box, there isn’t a provision to define a default
    // value for method parameters annotated with @PathVariable.
    // However, we can use the same strategies discussed above
    // to satisfy the default value case for
    // @PathVariable, we just need to check for null on the path variable.
}
