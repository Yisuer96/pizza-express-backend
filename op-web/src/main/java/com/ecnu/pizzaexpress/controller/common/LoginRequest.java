package com.ecnu.pizzaexpress.controller.common;

import lombok.Data;

/**
 * Created by yerunjie on 2019-03-13
 *
 * @author yerunjie
 */
@Data
public class LoginRequest {

  private String account;
  private String password;
}
