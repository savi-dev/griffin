// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
class ServiceCatalog {
  protected List<EndPoint> endpoints;
  protected String type;
  protected String name;

  public List<EndPoint> getEndpoints() {
    return endpoints;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public ServiceCatalog() {
  }

  public ServiceCatalog(List<EndPoint> endpoints, String type, String name) {
    this.endpoints = endpoints;
    this.type = type;
    this.name = name;
  }

  public void setEndpoints(List<EndPoint> endpoints) {
    this.endpoints = endpoints;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }
}
