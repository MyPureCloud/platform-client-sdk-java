package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DncList
 */

public class DncList  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private ImportStatus importStatus = null;
  private Long size = null;

  /**
   * the type of dnc list being created, rds (csv file), gryphon, or dnc.com
   */
  public enum DncSourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RDS("rds"),
    DNC_COM("dnc.com"),
    GRYPHON("gryphon");

    private String value;

    DncSourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DncSourceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DncSourceTypeEnum value : DncSourceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DncSourceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DncSourceTypeEnum dncSourceType = null;
  private String loginId = null;
  private List<String> dncCodes = new ArrayList<String>();
  private String licenseId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the list.
   **/
  public DncList name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the list.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DncList version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * the status of the import process
   **/
  public DncList importStatus(ImportStatus importStatus) {
    this.importStatus = importStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the status of the import process")
  @JsonProperty("importStatus")
  public ImportStatus getImportStatus() {
    return importStatus;
  }
  public void setImportStatus(ImportStatus importStatus) {
    this.importStatus = importStatus;
  }

  
  @ApiModelProperty(example = "null", value = "the number of phone numbers in the do not call list")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  
  @ApiModelProperty(example = "null", value = "the type of dnc list being created, rds (csv file), gryphon, or dnc.com")
  @JsonProperty("dncSourceType")
  public DncSourceTypeEnum getDncSourceType() {
    return dncSourceType;
  }

  
  /**
   * the loginId if the dncSourceType is dnc.com
   **/
  public DncList loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the loginId if the dncSourceType is dnc.com")
  @JsonProperty("loginId")
  public String getLoginId() {
    return loginId;
  }
  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  
  /**
   * the list of dnc.com codes to be treated as DNC
   **/
  public DncList dncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the list of dnc.com codes to be treated as DNC")
  @JsonProperty("dncCodes")
  public List<String> getDncCodes() {
    return dncCodes;
  }
  public void setDncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
  }

  
  /**
   * the license number if the dncSourceType is gryphon
   **/
  public DncList licenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the license number if the dncSourceType is gryphon")
  @JsonProperty("licenseId")
  public String getLicenseId() {
    return licenseId;
  }
  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
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
    DncList dncList = (DncList) o;
    return Objects.equals(this.id, dncList.id) &&
        Objects.equals(this.name, dncList.name) &&
        Objects.equals(this.dateCreated, dncList.dateCreated) &&
        Objects.equals(this.dateModified, dncList.dateModified) &&
        Objects.equals(this.version, dncList.version) &&
        Objects.equals(this.importStatus, dncList.importStatus) &&
        Objects.equals(this.size, dncList.size) &&
        Objects.equals(this.dncSourceType, dncList.dncSourceType) &&
        Objects.equals(this.loginId, dncList.loginId) &&
        Objects.equals(this.dncCodes, dncList.dncCodes) &&
        Objects.equals(this.licenseId, dncList.licenseId) &&
        Objects.equals(this.selfUri, dncList.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, importStatus, size, dncSourceType, loginId, dncCodes, licenseId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DncList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dncSourceType: ").append(toIndentedString(dncSourceType)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    dncCodes: ").append(toIndentedString(dncCodes)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
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

