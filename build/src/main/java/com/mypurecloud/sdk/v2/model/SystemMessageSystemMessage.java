package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SystemMessageSystemMessage
 */

public class SystemMessageSystemMessage  implements Serializable {
  
  private String channelId = null;

  private static class SystemTopicTypeEnumDeserializer extends StdDeserializer<SystemTopicTypeEnum> {
    public SystemTopicTypeEnumDeserializer() {
      super(SystemTopicTypeEnumDeserializer.class);
    }

    @Override
    public SystemTopicTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemTopicTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets systemTopicType
   */
 @JsonDeserialize(using = SystemTopicTypeEnumDeserializer.class)
  public enum SystemTopicTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NO_LONGER_SUBSCRIBED("no_longer_subscribed"),
    SUBSCRIPTION_CHANGED("subscription_changed"),
    TOKEN_REVOKED("token_revoked");

    private String value;

    SystemTopicTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemTopicTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SystemTopicTypeEnum value : SystemTopicTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemTopicTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemTopicTypeEnum systemTopicType = null;
  private String correlationId = null;
  private String organizationId = null;
  private String userId = null;
  private String oauthClientId = null;

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets reason
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ANOTHER_CHANNEL_SUBSCRIBED("another_channel_subscribed"),
    USER_TOKENS_REVOKED("user_tokens_revoked");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;
  private String message = null;
  private Object data = null;

  
  /**
   **/
  public SystemMessageSystemMessage channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("channelId")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  /**
   **/
  public SystemMessageSystemMessage systemTopicType(SystemTopicTypeEnum systemTopicType) {
    this.systemTopicType = systemTopicType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemTopicType")
  public SystemTopicTypeEnum getSystemTopicType() {
    return systemTopicType;
  }
  public void setSystemTopicType(SystemTopicTypeEnum systemTopicType) {
    this.systemTopicType = systemTopicType;
  }

  
  /**
   **/
  public SystemMessageSystemMessage correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  
  /**
   **/
  public SystemMessageSystemMessage organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  
  /**
   **/
  public SystemMessageSystemMessage userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public SystemMessageSystemMessage oauthClientId(String oauthClientId) {
    this.oauthClientId = oauthClientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oauthClientId")
  public String getOauthClientId() {
    return oauthClientId;
  }
  public void setOauthClientId(String oauthClientId) {
    this.oauthClientId = oauthClientId;
  }

  
  /**
   **/
  public SystemMessageSystemMessage reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  
  /**
   **/
  public SystemMessageSystemMessage message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public SystemMessageSystemMessage data(Object data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemMessageSystemMessage systemMessageSystemMessage = (SystemMessageSystemMessage) o;
    return Objects.equals(this.channelId, systemMessageSystemMessage.channelId) &&
        Objects.equals(this.systemTopicType, systemMessageSystemMessage.systemTopicType) &&
        Objects.equals(this.correlationId, systemMessageSystemMessage.correlationId) &&
        Objects.equals(this.organizationId, systemMessageSystemMessage.organizationId) &&
        Objects.equals(this.userId, systemMessageSystemMessage.userId) &&
        Objects.equals(this.oauthClientId, systemMessageSystemMessage.oauthClientId) &&
        Objects.equals(this.reason, systemMessageSystemMessage.reason) &&
        Objects.equals(this.message, systemMessageSystemMessage.message) &&
        Objects.equals(this.data, systemMessageSystemMessage.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, systemTopicType, correlationId, organizationId, userId, oauthClientId, reason, message, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemMessageSystemMessage {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    systemTopicType: ").append(toIndentedString(systemTopicType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

