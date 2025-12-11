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
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentAction
 */

public class AgentAction  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class AgentActionEnumDeserializer extends StdDeserializer<AgentActionEnum> {
    public AgentActionEnumDeserializer() {
      super(AgentActionEnumDeserializer.class);
    }

    @Override
    public AgentActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AgentActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The agent action taken on a checklist item.
   */
 @JsonDeserialize(using = AgentActionEnumDeserializer.class)
  public enum AgentActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TICKED("Ticked"),
    UNTICKED("Unticked");

    private String value;

    AgentActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AgentActionEnum fromString(String key) {
      if (key == null) return null;

      for (AgentActionEnum value : AgentActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AgentActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AgentActionEnum agentAction = null;
  private String selfUri = null;

  public AgentAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of the checklist item.
   **/
  public AgentAction id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the checklist item.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of the checklist item.
   **/
  public AgentAction name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the checklist item.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The agent action taken on a checklist item.
   **/
  public AgentAction agentAction(AgentActionEnum agentAction) {
    this.agentAction = agentAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The agent action taken on a checklist item.")
  @JsonProperty("agentAction")
  public AgentActionEnum getAgentAction() {
    return agentAction;
  }
  public void setAgentAction(AgentActionEnum agentAction) {
    this.agentAction = agentAction;
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
    AgentAction agentAction = (AgentAction) o;

    return Objects.equals(this.id, agentAction.id) &&
            Objects.equals(this.name, agentAction.name) &&
            Objects.equals(this.agentAction, agentAction.agentAction) &&
            Objects.equals(this.selfUri, agentAction.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, agentAction, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agentAction: ").append(toIndentedString(agentAction)).append("\n");
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

