// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
public class KSUserCred {
  protected Auth auth;

  public KSUserCred() {
  }

  public KSUserCred(String userName, String password) {
    auth = new Auth(new PasswordCredential(userName, password));
  }

  public void setAuth(Auth auth) {
    this.auth = auth;
  }

  @XmlElement(name = "auth")
  public Auth getAuth() {
    return auth;
  }
}
