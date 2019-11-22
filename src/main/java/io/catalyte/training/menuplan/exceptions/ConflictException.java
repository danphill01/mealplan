package io.catalyte.training.menuplan.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException {
  public ConflictException(Exception e, String entity, String name) {
    super(String.format("There is already a %s named %s.", entity, name));
  }
}
