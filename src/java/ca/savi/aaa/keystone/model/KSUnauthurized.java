// Copyright (C) 2012, The SAVI Project.
package ca.savi.aaa.keystone.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement(name = "error")
public class KSUnauthurized {
  protected String message;
  protected int code;

  public KSUnauthurized(String message, int code) {
    this.message = message;
    this.code = code;
  }

  public KSUnauthurized() {
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @XmlElement(name = "code")
  public int getCode() {
    return code;
  }

  @XmlElement(name = "message")
  public String getMessage() {
    return message;
  }
}
