// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
public class KeystoneResp {
  protected Access access;
  protected Unauthurized unathorized;

  public Access getAccess() {
    return access;
  }

  public KeystoneResp() {
  }

  public KeystoneResp(Access access, Unauthurized unathorized) {
    this.access = access;
    this.unathorized = unathorized;
  }

  public void setAccess(Access access) {
    this.access = access;
  }

  public void setUnathorized(Unauthurized unathorized) {
    this.unathorized = unathorized;
  }

  public Unauthurized getUnathorized() {
    return unathorized;
  }
}
