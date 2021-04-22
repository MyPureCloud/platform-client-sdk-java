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
import com.mypurecloud.sdk.v2.model.DialerDnclistConfigChangeImportStatus;
import com.mypurecloud.sdk.v2.model.DialerDnclistConfigChangeUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerDnclistConfigChangeDncList
 */

public class DialerDnclistConfigChangeDncList  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DialerDnclistConfigChangeImportStatus importStatus = null;
  private Integer size = null;

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
   * Gets or Sets dncSourceType
   */
 @JsonDeserialize(using = DncSourceTypeEnumDeserializer.class)
  public enum DncSourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RDS("RDS"),
    DNC_COM("DNC_COM"),
    GRYPHON("GRYPHON");

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
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerDnclistConfigChangeDncList id(String id) {
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
  public DialerDnclistConfigChangeDncList name(String name) {
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
  public DialerDnclistConfigChangeDncList dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
   **/
  public DialerDnclistConfigChangeDncList size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList dncSourceType(DncSourceTypeEnum dncSourceType) {
    this.dncSourceType = dncSourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dncSourceType")
  public DncSourceTypeEnum getDncSourceType() {
    return dncSourceType;
  }
  public void setDncSourceType(DncSourceTypeEnum dncSourceType) {
    this.dncSourceType = dncSourceType;
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList loginId(String loginId) {
    this.loginId = loginId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("loginId")
  public String getLoginId() {
    return loginId;
  }
  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList dncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dncCodes")
  public List<String> getDncCodes() {
    return dncCodes;
  }
  public void setDncCodes(List<String> dncCodes) {
    this.dncCodes = dncCodes;
  }

  
  /**
   **/
  public DialerDnclistConfigChangeDncList licenseId(String licenseId) {
    this.licenseId = licenseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public DialerDnclistConfigChangeDncList additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
    return Objects.equals(this.id, dialerDnclistConfigChangeDncList.id) &&
        Objects.equals(this.name, dialerDnclistConfigChangeDncList.name) &&
        Objects.equals(this.dateCreated, dialerDnclistConfigChangeDncList.dateCreated) &&
        Objects.equals(this.dateModified, dialerDnclistConfigChangeDncList.dateModified) &&
        Objects.equals(this.version, dialerDnclistConfigChangeDncList.version) &&
        Objects.equals(this.importStatus, dialerDnclistConfigChangeDncList.importStatus) &&
        Objects.equals(this.size, dialerDnclistConfigChangeDncList.size) &&
        Objects.equals(this.dncSourceType, dialerDnclistConfigChangeDncList.dncSourceType) &&
        Objects.equals(this.loginId, dialerDnclistConfigChangeDncList.loginId) &&
        Objects.equals(this.dncCodes, dialerDnclistConfigChangeDncList.dncCodes) &&
        Objects.equals(this.licenseId, dialerDnclistConfigChangeDncList.licenseId) &&
        Objects.equals(this.contactMethod, dialerDnclistConfigChangeDncList.contactMethod) &&
        Objects.equals(this.division, dialerDnclistConfigChangeDncList.division) &&
        Objects.equals(this.additionalProperties, dialerDnclistConfigChangeDncList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, importStatus, size, dncSourceType, loginId, dncCodes, licenseId, contactMethod, division, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerDnclistConfigChangeDncList {\n");
    
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
    sb.append("    contactMethod: ").append(toIndentedString(contactMethod)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

