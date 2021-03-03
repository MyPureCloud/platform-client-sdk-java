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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Object representing the guest model of a media request of a chat conversation.
 */
@ApiModel(description = "Object representing the guest model of a media request of a chat conversation.")

public class WebChatGuestMediaRequest  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class TypesEnumDeserializer extends StdDeserializer<TypesEnum> {
    public TypesEnumDeserializer() {
      super(TypesEnumDeserializer.class);
    }

    @Override
    public TypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets types
   */
 @JsonDeserialize(using = TypesEnumDeserializer.class)
  public enum TypesEnum {
    COBROWSE("COBROWSE"),
    SCREENSHARE("SCREENSHARE");

    private String value;

    TypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypesEnum fromString(String key) {
      if (key == null) return null;

      for (TypesEnum value : TypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<TypesEnum> types = new ArrayList<TypesEnum>();

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The state of the media request, one of PENDING|ACCEPTED|DECLINED|TIMEDOUT|CANCELLED|ERRORED.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    ACCEPTED("ACCEPTED"),
    DECLINED("DECLINED"),
    TIMEDOUT("TIMEDOUT"),
    CANCELLED("CANCELLED"),
    ERRORED("ERRORED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String communicationId = null;
  private String securityKey = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WebChatGuestMediaRequest name(String name) {
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
   * The types of media being requested.
   **/
  public WebChatGuestMediaRequest types(List<TypesEnum> types) {
    this.types = types;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The types of media being requested.")
  @JsonProperty("types")
  public List<TypesEnum> getTypes() {
    return types;
  }
  public void setTypes(List<TypesEnum> types) {
    this.types = types;
  }

  
  /**
   * The state of the media request, one of PENDING|ACCEPTED|DECLINED|TIMEDOUT|CANCELLED|ERRORED.
   **/
  public WebChatGuestMediaRequest state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The state of the media request, one of PENDING|ACCEPTED|DECLINED|TIMEDOUT|CANCELLED|ERRORED.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The ID of the new media communication, if applicable.
   **/
  public WebChatGuestMediaRequest communicationId(String communicationId) {
    this.communicationId = communicationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the new media communication, if applicable.")
  @JsonProperty("communicationId")
  public String getCommunicationId() {
    return communicationId;
  }
  public void setCommunicationId(String communicationId) {
    this.communicationId = communicationId;
  }

  
  /**
   * The security information related to a media request.
   **/
  public WebChatGuestMediaRequest securityKey(String securityKey) {
    this.securityKey = securityKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The security information related to a media request.")
  @JsonProperty("securityKey")
  public String getSecurityKey() {
    return securityKey;
  }
  public void setSecurityKey(String securityKey) {
    this.securityKey = securityKey;
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
    WebChatGuestMediaRequest webChatGuestMediaRequest = (WebChatGuestMediaRequest) o;
    return Objects.equals(this.id, webChatGuestMediaRequest.id) &&
        Objects.equals(this.name, webChatGuestMediaRequest.name) &&
        Objects.equals(this.types, webChatGuestMediaRequest.types) &&
        Objects.equals(this.state, webChatGuestMediaRequest.state) &&
        Objects.equals(this.communicationId, webChatGuestMediaRequest.communicationId) &&
        Objects.equals(this.securityKey, webChatGuestMediaRequest.securityKey) &&
        Objects.equals(this.selfUri, webChatGuestMediaRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, types, state, communicationId, securityKey, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatGuestMediaRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    communicationId: ").append(toIndentedString(communicationId)).append("\n");
    sb.append("    securityKey: ").append(toIndentedString(securityKey)).append("\n");
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

