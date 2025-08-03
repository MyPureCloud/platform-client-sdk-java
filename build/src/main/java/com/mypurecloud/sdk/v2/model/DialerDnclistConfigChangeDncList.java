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
import com.mypurecloud.sdk.v2.model.DialerDnclistConfigChangeImportStatus;
import com.mypurecloud.sdk.v2.model.DialerDnclistConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerDnclistConfigChangeDncList
 */

public class DialerDnclistConfigChangeDncList  implements Serializable {
  
  private DialerDnclistConfigChangeImportStatus importStatus = null;
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
   * the type of dnc list being created, rds (csv file), gryphon, or dnc.com
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
  private List<String> dncCodes = null;
  private String licenseId = null;

  private static class ContactMethodEnumDeserializer extends StdDeserializer<ContactMethodEnum> {
    public ContactMethodEnumDeserializer() {
      super(ContactMethodEnumDeserializer.class);
    }

    @Override
    public ContactMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContactMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets contactMethod
   */
 @JsonDeserialize(using = ContactMethodEnumDeserializer.class)
  public enum ContactMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL("EMAIL"),
    PHONE("PHONE");

    private String value;

    ContactMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContactMethodEnum fromString(String key) {
      if (key == null) return null;

      for (ContactMethodEnum value : ContactMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContactMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContactMethodEnum contactMethod = null;
  private DialerDnclistConfigChangeUriReference division = null;
  private Map<String, Object> additionalProperties = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerDnclistConfigChangeDncList() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dncCodes = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList importStatus(DialerDnclistConfigChangeImportStatus importStatus) {
    this.importStatus = importStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importStatus")
  public DialerDnclistConfigChangeImportStatus getImportStatus() {
    return importStatus;
  }
  public void setImportStatus(DialerDnclistConfigChangeImportStatus importStatus) {
    this.importStatus = importStatus;
  }


  /**
   * the number of phone numbers in the do not call list
   **/
  public DialerDnclistConfigChangeDncList size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the number of phone numbers in the do not call list")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * the type of dnc list being created, rds (csv file), gryphon, or dnc.com
   **/
  public DialerDnclistConfigChangeDncList dncSourceType(DncSourceTypeEnum dncSourceType) {
    this.dncSourceType = dncSourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "the type of dnc list being created, rds (csv file), gryphon, or dnc.com")
  @JsonProperty("dncSourceType")
  public DncSourceTypeEnum getDncSourceType() {
    return dncSourceType;
  }
  public void setDncSourceType(DncSourceTypeEnum dncSourceType) {
    this.dncSourceType = dncSourceType;
  }


  /**
   * the loginId if the dncSourceType is dnc.com
   **/
  public DialerDnclistConfigChangeDncList loginId(String loginId) {
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
  public DialerDnclistConfigChangeDncList dncCodes(List<String> dncCodes) {
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
  public DialerDnclistConfigChangeDncList licenseId(String licenseId) {
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


  /**
   **/
  public DialerDnclistConfigChangeDncList contactMethod(ContactMethodEnum contactMethod) {
    this.contactMethod = contactMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactMethod")
  public ContactMethodEnum getContactMethod() {
    return contactMethod;
  }
  public void setContactMethod(ContactMethodEnum contactMethod) {
    this.contactMethod = contactMethod;
  }


  /**
   **/
  public DialerDnclistConfigChangeDncList division(DialerDnclistConfigChangeUriReference division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public DialerDnclistConfigChangeUriReference getDivision() {
    return division;
  }
  public void setDivision(DialerDnclistConfigChangeUriReference division) {
    this.division = division;
  }


  /**
   **/
  public DialerDnclistConfigChangeDncList additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerDnclistConfigChangeDncList id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerDnclistConfigChangeDncList name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerDnclistConfigChangeDncList dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerDnclistConfigChangeDncList dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerDnclistConfigChangeDncList version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   **/
  public DialerDnclistConfigChangeDncList getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerDnclistConfigChangeDncList dialerDnclistConfigChangeDncList = (DialerDnclistConfigChangeDncList) o;

    return Objects.equals(this.importStatus, dialerDnclistConfigChangeDncList.importStatus) &&
            Objects.equals(this.size, dialerDnclistConfigChangeDncList.size) &&
            Objects.equals(this.dncSourceType, dialerDnclistConfigChangeDncList.dncSourceType) &&
            Objects.equals(this.loginId, dialerDnclistConfigChangeDncList.loginId) &&
            Objects.equals(this.dncCodes, dialerDnclistConfigChangeDncList.dncCodes) &&
            Objects.equals(this.licenseId, dialerDnclistConfigChangeDncList.licenseId) &&
            Objects.equals(this.contactMethod, dialerDnclistConfigChangeDncList.contactMethod) &&
            Objects.equals(this.division, dialerDnclistConfigChangeDncList.division) &&
            Objects.equals(this.additionalProperties, dialerDnclistConfigChangeDncList.additionalProperties) &&
            Objects.equals(this.id, dialerDnclistConfigChangeDncList.id) &&
            Objects.equals(this.name, dialerDnclistConfigChangeDncList.name) &&
            Objects.equals(this.dateCreated, dialerDnclistConfigChangeDncList.dateCreated) &&
            Objects.equals(this.dateModified, dialerDnclistConfigChangeDncList.dateModified) &&
            Objects.equals(this.version, dialerDnclistConfigChangeDncList.version) &&
            Objects.equals(this.getAdditionalProperties, dialerDnclistConfigChangeDncList.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importStatus, size, dncSourceType, loginId, dncCodes, licenseId, contactMethod, division, additionalProperties, id, name, dateCreated, dateModified, version, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerDnclistConfigChangeDncList {\n");
    
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dncSourceType: ").append(toIndentedString(dncSourceType)).append("\n");
    sb.append("    loginId: ").append(toIndentedString(loginId)).append("\n");
    sb.append("    dncCodes: ").append(toIndentedString(dncCodes)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    contactMethod: ").append(toIndentedString(contactMethod)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

