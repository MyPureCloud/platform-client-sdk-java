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
import com.mypurecloud.sdk.v2.model.DomainEdgeSoftwareVersionDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DomainEdgeSoftwareUpdateDto
 */

public class DomainEdgeSoftwareUpdateDto  implements Serializable {
  
  private DomainEdgeSoftwareVersionDto version = null;
  private Integer maxDownloadRate = null;
  private Date downloadStartTime = null;
  private Date executeStartTime = null;
  private Date executeStopTime = null;
  private Boolean executeOnIdle = null;

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
  private String edgeUri = null;
  private Long callDrainingWaitTimeSeconds = null;
  private Boolean current = null;

  
  /**
   * Version
   **/
  public DomainEdgeSoftwareUpdateDto version(DomainEdgeSoftwareVersionDto version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version")
  @JsonProperty("version")
  public DomainEdgeSoftwareVersionDto getVersion() {
    return version;
  }
  public void setVersion(DomainEdgeSoftwareVersionDto version) {
    this.version = version;
  }

  
  /**
   **/
  public DomainEdgeSoftwareUpdateDto maxDownloadRate(Integer maxDownloadRate) {
    this.maxDownloadRate = maxDownloadRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxDownloadRate")
  public Integer getMaxDownloadRate() {
    return maxDownloadRate;
  }
  public void setMaxDownloadRate(Integer maxDownloadRate) {
    this.maxDownloadRate = maxDownloadRate;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DomainEdgeSoftwareUpdateDto downloadStartTime(Date downloadStartTime) {
    this.downloadStartTime = downloadStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("downloadStartTime")
  public Date getDownloadStartTime() {
    return downloadStartTime;
  }
  public void setDownloadStartTime(Date downloadStartTime) {
    this.downloadStartTime = downloadStartTime;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DomainEdgeSoftwareUpdateDto executeStartTime(Date executeStartTime) {
    this.executeStartTime = executeStartTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("executeStartTime")
  public Date getExecuteStartTime() {
    return executeStartTime;
  }
  public void setExecuteStartTime(Date executeStartTime) {
    this.executeStartTime = executeStartTime;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DomainEdgeSoftwareUpdateDto executeStopTime(Date executeStopTime) {
    this.executeStopTime = executeStopTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("executeStopTime")
  public Date getExecuteStopTime() {
    return executeStopTime;
  }
  public void setExecuteStopTime(Date executeStopTime) {
    this.executeStopTime = executeStopTime;
  }

  
  /**
   **/
  public DomainEdgeSoftwareUpdateDto executeOnIdle(Boolean executeOnIdle) {
    this.executeOnIdle = executeOnIdle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("executeOnIdle")
  public Boolean getExecuteOnIdle() {
    return executeOnIdle;
  }
  public void setExecuteOnIdle(Boolean executeOnIdle) {
    this.executeOnIdle = executeOnIdle;
  }

  
  /**
   **/
  public DomainEdgeSoftwareUpdateDto status(StatusEnum status) {
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
  public DomainEdgeSoftwareUpdateDto edgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("edgeUri")
  public String getEdgeUri() {
    return edgeUri;
  }
  public void setEdgeUri(String edgeUri) {
    this.edgeUri = edgeUri;
  }

  
  /**
   **/
  public DomainEdgeSoftwareUpdateDto callDrainingWaitTimeSeconds(Long callDrainingWaitTimeSeconds) {
    this.callDrainingWaitTimeSeconds = callDrainingWaitTimeSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callDrainingWaitTimeSeconds")
  public Long getCallDrainingWaitTimeSeconds() {
    return callDrainingWaitTimeSeconds;
  }
  public void setCallDrainingWaitTimeSeconds(Long callDrainingWaitTimeSeconds) {
    this.callDrainingWaitTimeSeconds = callDrainingWaitTimeSeconds;
  }

  
  /**
   **/
  public DomainEdgeSoftwareUpdateDto current(Boolean current) {
    this.current = current;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("current")
  public Boolean getCurrent() {
    return current;
  }
  public void setCurrent(Boolean current) {
    this.current = current;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainEdgeSoftwareUpdateDto domainEdgeSoftwareUpdateDto = (DomainEdgeSoftwareUpdateDto) o;
    return Objects.equals(this.version, domainEdgeSoftwareUpdateDto.version) &&
        Objects.equals(this.maxDownloadRate, domainEdgeSoftwareUpdateDto.maxDownloadRate) &&
        Objects.equals(this.downloadStartTime, domainEdgeSoftwareUpdateDto.downloadStartTime) &&
        Objects.equals(this.executeStartTime, domainEdgeSoftwareUpdateDto.executeStartTime) &&
        Objects.equals(this.executeStopTime, domainEdgeSoftwareUpdateDto.executeStopTime) &&
        Objects.equals(this.executeOnIdle, domainEdgeSoftwareUpdateDto.executeOnIdle) &&
        Objects.equals(this.status, domainEdgeSoftwareUpdateDto.status) &&
        Objects.equals(this.edgeUri, domainEdgeSoftwareUpdateDto.edgeUri) &&
        Objects.equals(this.callDrainingWaitTimeSeconds, domainEdgeSoftwareUpdateDto.callDrainingWaitTimeSeconds) &&
        Objects.equals(this.current, domainEdgeSoftwareUpdateDto.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, maxDownloadRate, downloadStartTime, executeStartTime, executeStopTime, executeOnIdle, status, edgeUri, callDrainingWaitTimeSeconds, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainEdgeSoftwareUpdateDto {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxDownloadRate: ").append(toIndentedString(maxDownloadRate)).append("\n");
    sb.append("    downloadStartTime: ").append(toIndentedString(downloadStartTime)).append("\n");
    sb.append("    executeStartTime: ").append(toIndentedString(executeStartTime)).append("\n");
    sb.append("    executeStopTime: ").append(toIndentedString(executeStopTime)).append("\n");
    sb.append("    executeOnIdle: ").append(toIndentedString(executeOnIdle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    edgeUri: ").append(toIndentedString(edgeUri)).append("\n");
    sb.append("    callDrainingWaitTimeSeconds: ").append(toIndentedString(callDrainingWaitTimeSeconds)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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

