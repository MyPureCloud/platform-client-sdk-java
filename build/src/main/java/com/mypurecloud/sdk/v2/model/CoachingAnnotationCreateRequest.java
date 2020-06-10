package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CoachingAnnotationCreateRequest
 */

public class CoachingAnnotationCreateRequest  implements Serializable {
  
  private String text = null;

  /**
   * Determines the permissions required to view this item.
   */
  public enum AccessTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLIC("Public"),
    PRIVATE("Private");

    private String value;

    AccessTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AccessTypeEnum fromString(String key) {
      if (key == null) return null;

      for (AccessTypeEnum value : AccessTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AccessTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AccessTypeEnum accessType = null;

  
  /**
   * The text of the annotation.
   **/
  public CoachingAnnotationCreateRequest text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text of the annotation.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Determines the permissions required to view this item.
   **/
  public CoachingAnnotationCreateRequest accessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines the permissions required to view this item.")
  @JsonProperty("accessType")
  public AccessTypeEnum getAccessType() {
    return accessType;
  }
  public void setAccessType(AccessTypeEnum accessType) {
    this.accessType = accessType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoachingAnnotationCreateRequest coachingAnnotationCreateRequest = (CoachingAnnotationCreateRequest) o;
    return Objects.equals(this.text, coachingAnnotationCreateRequest.text) &&
        Objects.equals(this.accessType, coachingAnnotationCreateRequest.accessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, accessType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoachingAnnotationCreateRequest {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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

