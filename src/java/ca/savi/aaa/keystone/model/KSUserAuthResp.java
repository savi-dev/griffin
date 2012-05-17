// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Mohammad Faraji <ms.faraji@mail.utoronto.ca>
 * @Version 0.1
 */
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
// @JsonIgnoreProperties(ignoreUnknown=true)
public class KSUserAuthResp {
  public KSAccess access;
  public KSUnauthurized unathorized;

  public KSAccess getAccess() {
    return access;
  }

  public KSUserAuthResp() {
  }

  public KSUserAuthResp(KSAccess access, KSUnauthurized unathorized) {
    this.access = access;
    this.unathorized = unathorized;
  }

  public void setAccess(KSAccess access) {
    this.access = access;
  }

  public void setUnathorized(KSUnauthurized unathorized) {
    this.unathorized = unathorized;
  }

  public KSUnauthurized getUnathorized() {
    return unathorized;
  }
}
