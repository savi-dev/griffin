// Copyright (C) 2012, The SAVI Project.
package ca.savi.authentication.keystone.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammad Sadegh Faraji <ms.faraji@utoronto.ca> Version 0.1
 */
@XmlRootElement
public class Unauthurized {
  protected String message;
  protected int code;

  public Unauthurized(String message, int code) {
    this.message = message;
    this.code = code;
  }

  public Unauthurized() {
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
