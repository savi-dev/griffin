// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement(name = "serviceCatalog")
class KSServiceCatalog {
  protected List<KSEndPoint> endpoints;
  protected String type;
  protected String name;

  public List<KSEndPoint> getEndpoints() {
    return endpoints;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public KSServiceCatalog() {
  }

  public KSServiceCatalog(List<KSEndPoint> endpoints,
      String type, String name) {
    this.endpoints = endpoints;
    this.type = type;
    this.name = name;
  }

  public void setEndpoints(List<KSEndPoint> endpoints) {
    this.endpoints = endpoints;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }
}
