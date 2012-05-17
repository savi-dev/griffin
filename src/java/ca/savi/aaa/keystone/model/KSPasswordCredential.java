// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement(name = "passwordCredentials")
class KSPasswordCredential {
  protected String username;
  protected String password;

  public KSPasswordCredential(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public KSPasswordCredential() {
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @XmlElement(name = "username")
  public String getUsername() {
    return username;
  }

  @XmlElement(name = "password")
  public String getPassword() {
    return password;
  }
}
