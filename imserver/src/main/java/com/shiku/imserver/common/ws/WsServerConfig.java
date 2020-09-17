package com.shiku.imserver.common.ws;

import org.tio.http.common.HttpConfig;

public class WsServerConfig extends HttpConfig {
   public WsServerConfig(Integer bindPort, boolean useSession) {
      super(bindPort, useSession);
   }

   public WsServerConfig(Integer bindPort) {
      super(bindPort, true);
   }
}
