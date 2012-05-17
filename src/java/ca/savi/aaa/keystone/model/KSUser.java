// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement(name = "user")
public class KSUser {
  protected String id;
  protected List<KSRole> roles;
  protected String name;
  protected String username;
  protected List<KSRoleLink> roles_links;

  public List<KSRoleLink> getRoles_links() {
    return roles_links;
  }

  public void setRoles_links(List<KSRoleLink> roles_links) {
    this.roles_links = roles_links;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoles(List<KSRole> roles) {
    this.roles = roles;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<KSRole> getRoles() {
    return roles;
  }
}
