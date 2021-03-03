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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ReplaceResponse
 */

public class ReplaceResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer changeNumber = null;
  private DomainEntityRef uploadStatus = null;
  private String uploadDestinationUri = null;

  private static class UploadMethodEnumDeserializer extends StdDeserializer<UploadMethodEnum> {
    public UploadMethodEnumDeserializer() {
      super(UploadMethodEnumDeserializer.class);
    }

    @Override
    public UploadMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UploadMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets uploadMethod
   */
 @JsonDeserialize(using = UploadMethodEnumDeserializer.class)
  public enum UploadMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SINGLE_PUT("SINGLE_PUT"),
    MULTIPART_POST("MULTIPART_POST");

    private String value;

    UploadMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadMethodEnum fromString(String key) {
      if (key == null) return null;

      for (UploadMethodEnum value : UploadMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadMethodEnum uploadMethod = null;

  
  /**
   **/
  public ReplaceResponse id(String id) {
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
  public ReplaceResponse name(String name) {
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
   **/
  public ReplaceResponse changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  
  /**
   **/
  public ReplaceResponse uploadStatus(DomainEntityRef uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadStatus")
  public DomainEntityRef getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(DomainEntityRef uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  
  /**
   **/
  public ReplaceResponse uploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadDestinationUri")
  public String getUploadDestinationUri() {
    return uploadDestinationUri;
  }
  public void setUploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
  }

  
  /**
   **/
  public ReplaceResponse uploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadMethod")
  public UploadMethodEnum getUploadMethod() {
    return uploadMethod;
  }
  public void setUploadMethod(UploadMethodEnum uploadMethod) {
    this.uploadMethod = uploadMethod;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceResponse replaceResponse = (ReplaceResponse) o;
    return Objects.equals(this.id, replaceResponse.id) &&
        Objects.equals(this.name, replaceResponse.name) &&
        Objects.equals(this.changeNumber, replaceResponse.changeNumber) &&
        Objects.equals(this.uploadStatus, replaceResponse.uploadStatus) &&
        Objects.equals(this.uploadDestinationUri, replaceResponse.uploadDestinationUri) &&
        Objects.equals(this.uploadMethod, replaceResponse.uploadMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, changeNumber, uploadStatus, uploadDestinationUri, uploadMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
    sb.append("    uploadDestinationUri: ").append(toIndentedString(uploadDestinationUri)).append("\n");
    sb.append("    uploadMethod: ").append(toIndentedString(uploadMethod)).append("\n");
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

