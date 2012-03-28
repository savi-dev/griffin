// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
public class Access {

  protected Token token;
  protected List<ServiceCatalog> serviceCatalog;
  protected User user;

  public Token getToken() {
    return token;
  }

  public void setServiceCatalog(List<ServiceCatalog> serviceCatalog) {
    this.serviceCatalog = serviceCatalog;
  }

  public void setToken(Token token) {
    this.token = token;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public List<ServiceCatalog> getServiceCatalog() {
    return serviceCatalog;
  }
}
