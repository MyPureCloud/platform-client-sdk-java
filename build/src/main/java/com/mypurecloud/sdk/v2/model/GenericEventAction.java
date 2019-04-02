package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * GenericEventAction
 */

public class GenericEventAction  implements Serializable {
  
  private String id = null;

  /**
   * Current state of the action (e.g. qualified, succeeded, errored).
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACCEPTED("accepted"),
    REJECTED("rejected"),
    TIMEDOUT("timedout"),
    ERRORED("errored"),
    MISSED("missed"),
    IGNORED("ignored"),
    QUALIFIED("qualified"),
    OFFERED("offered");

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

  /**
   * The media type used to deliver the action (e.g. email, webhook).
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
  private String prompt = null;
  private String mediaAddress = null;
  private Date createdDate = null;

  
  /**
   * ID of the action.
   **/
  public GenericEventAction id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the action.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Current state of the action (e.g. qualified, succeeded, errored).
   **/
  public GenericEventAction state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current state of the action (e.g. qualified, succeeded, errored).")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   * The media type used to deliver the action (e.g. email, webhook).
   **/
  public GenericEventAction mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media type used to deliver the action (e.g. email, webhook).")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * Prompt of the action to be displayed/sent to the visitor.
   **/
  public GenericEventAction prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prompt of the action to be displayed/sent to the visitor.")
  @JsonProperty("prompt")
  public String getPrompt() {
    return prompt;
  }
  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  
  /**
   * Address of the media type used to deliver the action (e.g. email address, webhook URL).
   **/
  public GenericEventAction mediaAddress(String mediaAddress) {
    this.mediaAddress = mediaAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Address of the media type used to deliver the action (e.g. email address, webhook URL).")
  @JsonProperty("mediaAddress")
  public String getMediaAddress() {
    return mediaAddress;
  }
  public void setMediaAddress(String mediaAddress) {
    this.mediaAddress = mediaAddress;
  }

  
  /**
   * Timestamp indicating when the action was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public GenericEventAction createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the action was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericEventAction genericEventAction = (GenericEventAction) o;
    return Objects.equals(this.id, genericEventAction.id) &&
        Objects.equals(this.state, genericEventAction.state) &&
        Objects.equals(this.mediaType, genericEventAction.mediaType) &&
        Objects.equals(this.prompt, genericEventAction.prompt) &&
        Objects.equals(this.mediaAddress, genericEventAction.mediaAddress) &&
        Objects.equals(this.createdDate, genericEventAction.createdDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, mediaType, prompt, mediaAddress, createdDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericEventAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    mediaAddress: ").append(toIndentedString(mediaAddress)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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

