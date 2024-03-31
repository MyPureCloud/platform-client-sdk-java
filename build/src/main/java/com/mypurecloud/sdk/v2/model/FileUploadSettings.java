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
import com.mypurecloud.sdk.v2.model.FileUploadMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * File upload settings for messenger
 */
@ApiModel(description = "File upload settings for messenger")

public class FileUploadSettings  implements Serializable {
  
  private Boolean enableAttachments = null;
  private List<FileUploadMode> modes = new ArrayList<FileUploadMode>();

  
  /**
   * whether or not attachments is enabled
   **/
  public FileUploadSettings enableAttachments(Boolean enableAttachments) {
    this.enableAttachments = enableAttachments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not attachments is enabled")
  @JsonProperty("enableAttachments")
  public Boolean getEnableAttachments() {
    return enableAttachments;
  }
  public void setEnableAttachments(Boolean enableAttachments) {
    this.enableAttachments = enableAttachments;
  }


  /**
   * The list of supported file upload modes
   **/
  public FileUploadSettings modes(List<FileUploadMode> modes) {
    this.modes = modes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported file upload modes")
  @JsonProperty("modes")
  public List<FileUploadMode> getModes() {
    return modes;
  }
  public void setModes(List<FileUploadMode> modes) {
    this.modes = modes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileUploadSettings fileUploadSettings = (FileUploadSettings) o;

    return Objects.equals(this.enableAttachments, fileUploadSettings.enableAttachments) &&
            Objects.equals(this.modes, fileUploadSettings.modes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableAttachments, modes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileUploadSettings {\n");
    
    sb.append("    enableAttachments: ").append(toIndentedString(enableAttachments)).append("\n");
    sb.append("    modes: ").append(toIndentedString(modes)).append("\n");
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

