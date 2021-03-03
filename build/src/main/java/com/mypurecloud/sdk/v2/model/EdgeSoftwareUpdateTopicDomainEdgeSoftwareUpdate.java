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
import java.util.Date;

import java.io.Serializable;
/**
 * EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate
 */

public class EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate  implements Serializable {
  
  private String id = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("NONE"),
    INIT("INIT"),
    IN_PROGRESS("IN_PROGRESS"),
    EXPIRED("EXPIRED"),
    EXCEPTION("EXCEPTION"),
    ABORTED("ABORTED"),
    FAILED("FAILED"),
    SUCCEEDED("SUCCEEDED"),
    DELETE("DELETE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private Date downloadStartTime = null;
  private Date executeStartTime = null;
  private Date executeStopTime = null;

  
  /**
   **/
  public EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate id(String id) {
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
  public EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate downloadStartTime(Date downloadStartTime) {
    this.downloadStartTime = downloadStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadStartTime")
  public Date getDownloadStartTime() {
    return downloadStartTime;
  }
  public void setDownloadStartTime(Date downloadStartTime) {
    this.downloadStartTime = downloadStartTime;
  }

  
  /**
   **/
  public EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate executeStartTime(Date executeStartTime) {
    this.executeStartTime = executeStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("executeStartTime")
  public Date getExecuteStartTime() {
    return executeStartTime;
  }
  public void setExecuteStartTime(Date executeStartTime) {
    this.executeStartTime = executeStartTime;
  }

  
  /**
   **/
  public EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate executeStopTime(Date executeStopTime) {
    this.executeStopTime = executeStopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("executeStopTime")
  public Date getExecuteStopTime() {
    return executeStopTime;
  }
  public void setExecuteStopTime(Date executeStopTime) {
    this.executeStopTime = executeStopTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate edgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate = (EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate) o;
    return Objects.equals(this.id, edgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate.id) &&
        Objects.equals(this.status, edgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate.status) &&
        Objects.equals(this.downloadStartTime, edgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate.downloadStartTime) &&
        Objects.equals(this.executeStartTime, edgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate.executeStartTime) &&
        Objects.equals(this.executeStopTime, edgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate.executeStopTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, downloadStartTime, executeStartTime, executeStopTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeSoftwareUpdateTopicDomainEdgeSoftwareUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadStartTime: ").append(toIndentedString(downloadStartTime)).append("\n");
    sb.append("    executeStartTime: ").append(toIndentedString(executeStartTime)).append("\n");
    sb.append("    executeStopTime: ").append(toIndentedString(executeStopTime)).append("\n");
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

