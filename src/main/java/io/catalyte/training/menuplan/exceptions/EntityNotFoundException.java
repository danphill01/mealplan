package io.catalyte.training.menuplan.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {
  public EntityNotFoundException(String entity, long id) {
    super(String.format("%s %s cannot be found.", entity, id));
  }
  public EntityNotFoundException(String entity, String name) {
    super(String.format("%s %s cannot be found.", entity, name));
  }
}
