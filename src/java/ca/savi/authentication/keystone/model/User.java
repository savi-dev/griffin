// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
class User {
  protected int id;
  protected List<Role> roles;
  protected String name;

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<Role> getRoles() {
    return roles;
  }
}
