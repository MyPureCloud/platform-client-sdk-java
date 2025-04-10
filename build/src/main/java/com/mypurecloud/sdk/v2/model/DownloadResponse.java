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
import com.mypurecloud.sdk.v2.model.DocumentThumbnail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DownloadResponse
 */

public class DownloadResponse  implements Serializable {
  
  private String id = null;
  private String contentLocationUri = null;
  private String imageUri = null;
  private List<DocumentThumbnail> thumbnails = null;

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
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RUNNING("Running"),
    COMPLETED("Completed");

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
  private String resultUri = null;
  private String selfUri = null;

  public DownloadResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      thumbnails = new ArrayList<DocumentThumbnail>();
    }
  }

  
  /**
   **/
  public DownloadResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public DownloadResponse contentLocationUri(String contentLocationUri) {
    this.contentLocationUri = contentLocationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contentLocationUri")
  public String getContentLocationUri() {
    return contentLocationUri;
  }
  public void setContentLocationUri(String contentLocationUri) {
    this.contentLocationUri = contentLocationUri;
  }


  /**
   **/
  public DownloadResponse imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("imageUri")
  public String getImageUri() {
    return imageUri;
  }
  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }


  /**
   **/
  public DownloadResponse thumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thumbnails")
  public List<DocumentThumbnail> getThumbnails() {
    return thumbnails;
  }
  public void setThumbnails(List<DocumentThumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }


  /**
   **/
  public DownloadResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public DownloadResponse resultUri(String resultUri) {
    this.resultUri = resultUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resultUri")
  public String getResultUri() {
    return resultUri;
  }
  public void setResultUri(String resultUri) {
    this.resultUri = resultUri;
  }


  /**
   **/
  public DownloadResponse selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadResponse downloadResponse = (DownloadResponse) o;

    return Objects.equals(this.id, downloadResponse.id) &&
            Objects.equals(this.contentLocationUri, downloadResponse.contentLocationUri) &&
            Objects.equals(this.imageUri, downloadResponse.imageUri) &&
            Objects.equals(this.thumbnails, downloadResponse.thumbnails) &&
            Objects.equals(this.state, downloadResponse.state) &&
            Objects.equals(this.resultUri, downloadResponse.resultUri) &&
            Objects.equals(this.selfUri, downloadResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contentLocationUri, imageUri, thumbnails, state, resultUri, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contentLocationUri: ").append(toIndentedString(contentLocationUri)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    resultUri: ").append(toIndentedString(resultUri)).append("\n");
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

