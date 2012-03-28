// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
class Token {
  protected String expires;
  protected Tenant tenant;
  protected String id;

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getExpires() {
    return expires;
  }

  public String getId() {
    return id;
  }

  public Token() {
  }
}
