// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
class KSRole {
  protected int tenantId;

  public KSRole(int tenantId, int id, String name) {
    this.tenantId = tenantId;
    this.id = id;
    this.name = name;
  }

  public KSRole() {
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTenantId(int tenantId) {
    this.tenantId = tenantId;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getTenantId() {
    return tenantId;
  }
  protected int id;
  protected String name;
}
