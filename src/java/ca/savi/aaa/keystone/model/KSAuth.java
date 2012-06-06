// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement(name = "auth")
public class KSAuth {
  protected KSPasswordCredential passwordCredentials;

  public KSAuth(KSPasswordCredential passwordCredentials) {
    this.passwordCredentials = passwordCredentials;
  }

  public KSAuth() {
  }

  public void setPasswordCredentials(KSPasswordCredential passwordCredentials) {
    this.passwordCredentials = passwordCredentials;
  }

  public KSPasswordCredential getPasswordCredentials() {
    return passwordCredentials;
  }

}
