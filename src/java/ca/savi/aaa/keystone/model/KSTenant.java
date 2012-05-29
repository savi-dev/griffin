// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement
class KSTenant {
  protected int id;
  protected String name;

  public KSTenant(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public KSTenant() {
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
