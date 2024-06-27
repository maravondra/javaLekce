package com.engeto.c_Controller;

import java.util.Map;

public class PathController {

  @GetMapping("v1/employee")
  public String getEmployeeName() {
    return findEmployeeById(1L);
  }

  @GetMapping("v2/employee/{userId}")
  public String getEmployeeById(@PathVariable Long userId) {
    return findEmployeeById(userId);
  }

  @GetMapping("v3/employee/{id}")
  public String getEmployeeByIdWithName(
      @PathVariable("id") String thisIsTheIdFromUser
  ) {
    return findEmployeeById(Long.parseLong(thisIsTheIdFromUser));
  }

  @GetMapping("v4/employee/{id}")
  public String getEmployeeByIdWithNameAsValue(
      @PathVariable(value = "id") Long userId
  ) {
    return findEmployeeById(userId);
  }

  @GetMapping("v5/employee/{id}/{country}")
  public String getEmployeeByIdAndCountry(
      @PathVariable(value = "id") Long userId,
      @PathVariable(value = "country") String country
  ) {
    String answerId = findEmployeeById(userId);
    String answerCountry = findCountry(country);

    return answerId.concat(" ").concat(answerCountry);
    // answerId + " " + answerCountry
    // zkraceny zapis > return findEmployeeById(userId).concat(" ").concat(country);
  }

  @GetMapping("v6/employee/{id}/{country}")
  public String getEmployeeInMap(
      @PathVariable Map<String, String> pathVariables
  ) {
    String id = pathVariables.get("id");
    String country = pathVariables.get("country");
    return findEmployeeById(Long.parseLong(id)).concat(" ").concat(findCountry(country));

//        return  findEmployeeById(Long.parseLong(pathVariables.get("id")))
//                .concat(" ")
//                .concat(findCountry(pathVariables.get("country")));

//        return pathVariables.toString();
  }

  @GetMapping(value = {
      "v7/employee",
      "v7/employee/{id}"
  }
  )
  public String getEmployeeByIdNotRequired(
      @PathVariable(value = "id", required = false) String employeeId
  ) {
    return employeeId;
  }
}
