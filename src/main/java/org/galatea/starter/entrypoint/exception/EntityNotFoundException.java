package org.galatea.starter.entrypoint.exception;

import java.util.Collection;

public class EntityNotFoundException extends RuntimeException {

  /**
   * Create an EntityNotFoundException for a single missing entity.
   */
  public EntityNotFoundException(final Class<?> type, final String identifier) {
    super("Entity " + identifier + " of type " + type.getSimpleName() + " was not found");
  }

  /**
   * Create an EntityNotFoundException for multiple missing entities.
   */
  public EntityNotFoundException(final Class<?> type, final Collection<?> identifier) {
    super("Entities " + identifier + " of type " + type.getSimpleName() + " were not found");
  }

}
