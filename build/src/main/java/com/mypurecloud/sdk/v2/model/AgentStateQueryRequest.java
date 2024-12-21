package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AgentStateSessionFilter;
import com.mypurecloud.sdk.v2.model.AgentStateUserFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentStateQueryRequest
 */

public class AgentStateQueryRequest  implements Serializable {
  
  private AgentStateUserFilter userFilter = null;
  private AgentStateSessionFilter sessionFilter = null;

  private static class UserOrderByEnumDeserializer extends StdDeserializer<UserOrderByEnum> {
    public UserOrderByEnumDeserializer() {
      super(UserOrderByEnumDeserializer.class);
    }

    @Override
    public UserOrderByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UserOrderByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Search user order dimension names; default to userName
   */
 @JsonDeserialize(using = UserOrderByEnumDeserializer.class)
  public enum UserOrderByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USERNAME("userName"),
    SEGMENTSTART("segmentStart"),
    SESSIONSTART("sessionStart");

    private String value;

    UserOrderByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UserOrderByEnum fromString(String key) {
      if (key == null) return null;

      for (UserOrderByEnum value : UserOrderByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UserOrderByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UserOrderByEnum userOrderBy = null;

  private static class UserOrderEnumDeserializer extends StdDeserializer<UserOrderEnum> {
    public UserOrderEnumDeserializer() {
      super(UserOrderEnumDeserializer.class);
    }

    @Override
    public UserOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UserOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Search user order direction; default to asc
   */
 @JsonDeserialize(using = UserOrderEnumDeserializer.class)
  public enum UserOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("asc"),
    DESC("desc");

    private String value;

    UserOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UserOrderEnum fromString(String key) {
      if (key == null) return null;

      for (UserOrderEnum value : UserOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UserOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UserOrderEnum userOrder = null;

  private static class SessionOrderByEnumDeserializer extends StdDeserializer<SessionOrderByEnum> {
    public SessionOrderByEnumDeserializer() {
      super(SessionOrderByEnumDeserializer.class);
    }

    @Override
    public SessionOrderByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SessionOrderByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Search session order dimension names; default to segmentStart
   */
 @JsonDeserialize(using = SessionOrderByEnumDeserializer.class)
  public enum SessionOrderByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SEGMENTSTART("segmentStart"),
    SESSIONSTART("sessionStart");

    private String value;

    SessionOrderByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SessionOrderByEnum fromString(String key) {
      if (key == null) return null;

      for (SessionOrderByEnum value : SessionOrderByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SessionOrderByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SessionOrderByEnum sessionOrderBy = null;

  private static class SessionOrderEnumDeserializer extends StdDeserializer<SessionOrderEnum> {
    public SessionOrderEnumDeserializer() {
      super(SessionOrderEnumDeserializer.class);
    }

    @Override
    public SessionOrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SessionOrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Search session order direction; default to desc
   */
 @JsonDeserialize(using = SessionOrderEnumDeserializer.class)
  public enum SessionOrderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("asc"),
    DESC("desc");

    private String value;

    SessionOrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SessionOrderEnum fromString(String key) {
      if (key == null) return null;

      for (SessionOrderEnum value : SessionOrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SessionOrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SessionOrderEnum sessionOrder = null;

  
  /**
   * Filters that target user-level data
   **/
  public AgentStateQueryRequest userFilter(AgentStateUserFilter userFilter) {
    this.userFilter = userFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target user-level data")
  @JsonProperty("userFilter")
  public AgentStateUserFilter getUserFilter() {
    return userFilter;
  }
  public void setUserFilter(AgentStateUserFilter userFilter) {
    this.userFilter = userFilter;
  }


  /**
   * Filters that target session-level data
   **/
  public AgentStateQueryRequest sessionFilter(AgentStateSessionFilter sessionFilter) {
    this.sessionFilter = sessionFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that target session-level data")
  @JsonProperty("sessionFilter")
  public AgentStateSessionFilter getSessionFilter() {
    return sessionFilter;
  }
  public void setSessionFilter(AgentStateSessionFilter sessionFilter) {
    this.sessionFilter = sessionFilter;
  }


  /**
   * Search user order dimension names; default to userName
   **/
  public AgentStateQueryRequest userOrderBy(UserOrderByEnum userOrderBy) {
    this.userOrderBy = userOrderBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search user order dimension names; default to userName")
  @JsonProperty("userOrderBy")
  public UserOrderByEnum getUserOrderBy() {
    return userOrderBy;
  }
  public void setUserOrderBy(UserOrderByEnum userOrderBy) {
    this.userOrderBy = userOrderBy;
  }


  /**
   * Search user order direction; default to asc
   **/
  public AgentStateQueryRequest userOrder(UserOrderEnum userOrder) {
    this.userOrder = userOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search user order direction; default to asc")
  @JsonProperty("userOrder")
  public UserOrderEnum getUserOrder() {
    return userOrder;
  }
  public void setUserOrder(UserOrderEnum userOrder) {
    this.userOrder = userOrder;
  }


  /**
   * Search session order dimension names; default to segmentStart
   **/
  public AgentStateQueryRequest sessionOrderBy(SessionOrderByEnum sessionOrderBy) {
    this.sessionOrderBy = sessionOrderBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search session order dimension names; default to segmentStart")
  @JsonProperty("sessionOrderBy")
  public SessionOrderByEnum getSessionOrderBy() {
    return sessionOrderBy;
  }
  public void setSessionOrderBy(SessionOrderByEnum sessionOrderBy) {
    this.sessionOrderBy = sessionOrderBy;
  }


  /**
   * Search session order direction; default to desc
   **/
  public AgentStateQueryRequest sessionOrder(SessionOrderEnum sessionOrder) {
    this.sessionOrder = sessionOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search session order direction; default to desc")
  @JsonProperty("sessionOrder")
  public SessionOrderEnum getSessionOrder() {
    return sessionOrder;
  }
  public void setSessionOrder(SessionOrderEnum sessionOrder) {
    this.sessionOrder = sessionOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentStateQueryRequest agentStateQueryRequest = (AgentStateQueryRequest) o;

    return Objects.equals(this.userFilter, agentStateQueryRequest.userFilter) &&
            Objects.equals(this.sessionFilter, agentStateQueryRequest.sessionFilter) &&
            Objects.equals(this.userOrderBy, agentStateQueryRequest.userOrderBy) &&
            Objects.equals(this.userOrder, agentStateQueryRequest.userOrder) &&
            Objects.equals(this.sessionOrderBy, agentStateQueryRequest.sessionOrderBy) &&
            Objects.equals(this.sessionOrder, agentStateQueryRequest.sessionOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFilter, sessionFilter, userOrderBy, userOrder, sessionOrderBy, sessionOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentStateQueryRequest {\n");
    
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
    sb.append("    sessionFilter: ").append(toIndentedString(sessionFilter)).append("\n");
    sb.append("    userOrderBy: ").append(toIndentedString(userOrderBy)).append("\n");
    sb.append("    userOrder: ").append(toIndentedString(userOrder)).append("\n");
    sb.append("    sessionOrderBy: ").append(toIndentedString(sessionOrderBy)).append("\n");
    sb.append("    sessionOrder: ").append(toIndentedString(sessionOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

