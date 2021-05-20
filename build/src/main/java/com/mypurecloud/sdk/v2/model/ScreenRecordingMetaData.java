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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ScreenRecordingMetaData
 */

public class ScreenRecordingMetaData  implements Serializable {
  
  private String trackId = null;
  private String mediaId = null;
  private String screenId = null;
  private Integer originX = null;
  private Integer originY = null;
  private Boolean primary = null;
  private Boolean main = null;

  
  /**
   **/
  public ScreenRecordingMetaData trackId(String trackId) {
    this.trackId = trackId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("trackId")
  public String getTrackId() {
    return trackId;
  }
  public void setTrackId(String trackId) {
    this.trackId = trackId;
  }

  
  /**
   **/
  public ScreenRecordingMetaData mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaId")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  
  /**
   **/
  public ScreenRecordingMetaData screenId(String screenId) {
    this.screenId = screenId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenId")
  public String getScreenId() {
    return screenId;
  }
  public void setScreenId(String screenId) {
    this.screenId = screenId;
  }

  
  /**
   **/
  public ScreenRecordingMetaData originX(Integer originX) {
    this.originX = originX;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originX")
  public Integer getOriginX() {
    return originX;
  }
  public void setOriginX(Integer originX) {
    this.originX = originX;
  }

  
  /**
   **/
  public ScreenRecordingMetaData originY(Integer originY) {
    this.originY = originY;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("originY")
  public Integer getOriginY() {
    return originY;
  }
  public void setOriginY(Integer originY) {
    this.originY = originY;
  }

  
  /**
   **/
  public ScreenRecordingMetaData primary(Boolean primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  
  /**
   **/
  public ScreenRecordingMetaData main(Boolean main) {
    this.main = main;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("main")
  public Boolean getMain() {
    return main;
  }
  public void setMain(Boolean main) {
    this.main = main;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingMetaData screenRecordingMetaData = (ScreenRecordingMetaData) o;
    return Objects.equals(this.trackId, screenRecordingMetaData.trackId) &&
        Objects.equals(this.mediaId, screenRecordingMetaData.mediaId) &&
        Objects.equals(this.screenId, screenRecordingMetaData.screenId) &&
        Objects.equals(this.originX, screenRecordingMetaData.originX) &&
        Objects.equals(this.originY, screenRecordingMetaData.originY) &&
        Objects.equals(this.primary, screenRecordingMetaData.primary) &&
        Objects.equals(this.main, screenRecordingMetaData.main);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackId, mediaId, screenId, originX, originY, primary, main);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingMetaData {\n");
    
    sb.append("    trackId: ").append(toIndentedString(trackId)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    screenId: ").append(toIndentedString(screenId)).append("\n");
    sb.append("    originX: ").append(toIndentedString(originX)).append("\n");
    sb.append("    originY: ").append(toIndentedString(originY)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
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

