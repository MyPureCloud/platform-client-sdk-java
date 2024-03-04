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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.FlowLogLevel;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * This is a table of settings per a loglevel that define what will be logged in executionData when enabled (true)
 */
@ApiModel(description = "This is a table of settings per a loglevel that define what will be logged in executionData when enabled (true)")

public class FlowSettingsResponse  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Flow Type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("bot"),
    COMMONMODULE("commonmodule"),
    DIGITALBOT("digitalbot"),
    INBOUNDCALL("inboundcall"),
    INBOUNDCHAT("inboundchat"),
    INBOUNDEMAIL("inboundemail"),
    INBOUNDSHORTMESSAGE("inboundshortmessage"),
    INQUEUECALL("inqueuecall"),
    INQUEUESHORTMESSAGE("inqueueshortmessage"),
    INQUEUEEMAIL("inqueueemail"),
    OUTBOUNDCALL("outboundcall"),
    SECURECALL("securecall"),
    SURVEYINVITE("surveyinvite"),
    VOICE("voice"),
    VOICEMAIL("voicemail"),
    VOICESURVEY("voicesurvey"),
    WORKFLOW("workflow"),
    WORKITEM("workitem");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private UserReference modifiedBy = null;
  private DomainEntityRef modifiedByClient = null;
  private Date dateModified = null;
  private FlowLogLevel logLevelCharacteristics = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public FlowSettingsResponse name(String name) {
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
   * The Flow Type
   **/
  public FlowSettingsResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Flow Type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * User that last changed the log level setting.
   **/
  public FlowSettingsResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that last changed the log level setting.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * OAuth client that last changed the log level setting.
   **/
  public FlowSettingsResponse modifiedByClient(DomainEntityRef modifiedByClient) {
    this.modifiedByClient = modifiedByClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OAuth client that last changed the log level setting.")
  @JsonProperty("modifiedByClient")
  public DomainEntityRef getModifiedByClient() {
    return modifiedByClient;
  }
  public void setModifiedByClient(DomainEntityRef modifiedByClient) {
    this.modifiedByClient = modifiedByClient;
  }


  /**
   * The time this log level was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public FlowSettingsResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time this log level was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The log level set for this flow
   **/
  public FlowSettingsResponse logLevelCharacteristics(FlowLogLevel logLevelCharacteristics) {
    this.logLevelCharacteristics = logLevelCharacteristics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The log level set for this flow")
  @JsonProperty("logLevelCharacteristics")
  public FlowLogLevel getLogLevelCharacteristics() {
    return logLevelCharacteristics;
  }
  public void setLogLevelCharacteristics(FlowLogLevel logLevelCharacteristics) {
    this.logLevelCharacteristics = logLevelCharacteristics;
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
    FlowSettingsResponse flowSettingsResponse = (FlowSettingsResponse) o;

    return Objects.equals(this.id, flowSettingsResponse.id) &&
            Objects.equals(this.name, flowSettingsResponse.name) &&
            Objects.equals(this.type, flowSettingsResponse.type) &&
            Objects.equals(this.modifiedBy, flowSettingsResponse.modifiedBy) &&
            Objects.equals(this.modifiedByClient, flowSettingsResponse.modifiedByClient) &&
            Objects.equals(this.dateModified, flowSettingsResponse.dateModified) &&
            Objects.equals(this.logLevelCharacteristics, flowSettingsResponse.logLevelCharacteristics) &&
            Objects.equals(this.selfUri, flowSettingsResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, modifiedBy, modifiedByClient, dateModified, logLevelCharacteristics, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowSettingsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedByClient: ").append(toIndentedString(modifiedByClient)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    logLevelCharacteristics: ").append(toIndentedString(logLevelCharacteristics)).append("\n");
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

