// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
public class KSAccess {

  protected KSToken token;
  protected List<KSServiceCatalog> serviceCatalog;
  protected KSUser user;

  public KSToken getToken() {
    return token;
  }

  public void setServiceCatalog(List<KSServiceCatalog> serviceCatalog) {
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

  public List<KSServiceCatalog> getServiceCatalog() {
    return serviceCatalog;
  }
}
