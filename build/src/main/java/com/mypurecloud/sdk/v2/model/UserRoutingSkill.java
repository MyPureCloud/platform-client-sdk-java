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
 * Represents an organization skill assigned to a user. When assigning to a user specify the organization skill id as the id.
 */
@ApiModel(description = "Represents an organization skill assigned to a user. When assigning to a user specify the organization skill id as the id.")

public class UserRoutingSkill  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Double proficiency = null;

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
   * Activate or deactivate this routing skill.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELETED("deleted");

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
  private String skillUri = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserRoutingSkill name(String name) {
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
   * A rating from 0.0 to 5.0 that indicates how adept an agent is at a particular skill. When \"Best available skills\" is enabled for a queue in Genesys Cloud, ACD interactions in that queue are routed to agents with higher proficiency ratings.
   **/
  public UserRoutingSkill proficiency(Double proficiency) {
    this.proficiency = proficiency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A rating from 0.0 to 5.0 that indicates how adept an agent is at a particular skill. When \"Best available skills\" is enabled for a queue in Genesys Cloud, ACD interactions in that queue are routed to agents with higher proficiency ratings.")
  @JsonProperty("proficiency")
  public Double getProficiency() {
    return proficiency;
  }
  public void setProficiency(Double proficiency) {
    this.proficiency = proficiency;
  }

  
  /**
   * Activate or deactivate this routing skill.
   **/
  public UserRoutingSkill state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activate or deactivate this routing skill.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  @ApiModelProperty(example = "null", value = "URI to the organization skill used by this user skill.")
  @JsonProperty("skillUri")
  public String getSkillUri() {
    return skillUri;
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
    UserRoutingSkill userRoutingSkill = (UserRoutingSkill) o;
    return Objects.equals(this.id, userRoutingSkill.id) &&
        Objects.equals(this.name, userRoutingSkill.name) &&
        Objects.equals(this.proficiency, userRoutingSkill.proficiency) &&
        Objects.equals(this.state, userRoutingSkill.state) &&
        Objects.equals(this.skillUri, userRoutingSkill.skillUri) &&
        Objects.equals(this.selfUri, userRoutingSkill.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, proficiency, state, skillUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoutingSkill {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    skillUri: ").append(toIndentedString(skillUri)).append("\n");
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

