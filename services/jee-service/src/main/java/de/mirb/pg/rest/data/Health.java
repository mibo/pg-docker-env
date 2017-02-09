package de.mirb.pg.rest.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mibo on 09.02.17.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Health {
  private boolean health;

  public Health() {

  }

  public Health(boolean health) {
    this.health = health;
  }

  public String getHealth() {
    return health ? "OK": "ERROR";
  }

  @Override
  public String toString() {
    return getHealth();
  }
}
