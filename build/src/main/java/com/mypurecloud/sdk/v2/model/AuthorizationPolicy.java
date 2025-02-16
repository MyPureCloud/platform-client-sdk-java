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
import com.mypurecloud.sdk.v2.model.Subject;
import com.mypurecloud.sdk.v2.model.TypedAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AuthorizationPolicy
 */

public class AuthorizationPolicy  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String targetResource = null;
  private Subject subject = null;

  private static class EffectEnumDeserializer extends StdDeserializer<EffectEnum> {
    public EffectEnumDeserializer() {
      super(EffectEnumDeserializer.class);
    }

    @Override
    public EffectEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EffectEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The effect this policy should have when its conditions are met
   */
 @JsonDeserialize(using = EffectEnumDeserializer.class)
  public enum EffectEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALLOW("ALLOW"),
    DENY("DENY");

    private String value;

    EffectEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EffectEnum fromString(String key) {
      if (key == null) return null;

      for (EffectEnum value : EffectEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EffectEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EffectEnum effect = null;
  private Object condition = null;
  private String description = null;
  private Date dateModified = null;
  private Map<String, TypedAttribute> presetAttributes = null;
  private Boolean active = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public AuthorizationPolicy name(String name) {
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


  @ApiModelProperty(example = "null", value = "The targeted resource to which the policy should apply, in the form of domain:entity:action")
  @JsonProperty("targetResource")
  public String getTargetResource() {
    return targetResource;
  }


  /**
   * The subject to whom the policy will apply, including type and id
   **/
  public AuthorizationPolicy subject(Subject subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The subject to whom the policy will apply, including type and id")
  @JsonProperty("subject")
  public Subject getSubject() {
    return subject;
  }
  public void setSubject(Subject subject) {
    this.subject = subject;
  }


  /**
   * The effect this policy should have when its conditions are met
   **/
  public AuthorizationPolicy effect(EffectEnum effect) {
    this.effect = effect;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The effect this policy should have when its conditions are met")
  @JsonProperty("effect")
  public EffectEnum getEffect() {
    return effect;
  }
  public void setEffect(EffectEnum effect) {
    this.effect = effect;
  }


  /**
   * The condition tree the policy will evaluate
   **/
  public AuthorizationPolicy condition(Object condition) {
    this.condition = condition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The condition tree the policy will evaluate")
  @JsonProperty("condition")
  public Object getCondition() {
    return condition;
  }
  public void setCondition(Object condition) {
    this.condition = condition;
  }


  /**
   **/
  public AuthorizationPolicy description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "Date this policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * Map of names and values of preset attributes to use in policy evaluation
   **/
  public AuthorizationPolicy presetAttributes(Map<String, TypedAttribute> presetAttributes) {
    this.presetAttributes = presetAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of names and values of preset attributes to use in policy evaluation")
  @JsonProperty("presetAttributes")
  public Map<String, TypedAttribute> getPresetAttributes() {
    return presetAttributes;
  }
  public void setPresetAttributes(Map<String, TypedAttribute> presetAttributes) {
    this.presetAttributes = presetAttributes;
  }


  /**
   * Flag for active enforcement. If this value is false or null, the policy will be saved but will not be checked or enforced on users.
   **/
  public AuthorizationPolicy active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag for active enforcement. If this value is false or null, the policy will be saved but will not be checked or enforced on users.")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
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
    AuthorizationPolicy authorizationPolicy = (AuthorizationPolicy) o;

    return Objects.equals(this.id, authorizationPolicy.id) &&
            Objects.equals(this.name, authorizationPolicy.name) &&
            Objects.equals(this.targetResource, authorizationPolicy.targetResource) &&
            Objects.equals(this.subject, authorizationPolicy.subject) &&
            Objects.equals(this.effect, authorizationPolicy.effect) &&
            Objects.equals(this.condition, authorizationPolicy.condition) &&
            Objects.equals(this.description, authorizationPolicy.description) &&
            Objects.equals(this.dateModified, authorizationPolicy.dateModified) &&
            Objects.equals(this.presetAttributes, authorizationPolicy.presetAttributes) &&
            Objects.equals(this.active, authorizationPolicy.active) &&
            Objects.equals(this.selfUri, authorizationPolicy.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, targetResource, subject, effect, condition, description, dateModified, presetAttributes, active, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationPolicy {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetResource: ").append(toIndentedString(targetResource)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    presetAttributes: ").append(toIndentedString(presetAttributes)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

