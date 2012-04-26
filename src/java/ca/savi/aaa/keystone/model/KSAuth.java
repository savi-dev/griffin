// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement(name = "auth")
class KSAuth {
  protected KSPasswordCredential passwordCredentials;

  public KSAuth(KSPasswordCredential passwordCredentials) {
    this.passwordCredentials = passwordCredentials;
  }

  public KSAuth() {
  }

  public void setPasswordCredentials(KSPasswordCredential passwordCredentials) {
    this.passwordCredentials = passwordCredentials;
  }

  @XmlElement(name = "passwordCredentials")
  public KSPasswordCredential getPasswordCredentials() {
    return passwordCredentials;
  }

}
