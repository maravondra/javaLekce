package org.example.a_exception;

public class InvalidRequestException extends Exception {

  public InvalidRequestException(String message) {
    super(message);
  }
}
