// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement
public class KSUserCred {
  protected KSAuth auth;

  public KSUserCred(String userName, String password) {
    auth = new KSAuth(new KSPasswordCredential(userName, password));
  }

  public KSUserCred()
  {

  }
  public void setAuth(KSAuth auth) {
    this.auth = auth;
  }

  public KSAuth getAuth() {
    return auth;
  }
}
