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
 * WebChatRoutingTarget
 */

public class WebChatRoutingTarget  implements Serializable {
  

  private static class TargetTypeEnumDeserializer extends StdDeserializer<TargetTypeEnum> {
    public TargetTypeEnumDeserializer() {
      super(TargetTypeEnumDeserializer.class);
    }

    @Override
    public TargetTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TargetTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The target type of the routing target, such as 'QUEUE'.
   */
 @JsonDeserialize(using = TargetTypeEnumDeserializer.class)
  public enum TargetTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUE("QUEUE");

    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TargetTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TargetTypeEnum value : TargetTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TargetTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TargetTypeEnum targetType = null;
  private String targetAddress = null;
  private List<String> skills = new ArrayList<String>();
  private String language = null;
  private Long priority = null;

  
  /**
   * The target type of the routing target, such as 'QUEUE'.
   **/
  public WebChatRoutingTarget targetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The target type of the routing target, such as 'QUEUE'.")
  @JsonProperty("targetType")
  public TargetTypeEnum getTargetType() {
    return targetType;
  }
  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  
  /**
   * The target of the route, in the format appropriate given the 'targetType'.
   **/
  public WebChatRoutingTarget targetAddress(String targetAddress) {
    this.targetAddress = targetAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The target of the route, in the format appropriate given the 'targetType'.")
  @JsonProperty("targetAddress")
  public String getTargetAddress() {
    return targetAddress;
  }
  public void setTargetAddress(String targetAddress) {
    this.targetAddress = targetAddress;
  }

  
  /**
   * The list of skill names to use for routing.
   **/
  public WebChatRoutingTarget skills(List<String> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of skill names to use for routing.")
  @JsonProperty("skills")
  public List<String> getSkills() {
    return skills;
  }
  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  
  /**
   * The language name to use for routing.
   **/
  public WebChatRoutingTarget language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language name to use for routing.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   * The priority to assign to the conversation for routing.
   **/
  public WebChatRoutingTarget priority(Long priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority to assign to the conversation for routing.")
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }
  public void setPriority(Long priority) {
    this.priority = priority;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebChatRoutingTarget webChatRoutingTarget = (WebChatRoutingTarget) o;
    return Objects.equals(this.targetType, webChatRoutingTarget.targetType) &&
        Objects.equals(this.targetAddress, webChatRoutingTarget.targetAddress) &&
        Objects.equals(this.skills, webChatRoutingTarget.skills) &&
        Objects.equals(this.language, webChatRoutingTarget.language) &&
        Objects.equals(this.priority, webChatRoutingTarget.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetType, targetAddress, skills, language, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebChatRoutingTarget {\n");
    
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    targetAddress: ").append(toIndentedString(targetAddress)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

