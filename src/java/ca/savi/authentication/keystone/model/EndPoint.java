// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
class EndPoint {
  protected String adminURL;
  protected String region;
  protected String internalURL;

  public String getAdminURL() {
    return adminURL;
  }

  public String getInternalURL() {
    return internalURL;
  }

  public String getPublicURL() {
    return publicURL;
  }

  public String getRegion() {
    return region;
  }

  public void setAdminURL(String adminURL) {
    this.adminURL = adminURL;
  }

  public void setInternalURL(String internalURL) {
    this.internalURL = internalURL;
  }

  public void setPublicURL(String publicURL) {
    this.publicURL = publicURL;
  }

  public void setRegion(String region) {
    this.region = region;
  }
  protected String publicURL;
}
