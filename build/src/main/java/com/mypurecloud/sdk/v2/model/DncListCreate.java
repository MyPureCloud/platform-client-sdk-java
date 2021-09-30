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
import com.mypurecloud.sdk.v2.model.ImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DncListCreate
 */

public class DncListCreate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private ImportStatus importStatus = null;
  private Long size = null;

  private static class DncSourceTypeEnumDeserializer extends StdDeserializer<DncSourceTypeEnum> {
    public DncSourceTypeEnumDeserializer() {
      super(DncSourceTypeEnumDeserializer.class);
    }

    @Override
    public DncSourceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DncSourceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the DncList.
   */
 @JsonDeserialize(using = DncSourceTypeEnumDeserializer.class)
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
  private DomainEntityRef division = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the DncList.
   **/
  public DncListCreate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the DncList.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DncListCreate version(Integer version) {
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

  
  @ApiModelProperty(example = "null", value = "The status of the import process")
  @JsonProperty("importStatus")
  public ImportStatus getImportStatus() {
    return importStatus;
  }

  
  @ApiModelProperty(example = "null", value = "The total number of phone numbers in the DncList.")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  
  /**
   * The type of the DncList.
   **/
  public DncListCreate dncSourceType(DncSourceTypeEnum dncSourceType) {
    this.dncSourceType = dncSourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the DncList.")
  @JsonProperty("dncSourceType")
  public DncSourceTypeEnum getDncSourceType() {
    return dncSourceType;
  }
  public void setDncSourceType(DncSourceTypeEnum dncSourceType) {
    this.dncSourceType = dncSourceType;
  }

  
  /**
   * A dnc.com loginId. Required if the dncSourceType is dnc.com.
   **/
  public DncListCreate loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A dnc.com loginId. Required if the dncSourceType is dnc.com.")
  @JsonProperty("loginId")
  public String getLoginId() {
    return loginId;
  }
  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  
  /**
   * The list of dnc.com codes to be treated as DNC. Required if the dncSourceType is dnc.com.
   **/
  public DncListCreate dncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of dnc.com codes to be treated as DNC. Required if the dncSourceType is dnc.com.")
  @JsonProperty("dncCodes")
  public List<String> getDncCodes() {
    return dncCodes;
  }
  public void setDncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
  }

  
  /**
   * A gryphon license number. Required if the dncSourceType is gryphon.
   **/
  public DncListCreate licenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A gryphon license number. Required if the dncSourceType is gryphon.")
  @JsonProperty("licenseId")
  public String getLicenseId() {
    return licenseId;
  }
  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }

  
  /**
   * The division this DncList belongs to.
   **/
  public DncListCreate division(DomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division this DncList belongs to.")
  @JsonProperty("division")
  public DomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(DomainEntityRef division) {
    this.division = division;
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
    DncListCreate dncListCreate = (DncListCreate) o;
    return Objects.equals(this.id, dncListCreate.id) &&
        Objects.equals(this.name, dncListCreate.name) &&
        Objects.equals(this.dateCreated, dncListCreate.dateCreated) &&
        Objects.equals(this.dateModified, dncListCreate.dateModified) &&
        Objects.equals(this.version, dncListCreate.version) &&
        Objects.equals(this.importStatus, dncListCreate.importStatus) &&
        Objects.equals(this.size, dncListCreate.size) &&
        Objects.equals(this.dncSourceType, dncListCreate.dncSourceType) &&
        Objects.equals(this.loginId, dncListCreate.loginId) &&
        Objects.equals(this.dncCodes, dncListCreate.dncCodes) &&
        Objects.equals(this.licenseId, dncListCreate.licenseId) &&
        Objects.equals(this.division, dncListCreate.division) &&
        Objects.equals(this.selfUri, dncListCreate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, importStatus, size, dncSourceType, loginId, dncCodes, licenseId, division, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DncListCreate {\n");
    
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
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

