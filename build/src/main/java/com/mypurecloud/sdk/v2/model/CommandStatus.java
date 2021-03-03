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
import com.mypurecloud.sdk.v2.model.Document;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CommandStatus
 */

public class CommandStatus  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date expiration = null;
  private String userId = null;

  private static class StatusCodeEnumDeserializer extends StdDeserializer<StatusCodeEnum> {
    public StatusCodeEnumDeserializer() {
      super(StatusCodeEnumDeserializer.class);
    }

    @Override
    public StatusCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets statusCode
   */
 @JsonDeserialize(using = StatusCodeEnumDeserializer.class)
  public enum StatusCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPROGRESS("INPROGRESS"),
    COMPLETE("COMPLETE"),
    ERROR("ERROR"),
    CANCELING("CANCELING"),
    CANCELED("CANCELED");

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusCodeEnum fromString(String key) {
      if (key == null) return null;

      for (StatusCodeEnum value : StatusCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusCodeEnum statusCode = null;

  private static class CommandTypeEnumDeserializer extends StdDeserializer<CommandTypeEnum> {
    public CommandTypeEnumDeserializer() {
      super(CommandTypeEnumDeserializer.class);
    }

    @Override
    public CommandTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CommandTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets commandType
   */
 @JsonDeserialize(using = CommandTypeEnumDeserializer.class)
  public enum CommandTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPLOAD("UPLOAD"),
    COPYDOCUMENT("COPYDOCUMENT"),
    MOVEDOCUMENT("MOVEDOCUMENT"),
    DELETEWORKSPACE("DELETEWORKSPACE"),
    DELETEDOCUMENT("DELETEDOCUMENT"),
    DELETETAG("DELETETAG"),
    UPDATETAG("UPDATETAG"),
    REINDEX("REINDEX"),
    CLEANUP("CLEANUP"),
    REPLACEDOCUMENT("REPLACEDOCUMENT");

    private String value;

    CommandTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CommandTypeEnum fromString(String key) {
      if (key == null) return null;

      for (CommandTypeEnum value : CommandTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CommandTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CommandTypeEnum commandType = null;
  private Document document = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public CommandStatus name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CommandStatus expiration(Date expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   **/
  public CommandStatus userId(String userId) {
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
  public CommandStatus statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  
  /**
   **/
  public CommandStatus commandType(CommandTypeEnum commandType) {
    this.commandType = commandType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("commandType")
  public CommandTypeEnum getCommandType() {
    return commandType;
  }
  public void setCommandType(CommandTypeEnum commandType) {
    this.commandType = commandType;
  }

  
  /**
   **/
  public CommandStatus document(Document document) {
    this.document = document;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("document")
  public Document getDocument() {
    return document;
  }
  public void setDocument(Document document) {
    this.document = document;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandStatus commandStatus = (CommandStatus) o;
    return Objects.equals(this.id, commandStatus.id) &&
        Objects.equals(this.name, commandStatus.name) &&
        Objects.equals(this.expiration, commandStatus.expiration) &&
        Objects.equals(this.userId, commandStatus.userId) &&
        Objects.equals(this.statusCode, commandStatus.statusCode) &&
        Objects.equals(this.commandType, commandStatus.commandType) &&
        Objects.equals(this.document, commandStatus.document) &&
        Objects.equals(this.selfUri, commandStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, expiration, userId, statusCode, commandType, document, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

