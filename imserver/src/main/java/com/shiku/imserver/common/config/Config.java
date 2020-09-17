package com.shiku.imserver.common.config;

public class Config {
   protected String bindIp = null;
   protected Integer bindPort = 5222;
   protected long heartbeatTimeout = 0L;
   protected long readBufferSize = 2048L;

   public String getBindIp() {
      return this.bindIp;
   }

   public Integer getBindPort() {
      return this.bindPort;
   }

   public long getHeartbeatTimeout() {
      return this.heartbeatTimeout;
   }

   public long getReadBufferSize() {
      return this.readBufferSize;
   }

   public void setBindIp(String bindIp) {
      this.bindIp = bindIp;
   }

   public void setBindPort(Integer bindPort) {
      this.bindPort = bindPort;
   }

   public void setHeartbeatTimeout(long heartbeatTimeout) {
      this.heartbeatTimeout = heartbeatTimeout;
   }

   public void setReadBufferSize(long readBufferSize) {
      this.readBufferSize = readBufferSize;
   }
}
