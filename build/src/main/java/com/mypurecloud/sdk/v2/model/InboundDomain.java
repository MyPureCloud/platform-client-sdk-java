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
 * InboundDomain
 */

public class InboundDomain  implements Serializable {
  
  private String id = null;
  private String name = null;

  /**
   * Mx Record Status
   */
  public enum MxRecordStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VALID("VALID"),
    INVALID("INVALID"),
    NOT_AVAILABLE("NOT_AVAILABLE");

    private String value;

    MxRecordStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MxRecordStatusEnum fromString(String key) {
      if (key == null) return null;

      for (MxRecordStatusEnum value : MxRecordStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MxRecordStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MxRecordStatusEnum mxRecordStatus = null;
  private Boolean subDomain = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public InboundDomain name(String name) {
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
   * Mx Record Status
   **/
  public InboundDomain mxRecordStatus(MxRecordStatusEnum mxRecordStatus) {
    this.mxRecordStatus = mxRecordStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Mx Record Status")
  @JsonProperty("mxRecordStatus")
  public MxRecordStatusEnum getMxRecordStatus() {
    return mxRecordStatus;
  }
  public void setMxRecordStatus(MxRecordStatusEnum mxRecordStatus) {
    this.mxRecordStatus = mxRecordStatus;
  }

  
  /**
   * Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email.
   **/
  public InboundDomain subDomain(Boolean subDomain) {
    this.subDomain = subDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if this a PureCloud sub-domain.  If true, then the appropriate DNS records are created for sending/receiving email.")
  @JsonProperty("subDomain")
  public Boolean getSubDomain() {
    return subDomain;
  }
  public void setSubDomain(Boolean subDomain) {
    this.subDomain = subDomain;
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
    InboundDomain inboundDomain = (InboundDomain) o;
    return Objects.equals(this.id, inboundDomain.id) &&
        Objects.equals(this.name, inboundDomain.name) &&
        Objects.equals(this.mxRecordStatus, inboundDomain.mxRecordStatus) &&
        Objects.equals(this.subDomain, inboundDomain.subDomain) &&
        Objects.equals(this.selfUri, inboundDomain.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mxRecordStatus, subDomain, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundDomain {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mxRecordStatus: ").append(toIndentedString(mxRecordStatus)).append("\n");
    sb.append("    subDomain: ").append(toIndentedString(subDomain)).append("\n");
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

