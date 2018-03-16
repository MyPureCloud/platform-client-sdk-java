package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * SmsPhoneNumber
 */

public class SmsPhoneNumber  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;

  /**
   * Type of the phone number provisioned.
   */
  public enum PhoneNumberTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOCAL("local"),
    MOBILE("mobile"),
    TOLLFREE("tollfree"),
    SHORTCODE("shortcode");

    private String value;

    PhoneNumberTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PhoneNumberTypeEnum fromString(String key) {
      if (key == null) return null;

      for (PhoneNumberTypeEnum value : PhoneNumberTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PhoneNumberTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PhoneNumberTypeEnum phoneNumberType = null;
  private Boolean provisionedThroughPureCloud = null;

  /**
   * Status of the provisioned phone number.
   */
  public enum PhoneNumberStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INVALID("invalid"),
    ACTIVE("active"),
    PORTING("porting");

    private String value;

    PhoneNumberStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PhoneNumberStatusEnum fromString(String key) {
      if (key == null) return null;

      for (PhoneNumberStatusEnum value : PhoneNumberStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PhoneNumberStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PhoneNumberStatusEnum phoneNumberStatus = null;
  private String countryCode = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private User createdBy = null;
  private User modifiedBy = null;
  private Integer version = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public SmsPhoneNumber name(String name) {
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
   * A phone number provisioned for SMS communications in E.164 format. E.g. +13175555555 or +34234234234
   **/
  public SmsPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A phone number provisioned for SMS communications in E.164 format. E.g. +13175555555 or +34234234234")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * Type of the phone number provisioned.
   **/
  public SmsPhoneNumber phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the phone number provisioned.")
  @JsonProperty("phoneNumberType")
  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }

  
  /**
   * Is set to false, if the phone number is provisioned through a SMS provider, outside of PureCloud
   **/
  public SmsPhoneNumber provisionedThroughPureCloud(Boolean provisionedThroughPureCloud) {
    this.provisionedThroughPureCloud = provisionedThroughPureCloud;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is set to false, if the phone number is provisioned through a SMS provider, outside of PureCloud")
  @JsonProperty("provisionedThroughPureCloud")
  public Boolean getProvisionedThroughPureCloud() {
    return provisionedThroughPureCloud;
  }
  public void setProvisionedThroughPureCloud(Boolean provisionedThroughPureCloud) {
    this.provisionedThroughPureCloud = provisionedThroughPureCloud;
  }

  
  /**
   * Status of the provisioned phone number.
   **/
  public SmsPhoneNumber phoneNumberStatus(PhoneNumberStatusEnum phoneNumberStatus) {
    this.phoneNumberStatus = phoneNumberStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the provisioned phone number.")
  @JsonProperty("phoneNumberStatus")
  public PhoneNumberStatusEnum getPhoneNumberStatus() {
    return phoneNumberStatus;
  }
  public void setPhoneNumberStatus(PhoneNumberStatusEnum phoneNumberStatus) {
    this.phoneNumberStatus = phoneNumberStatus;
  }

  
  /**
   * The ISO 3166-1 alpha-2 country code of the country this phone number is associated with.
   **/
  public SmsPhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ISO 3166-1 alpha-2 country code of the country this phone number is associated with.")
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  
  /**
   * Date this phone number was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public SmsPhoneNumber dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this phone number was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date this phone number was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public SmsPhoneNumber dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this phone number was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * User that provisioned this phone number
   **/
  public SmsPhoneNumber createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that provisioned this phone number")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User that last modified this phone number
   **/
  public SmsPhoneNumber modifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that last modified this phone number")
  @JsonProperty("modifiedBy")
  public User getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(User modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * Version number required for updates.
   **/
  public SmsPhoneNumber version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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
    SmsPhoneNumber smsPhoneNumber = (SmsPhoneNumber) o;
    return Objects.equals(this.id, smsPhoneNumber.id) &&
        Objects.equals(this.name, smsPhoneNumber.name) &&
        Objects.equals(this.phoneNumber, smsPhoneNumber.phoneNumber) &&
        Objects.equals(this.phoneNumberType, smsPhoneNumber.phoneNumberType) &&
        Objects.equals(this.provisionedThroughPureCloud, smsPhoneNumber.provisionedThroughPureCloud) &&
        Objects.equals(this.phoneNumberStatus, smsPhoneNumber.phoneNumberStatus) &&
        Objects.equals(this.countryCode, smsPhoneNumber.countryCode) &&
        Objects.equals(this.dateCreated, smsPhoneNumber.dateCreated) &&
        Objects.equals(this.dateModified, smsPhoneNumber.dateModified) &&
        Objects.equals(this.createdBy, smsPhoneNumber.createdBy) &&
        Objects.equals(this.modifiedBy, smsPhoneNumber.modifiedBy) &&
        Objects.equals(this.version, smsPhoneNumber.version) &&
        Objects.equals(this.selfUri, smsPhoneNumber.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, phoneNumberType, provisionedThroughPureCloud, phoneNumberStatus, countryCode, dateCreated, dateModified, createdBy, modifiedBy, version, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsPhoneNumber {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    provisionedThroughPureCloud: ").append(toIndentedString(provisionedThroughPureCloud)).append("\n");
    sb.append("    phoneNumberStatus: ").append(toIndentedString(phoneNumberStatus)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

