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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CobrowseWebMessagingSession
 */

public class CobrowseWebMessagingSession  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String joinCode = null;
  private String websocketUrl = null;
  private Date dateOfferEnds = null;

  private static class CommunicationTypeEnumDeserializer extends StdDeserializer<CommunicationTypeEnum> {
    public CommunicationTypeEnumDeserializer() {
      super(CommunicationTypeEnumDeserializer.class);
    }

    @Override
    public CommunicationTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CommunicationTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * CommunicationType for Cobrowse Session
   */
 @JsonDeserialize(using = CommunicationTypeEnumDeserializer.class)
  public enum CommunicationTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("Call"),
    MESSAGE("Message");

    private String value;

    CommunicationTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CommunicationTypeEnum fromString(String key) {
      if (key == null) return null;

      for (CommunicationTypeEnum value : CommunicationTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CommunicationTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CommunicationTypeEnum communicationType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public CobrowseWebMessagingSession name(String name) {
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


  @ApiModelProperty(example = "null", value = "Cobrowse session join code")
  @JsonProperty("joinCode")
  public String getJoinCode() {
    return joinCode;
  }


  @ApiModelProperty(example = "null", value = "WebSocket URL for the JS client")
  @JsonProperty("websocketUrl")
  public String getWebsocketUrl() {
    return websocketUrl;
  }


  @ApiModelProperty(example = "null", value = "Date when Cobrowse Offer Expires. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateOfferEnds")
  public Date getDateOfferEnds() {
    return dateOfferEnds;
  }


  @ApiModelProperty(example = "null", value = "CommunicationType for Cobrowse Session")
  @JsonProperty("communicationType")
  public CommunicationTypeEnum getCommunicationType() {
    return communicationType;
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
    CobrowseWebMessagingSession cobrowseWebMessagingSession = (CobrowseWebMessagingSession) o;

    return Objects.equals(this.id, cobrowseWebMessagingSession.id) &&
            Objects.equals(this.name, cobrowseWebMessagingSession.name) &&
            Objects.equals(this.joinCode, cobrowseWebMessagingSession.joinCode) &&
            Objects.equals(this.websocketUrl, cobrowseWebMessagingSession.websocketUrl) &&
            Objects.equals(this.dateOfferEnds, cobrowseWebMessagingSession.dateOfferEnds) &&
            Objects.equals(this.communicationType, cobrowseWebMessagingSession.communicationType) &&
            Objects.equals(this.selfUri, cobrowseWebMessagingSession.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, joinCode, websocketUrl, dateOfferEnds, communicationType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobrowseWebMessagingSession {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    joinCode: ").append(toIndentedString(joinCode)).append("\n");
    sb.append("    websocketUrl: ").append(toIndentedString(websocketUrl)).append("\n");
    sb.append("    dateOfferEnds: ").append(toIndentedString(dateOfferEnds)).append("\n");
    sb.append("    communicationType: ").append(toIndentedString(communicationType)).append("\n");
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

