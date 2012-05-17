// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement
public class KSAccess {

  protected KSToken token;
  protected KSServiceCatalog serviceCatalog;
  protected KSUser user;

  public KSToken getToken() {
    return token;
  }

  public void setServiceCatalog(KSServiceCatalog serviceCatalog) {
    this.serviceCatalog = serviceCatalog;
  }

  public void setToken(KSToken token) {
    this.token = token;
  }

  public void setUser(KSUser user) {
    this.user = user;
  }

  public KSUser getUser() {
    return user;
  }

  public KSServiceCatalog getServiceCatalog() {
    return serviceCatalog;
  }
}
