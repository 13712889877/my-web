package com.cg.map;

import com.cg.entity.LoginEntity;

import java.util.HashMap;
import java.util.Map;

public class LoginMap {
  public Map getMap(){
      LoginEntity le = new LoginEntity();
      Map<String, String> map = new HashMap<String, String>();
        map.put(le.getLoginName(),le.getLoginPassword());

        return map;
    }
}
