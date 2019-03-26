package com.ctrip.framework.apollo.core.enums;

import com.ctrip.framework.apollo.core.utils.StringUtils;

public final class EnvUtils {
  
  public static Env transformEnv(String envName) {
    if (StringUtils.isBlank(envName)) {
      return Env.UNKNOWN;
    }
    switch (envName.trim().toUpperCase()) {
      case "LPT":
        return Env.LPT;
      case "FAT":
      case "FWS":
        return Env.FAT;
      case "QAS":
      case "QASA":
        return Env.QASA;
      case "QASB":
        return Env.QASB;
      case "UAT":
      case "UATA":
        return Env.UATA;
      case "UATB":
        return Env.UATB;
      case "PRO":
      case "PROD": //just in case
        return Env.PRO;
      case "PRD":
        return Env.PRD;
      case "DEV":
        return Env.DEV;
      case "LOCAL":
        return Env.LOCAL;
      case "TOOLS":
        return Env.TOOLS;
      default:
        return Env.UNKNOWN;
    }
  }
}
