package com.shiku.imserver.common;

import com.shiku.imserver.common.config.Config;
import com.shiku.imserver.common.constant.KConstants;
import com.shiku.imserver.common.utils.StringUtils;
import com.shiku.imserver.common.ws.WsServerConfig;
import java.util.Properties;
import org.tio.core.GroupContext;
import org.tio.core.intf.GroupListener;
import org.tio.core.ssl.SslConfig;
import org.tio.http.common.HttpConfig;

public class ImConfig extends Config {
   private Properties properties;
   private HttpConfig httpConfig;
   private WsServerConfig wsServerConfig;
   protected GroupContext groupContext;
   protected GroupListener imGroupListener;
   protected String isStore = "off";
   protected boolean isCluster = false;
   protected String clusterLicenseDir;
   private int wssPort = 5261;
   protected boolean websocketSsl;
   protected String keyStoreFile;
   protected String sslPassword;
   protected String isSSL = "off";
   protected SslConfig sslConfig;
   private ImConfig.MongoConfig mongoConfig;
   private ImConfig.RedisConfig redisConfig;
   private ImConfig.MQConfig mqConfig;
   private ImConfig.ZookeeperConfig zookeeperConfig;
   private boolean pushUserStatus = true;
   private boolean saveChatMsg = true;
   private boolean saveMucMsg = true;
   private String serverToken = "";
   private boolean filterKeyWord = false;
   private String messageHandlerNameSpace;

   public ImConfig(Properties properties) {
      this.properties = properties;
   }

   public void initImConfig() {
      try {
         String bindIp = this.properties.getProperty("bindIp", "127.0.0.1");
         this.setBindIp(bindIp);
         this.setBindPort(Integer.valueOf(this.properties.getProperty("tcp.port", "5666")));
         WsServerConfig wsConfig = new WsServerConfig(Integer.valueOf(this.properties.getProperty("websocket.port", "5260")), true);
         this.setWsServerConfig(wsConfig);
         String wsSsl = this.properties.getProperty("websocket.ssl", "false");
         if ("true".equals(wsSsl)) {
            this.setWebsocketSsl(true);
         }

         this.setKeyStoreFile(this.properties.getProperty("ssl.keyStoreFile", ""));
         this.setSslPassword(this.properties.getProperty("ssl.password", ""));
         this.setCluster("true".equals(this.properties.getProperty("isCluster", "false")));
         this.clusterLicenseDir = this.properties.getProperty("clusterLicenseDir", "");
         this.pushUserStatus = "true".equals(this.properties.getProperty("pushUserStatus", "true"));
         this.serverToken = this.properties.getProperty("serverToken", "token");
         KConstants.isDebug = "true".equals(this.properties.getProperty("isDebug", "false"));
         System.out.println("shiku log isDebug ===> " + KConstants.isDebug);
         this.setMessageHandlerNameSpace(this.properties.getProperty("messageHandlerNameSpace", "com.shiku.imserver.message.hander"));
         ImConfig.MongoConfig mongoConfig = new ImConfig.MongoConfig();
         mongoConfig.setUri(this.properties.getProperty("mongoConfig.uri"));
         int connectTimeout = Integer.valueOf(this.properties.getProperty("mongoConfig.connectTimeout", "0"));
         int socketTimeout = Integer.valueOf(this.properties.getProperty("mongoConfig.socketTimeout", "0"));
         int maxWaitTime = Integer.valueOf(this.properties.getProperty("mongoConfig.maxWaitTime", "0"));
         if (0 < connectTimeout) {
            mongoConfig.setConnectTimeout(connectTimeout);
         }

         if (0 < socketTimeout) {
            mongoConfig.setSocketTimeout(socketTimeout);
         }

         if (0 < maxWaitTime) {
            mongoConfig.setMaxWaitTime(maxWaitTime);
         }

         this.setMongoConfig(mongoConfig);
         ImConfig.RedisConfig redisConfig = new ImConfig.RedisConfig();
         String redisUrl = this.properties.getProperty("redisConfig.address");
         String password = this.properties.getProperty("redisConfig.password");
         int database = Integer.valueOf(this.properties.getProperty("redisConfig.database", "0"));
         int pingTimeout = Integer.valueOf(this.properties.getProperty("redisConfig.pingTimeout", "0"));
         int redisTimeout = Integer.valueOf(this.properties.getProperty("redisConfig.timeout", "0"));
         int redisConnectTimeout = Integer.valueOf(this.properties.getProperty("redisConfig.connectTimeout", "0"));
         int pingConnectionInterval = Integer.valueOf(this.properties.getProperty("redisConfig.pingConnectionInterval", "0"));
         if (!StringUtils.isEmpty(redisUrl)) {
            redisConfig.setAddress(redisUrl);
         }

         redisConfig.setPassword(password);
         redisConfig.setDatabase(database);
         if (0 < pingTimeout) {
            redisConfig.setPingTimeout(pingTimeout);
         }

         if (0 < redisTimeout) {
            redisConfig.setTimeout(redisTimeout);
         }

         if (0 < redisConnectTimeout) {
            redisConfig.setConnectTimeout(redisConnectTimeout);
         }

         if (0 < pingConnectionInterval) {
            redisConfig.setPingConnectionInterval(pingConnectionInterval);
         }

         this.setRedisConfig(redisConfig);
         String zk_connectStr = this.properties.getProperty("zkConfig.connectStr", "localhost:2181");
         int zk_sessionTimeoutMs = Integer.valueOf(this.properties.getProperty("zkConfig.sessionTimeoutMs", "10000"));
         int zk_connectionTimeoutMs = Integer.valueOf(this.properties.getProperty("zkConfig.connectionTimeoutMs", "10000"));
         String zk_namespace = this.properties.getProperty("zkConfig.namespace", "shikuim");
         ImConfig.ZookeeperConfig zookeeperConfig = new ImConfig.ZookeeperConfig(zk_connectStr, zk_sessionTimeoutMs, zk_connectionTimeoutMs, zk_namespace);
         this.setZookeeperConfig(zookeeperConfig);
         ImConfig.MQConfig mqConfig = new ImConfig.MQConfig();
         String mqNameAddr = this.properties.getProperty("mqConfig.nameAddr");
         int threadMin = Integer.valueOf(this.properties.getProperty("mqConfig.threadMin", "0"));
         int threadMax = Integer.valueOf(this.properties.getProperty("mqConfig.threadMax", "0"));
         int batchMaxSize = Integer.valueOf(this.properties.getProperty("mqConfig.batchMaxSize", "0"));
         if (!StringUtils.isEmpty(mqNameAddr)) {
            mqConfig.setNameAddr(mqNameAddr);
         }

         if (0 < threadMin) {
            mqConfig.setThreadMin(threadMin);
         }

         if (0 < threadMax) {
            mqConfig.setThreadMax(threadMax);
         }

         if (0 < batchMaxSize) {
            mqConfig.setBatchMaxSize(batchMaxSize);
         }

         this.setMqConfig(mqConfig);
      } catch (Exception var26) {
         var26.printStackTrace();
      }

   }

   public void setProperties(Properties properties) {
      this.properties = properties;
   }

   public void setHttpConfig(HttpConfig httpConfig) {
      this.httpConfig = httpConfig;
   }

   public void setWsServerConfig(WsServerConfig wsServerConfig) {
      this.wsServerConfig = wsServerConfig;
   }

   public void setGroupContext(GroupContext groupContext) {
      this.groupContext = groupContext;
   }

   public void setImGroupListener(GroupListener imGroupListener) {
      this.imGroupListener = imGroupListener;
   }

   public void setIsStore(String isStore) {
      this.isStore = isStore;
   }

   public void setCluster(boolean isCluster) {
      this.isCluster = isCluster;
   }

   public void setClusterLicenseDir(String clusterLicenseDir) {
      this.clusterLicenseDir = clusterLicenseDir;
   }

   public void setWssPort(int wssPort) {
      this.wssPort = wssPort;
   }

   public void setWebsocketSsl(boolean websocketSsl) {
      this.websocketSsl = websocketSsl;
   }

   public void setKeyStoreFile(String keyStoreFile) {
      this.keyStoreFile = keyStoreFile;
   }

   public void setSslPassword(String sslPassword) {
      this.sslPassword = sslPassword;
   }

   public void setIsSSL(String isSSL) {
      this.isSSL = isSSL;
   }

   public void setSslConfig(SslConfig sslConfig) {
      this.sslConfig = sslConfig;
   }

   public void setMongoConfig(ImConfig.MongoConfig mongoConfig) {
      this.mongoConfig = mongoConfig;
   }

   public void setRedisConfig(ImConfig.RedisConfig redisConfig) {
      this.redisConfig = redisConfig;
   }

   public void setMqConfig(ImConfig.MQConfig mqConfig) {
      this.mqConfig = mqConfig;
   }

   public void setZookeeperConfig(ImConfig.ZookeeperConfig zookeeperConfig) {
      this.zookeeperConfig = zookeeperConfig;
   }

   public void setPushUserStatus(boolean pushUserStatus) {
      this.pushUserStatus = pushUserStatus;
   }

   public void setSaveChatMsg(boolean saveChatMsg) {
      this.saveChatMsg = saveChatMsg;
   }

   public void setSaveMucMsg(boolean saveMucMsg) {
      this.saveMucMsg = saveMucMsg;
   }

   public void setServerToken(String serverToken) {
      this.serverToken = serverToken;
   }

   public void setFilterKeyWord(boolean filterKeyWord) {
      this.filterKeyWord = filterKeyWord;
   }

   public void setMessageHandlerNameSpace(String messageHandlerNameSpace) {
      this.messageHandlerNameSpace = messageHandlerNameSpace;
   }

   public Properties getProperties() {
      return this.properties;
   }

   public HttpConfig getHttpConfig() {
      return this.httpConfig;
   }

   public WsServerConfig getWsServerConfig() {
      return this.wsServerConfig;
   }

   public GroupContext getGroupContext() {
      return this.groupContext;
   }

   public GroupListener getImGroupListener() {
      return this.imGroupListener;
   }

   public String getIsStore() {
      return this.isStore;
   }

   public boolean isCluster() {
      return this.isCluster;
   }

   public String getClusterLicenseDir() {
      return this.clusterLicenseDir;
   }

   public int getWssPort() {
      return this.wssPort;
   }

   public boolean isWebsocketSsl() {
      return this.websocketSsl;
   }

   public String getKeyStoreFile() {
      return this.keyStoreFile;
   }

   public String getSslPassword() {
      return this.sslPassword;
   }

   public String getIsSSL() {
      return this.isSSL;
   }

   public SslConfig getSslConfig() {
      return this.sslConfig;
   }

   public ImConfig.MongoConfig getMongoConfig() {
      return this.mongoConfig;
   }

   public ImConfig.RedisConfig getRedisConfig() {
      return this.redisConfig;
   }

   public ImConfig.MQConfig getMqConfig() {
      return this.mqConfig;
   }

   public ImConfig.ZookeeperConfig getZookeeperConfig() {
      return this.zookeeperConfig;
   }

   public boolean isPushUserStatus() {
      return this.pushUserStatus;
   }

   public boolean isSaveChatMsg() {
      return this.saveChatMsg;
   }

   public boolean isSaveMucMsg() {
      return this.saveMucMsg;
   }

   public String getServerToken() {
      return this.serverToken;
   }

   public boolean isFilterKeyWord() {
      return this.filterKeyWord;
   }

   public String getMessageHandlerNameSpace() {
      return this.messageHandlerNameSpace;
   }

   public static class ZookeeperConfig {
      protected String connectStr = "localhost:2181";
      protected int sessionTimeoutMs = 10000;
      protected int connectionTimeoutMs = 10000;
      protected String namespace = "skim";

      public ZookeeperConfig() {
      }

      public ZookeeperConfig(String connectStr, int sessionTimeoutMs, int connectionTimeoutMs, String namespace) {
         this.connectStr = connectStr;
         this.sessionTimeoutMs = sessionTimeoutMs;
         this.connectionTimeoutMs = connectionTimeoutMs;
         this.namespace = namespace;
      }

      public String getConnectStr() {
         return this.connectStr;
      }

      public int getSessionTimeoutMs() {
         return this.sessionTimeoutMs;
      }

      public int getConnectionTimeoutMs() {
         return this.connectionTimeoutMs;
      }

      public String getNamespace() {
         return this.namespace;
      }

      public void setConnectStr(String connectStr) {
         this.connectStr = connectStr;
      }

      public void setSessionTimeoutMs(int sessionTimeoutMs) {
         this.sessionTimeoutMs = sessionTimeoutMs;
      }

      public void setConnectionTimeoutMs(int connectionTimeoutMs) {
         this.connectionTimeoutMs = connectionTimeoutMs;
      }

      public void setNamespace(String namespace) {
         this.namespace = namespace;
      }
   }

   public static class MQConfig {
      protected String nameAddr = "localhost:9876";
      protected int threadMin = Runtime.getRuntime().availableProcessors();
      protected int threadMax = Runtime.getRuntime().availableProcessors() * 2;
      protected int batchMaxSize = 20;

      public String getNameAddr() {
         return this.nameAddr;
      }

      public int getThreadMin() {
         return this.threadMin;
      }

      public int getThreadMax() {
         return this.threadMax;
      }

      public int getBatchMaxSize() {
         return this.batchMaxSize;
      }

      public void setNameAddr(String nameAddr) {
         this.nameAddr = nameAddr;
      }

      public void setThreadMin(int threadMin) {
         this.threadMin = threadMin;
      }

      public void setThreadMax(int threadMax) {
         this.threadMax = threadMax;
      }

      public void setBatchMaxSize(int batchMaxSize) {
         this.batchMaxSize = batchMaxSize;
      }
   }

   public static class RedisConfig {
      private String address = "redis://127.0.0.1:6379";
      private int database = 0;
      private String password;
      private int connectionMinimumIdleSize = 32;
      private int connectionPoolSize = 64;
      private int connectTimeout = 10000;
      private int pingConnectionInterval = 500;
      private int pingTimeout = 10000;
      private int timeout = 10000;
      private boolean isCluster = false;

      public void setAddress(String address) {
         this.address = address;
      }

      public void setDatabase(int database) {
         this.database = database;
      }

      public void setPassword(String password) {
         this.password = password;
      }

      public void setConnectionMinimumIdleSize(int connectionMinimumIdleSize) {
         this.connectionMinimumIdleSize = connectionMinimumIdleSize;
      }

      public void setConnectionPoolSize(int connectionPoolSize) {
         this.connectionPoolSize = connectionPoolSize;
      }

      public void setConnectTimeout(int connectTimeout) {
         this.connectTimeout = connectTimeout;
      }

      public void setPingConnectionInterval(int pingConnectionInterval) {
         this.pingConnectionInterval = pingConnectionInterval;
      }

      public void setPingTimeout(int pingTimeout) {
         this.pingTimeout = pingTimeout;
      }

      public void setTimeout(int timeout) {
         this.timeout = timeout;
      }

      public void setCluster(boolean isCluster) {
         this.isCluster = isCluster;
      }

      public String getAddress() {
         return this.address;
      }

      public int getDatabase() {
         return this.database;
      }

      public String getPassword() {
         return this.password;
      }

      public int getConnectionMinimumIdleSize() {
         return this.connectionMinimumIdleSize;
      }

      public int getConnectionPoolSize() {
         return this.connectionPoolSize;
      }

      public int getConnectTimeout() {
         return this.connectTimeout;
      }

      public int getPingConnectionInterval() {
         return this.pingConnectionInterval;
      }

      public int getPingTimeout() {
         return this.pingTimeout;
      }

      public int getTimeout() {
         return this.timeout;
      }

      public boolean isCluster() {
         return this.isCluster;
      }
   }

   public static class MongoConfig {
      private String uri;
      private String apiUri;
      private String roomDbName;
      private int connectTimeout = 20000;
      private int socketTimeout = 20000;
      private int maxWaitTime = 20000;

      public void setUri(String uri) {
         this.uri = uri;
      }

      public void setApiUri(String apiUri) {
         this.apiUri = apiUri;
      }

      public void setRoomDbName(String roomDbName) {
         this.roomDbName = roomDbName;
      }

      public void setConnectTimeout(int connectTimeout) {
         this.connectTimeout = connectTimeout;
      }

      public void setSocketTimeout(int socketTimeout) {
         this.socketTimeout = socketTimeout;
      }

      public void setMaxWaitTime(int maxWaitTime) {
         this.maxWaitTime = maxWaitTime;
      }

      public String getUri() {
         return this.uri;
      }

      public String getApiUri() {
         return this.apiUri;
      }

      public String getRoomDbName() {
         return this.roomDbName;
      }

      public int getConnectTimeout() {
         return this.connectTimeout;
      }

      public int getSocketTimeout() {
         return this.socketTimeout;
      }

      public int getMaxWaitTime() {
         return this.maxWaitTime;
      }
   }
}
