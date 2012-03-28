// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement(name = "auth")
class Auth {
  protected PasswordCredential passwordCredentials;

  public Auth(PasswordCredential passwordCredentials) {
    this.passwordCredentials = passwordCredentials;
  }

  public Auth() {
  }

  public void setPasswordCredentials(PasswordCredential passwordCredentials) {
    this.passwordCredentials = passwordCredentials;
  }

  @XmlElement(name = "passwordCredentials")
  public PasswordCredential getPasswordCredentials() {
    return passwordCredentials;
  }

}
