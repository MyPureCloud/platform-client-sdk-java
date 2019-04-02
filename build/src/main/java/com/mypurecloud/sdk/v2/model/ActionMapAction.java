package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ActionProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActionMapAction
 */

public class ActionMapAction  implements Serializable {
  

  /**
   * Media type of action.
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WEBCHAT("webchat");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private String actionTargetId = null;
  private Boolean isPacingEnabled = null;
  private ActionProperties props = null;

  
  /**
   * Media type of action.
   **/
  public ActionMapAction mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Media type of action.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * Action target ID.
   **/
  public ActionMapAction actionTargetId(String actionTargetId) {
    this.actionTargetId = actionTargetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action target ID.")
  @JsonProperty("actionTargetId")
  public String getActionTargetId() {
    return actionTargetId;
  }
  public void setActionTargetId(String actionTargetId) {
    this.actionTargetId = actionTargetId;
  }

  
  /**
   * Whether this action should be throttled.
   **/
  public ActionMapAction isPacingEnabled(Boolean isPacingEnabled) {
    this.isPacingEnabled = isPacingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this action should be throttled.")
  @JsonProperty("isPacingEnabled")
  public Boolean getIsPacingEnabled() {
    return isPacingEnabled;
  }
  public void setIsPacingEnabled(Boolean isPacingEnabled) {
    this.isPacingEnabled = isPacingEnabled;
  }

  
  /**
   * Additional properties.
   **/
  public ActionMapAction props(ActionProperties props) {
    this.props = props;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional properties.")
  @JsonProperty("props")
  public ActionProperties getProps() {
    return props;
  }
  public void setProps(ActionProperties props) {
    this.props = props;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMapAction actionMapAction = (ActionMapAction) o;
    return Objects.equals(this.mediaType, actionMapAction.mediaType) &&
        Objects.equals(this.actionTargetId, actionMapAction.actionTargetId) &&
        Objects.equals(this.isPacingEnabled, actionMapAction.isPacingEnabled) &&
        Objects.equals(this.props, actionMapAction.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, actionTargetId, isPacingEnabled, props);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMapAction {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    actionTargetId: ").append(toIndentedString(actionTargetId)).append("\n");
    sb.append("    isPacingEnabled: ").append(toIndentedString(isPacingEnabled)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

