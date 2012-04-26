// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
public class KSUser {
  protected int id;
  protected List<KSRole> roles;
  protected String name;

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoles(List<KSRole> roles) {
    this.roles = roles;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<KSRole> getRoles() {
    return roles;
  }
}
