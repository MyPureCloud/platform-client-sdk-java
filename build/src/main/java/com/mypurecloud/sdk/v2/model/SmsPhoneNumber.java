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
import com.mypurecloud.sdk.v2.model.Compliance;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.SmsAddress;
import com.mypurecloud.sdk.v2.model.SmsProvisioningStatus;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * SmsPhoneNumber
 */

public class SmsPhoneNumber  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;

  private static class PhoneNumberTypeEnumDeserializer extends StdDeserializer<PhoneNumberTypeEnum> {
    public PhoneNumberTypeEnumDeserializer() {
      super(PhoneNumberTypeEnumDeserializer.class);
    }

    @Override
    public PhoneNumberTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PhoneNumberTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of the phone number provisioned.
   */
 @JsonDeserialize(using = PhoneNumberTypeEnumDeserializer.class)
  public enum PhoneNumberTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOCAL("local"),
    MOBILE("mobile"),
    TOLLFREE("tollfree"),
    SHORTCODE("shortcode"),
    ALPHANUMERIC("alphanumeric");

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

  private static class PhoneNumberStatusEnumDeserializer extends StdDeserializer<PhoneNumberStatusEnum> {
    public PhoneNumberStatusEnumDeserializer() {
      super(PhoneNumberStatusEnumDeserializer.class);
    }

    @Override
    public PhoneNumberStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PhoneNumberStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of the provisioned phone number.
   */
 @JsonDeserialize(using = PhoneNumberStatusEnumDeserializer.class)
  public enum PhoneNumberStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INVALID("INVALID"),
    ACTIVE("ACTIVE"),
    PORTING("PORTING"),
    PENDING("PENDING"),
    PENDING_CANCELLATION("PENDING_CANCELLATION"),
    INITIATED("INITIATED");

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

  private static class CapabilitiesEnumDeserializer extends StdDeserializer<CapabilitiesEnum> {
    public CapabilitiesEnumDeserializer() {
      super(CapabilitiesEnumDeserializer.class);
    }

    @Override
    public CapabilitiesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CapabilitiesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets capabilities
   */
 @JsonDeserialize(using = CapabilitiesEnumDeserializer.class)
  public enum CapabilitiesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    MMS("mms"),
    VOICE("voice");

    private String value;

    CapabilitiesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CapabilitiesEnum fromString(String key) {
      if (key == null) return null;

      for (CapabilitiesEnum value : CapabilitiesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CapabilitiesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<CapabilitiesEnum> capabilities = null;
  private String countryCode = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private User createdBy = null;
  private User modifiedBy = null;
  private Integer version = null;
  private Date purchaseDate = null;
  private Date cancellationDate = null;
  private Date renewalDate = null;

  private static class AutoRenewableEnumDeserializer extends StdDeserializer<AutoRenewableEnum> {
    public AutoRenewableEnumDeserializer() {
      super(AutoRenewableEnumDeserializer.class);
    }

    @Override
    public AutoRenewableEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AutoRenewableEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Renewal time period of this phone number, if the phoneNumberType is shortcode.
   */
 @JsonDeserialize(using = AutoRenewableEnumDeserializer.class)
  public enum AutoRenewableEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUARTERLY("Quarterly");

    private String value;

    AutoRenewableEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AutoRenewableEnum fromString(String key) {
      if (key == null) return null;

      for (AutoRenewableEnum value : AutoRenewableEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AutoRenewableEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AutoRenewableEnum autoRenewable = null;
  private SmsAddress addressId = null;

  private static class ShortCodeBillingTypeEnumDeserializer extends StdDeserializer<ShortCodeBillingTypeEnum> {
    public ShortCodeBillingTypeEnumDeserializer() {
      super(ShortCodeBillingTypeEnumDeserializer.class);
    }

    @Override
    public ShortCodeBillingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ShortCodeBillingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * BillingType of this phone number, if the phoneNumberType is shortcode.
   */
 @JsonDeserialize(using = ShortCodeBillingTypeEnumDeserializer.class)
  public enum ShortCodeBillingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BASIC("Basic"),
    VANITY("Vanity");

    private String value;

    ShortCodeBillingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ShortCodeBillingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ShortCodeBillingTypeEnum value : ShortCodeBillingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ShortCodeBillingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ShortCodeBillingTypeEnum shortCodeBillingType = null;
  private SmsProvisioningStatus provisioningStatus = null;
  private String country = null;
  private Boolean supportsSms = null;
  private Boolean supportsMms = null;
  private Boolean supportsVoice = null;
  private DomainEntityRef integration = null;
  private Compliance compliance = null;
  private String selfUri = null;

  public SmsPhoneNumber() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      capabilities = new ArrayList<CapabilitiesEnum>();
    }
  }

  
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
   * A phone number provisioned for SMS communications.
   **/
  public SmsPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A phone number provisioned for SMS communications.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @ApiModelProperty(example = "null", value = "Type of the phone number provisioned.")
  @JsonProperty("phoneNumberType")
  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
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


  @ApiModelProperty(example = "null", value = "The capabilities of the phone number available for provisioning.")
  @JsonProperty("capabilities")
  public List<CapabilitiesEnum> getCapabilities() {
    return capabilities;
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
   * Date this phone number was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SmsPhoneNumber dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this phone number was provisioned. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Date this phone number was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SmsPhoneNumber dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this phone number was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  
  @ApiModelProperty(example = "null", required = true, value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Date this phone number was purchased, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SmsPhoneNumber purchaseDate(Date purchaseDate) {
    this.purchaseDate = purchaseDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this phone number was purchased, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("purchaseDate")
  public Date getPurchaseDate() {
    return purchaseDate;
  }
  public void setPurchaseDate(Date purchaseDate) {
    this.purchaseDate = purchaseDate;
  }


  /**
   * Contract end date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SmsPhoneNumber cancellationDate(Date cancellationDate) {
    this.cancellationDate = cancellationDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contract end date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("cancellationDate")
  public Date getCancellationDate() {
    return cancellationDate;
  }
  public void setCancellationDate(Date cancellationDate) {
    this.cancellationDate = cancellationDate;
  }


  /**
   * Contract renewal date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public SmsPhoneNumber renewalDate(Date renewalDate) {
    this.renewalDate = renewalDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contract renewal date of this phone number, if the phoneNumberType is shortcode. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("renewalDate")
  public Date getRenewalDate() {
    return renewalDate;
  }
  public void setRenewalDate(Date renewalDate) {
    this.renewalDate = renewalDate;
  }


  /**
   * Renewal time period of this phone number, if the phoneNumberType is shortcode.
   **/
  public SmsPhoneNumber autoRenewable(AutoRenewableEnum autoRenewable) {
    this.autoRenewable = autoRenewable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Renewal time period of this phone number, if the phoneNumberType is shortcode.")
  @JsonProperty("autoRenewable")
  public AutoRenewableEnum getAutoRenewable() {
    return autoRenewable;
  }
  public void setAutoRenewable(AutoRenewableEnum autoRenewable) {
    this.autoRenewable = autoRenewable;
  }


  /**
   * The id of an address attached to this phone number.
   **/
  public SmsPhoneNumber addressId(SmsAddress addressId) {
    this.addressId = addressId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of an address attached to this phone number.")
  @JsonProperty("addressId")
  public SmsAddress getAddressId() {
    return addressId;
  }
  public void setAddressId(SmsAddress addressId) {
    this.addressId = addressId;
  }


  /**
   * BillingType of this phone number, if the phoneNumberType is shortcode.
   **/
  public SmsPhoneNumber shortCodeBillingType(ShortCodeBillingTypeEnum shortCodeBillingType) {
    this.shortCodeBillingType = shortCodeBillingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "BillingType of this phone number, if the phoneNumberType is shortcode.")
  @JsonProperty("shortCodeBillingType")
  public ShortCodeBillingTypeEnum getShortCodeBillingType() {
    return shortCodeBillingType;
  }
  public void setShortCodeBillingType(ShortCodeBillingTypeEnum shortCodeBillingType) {
    this.shortCodeBillingType = shortCodeBillingType;
  }


  /**
   * Status of latest asynchronous provisioning action
   **/
  public SmsPhoneNumber provisioningStatus(SmsProvisioningStatus provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of latest asynchronous provisioning action")
  @JsonProperty("provisioningStatus")
  public SmsProvisioningStatus getProvisioningStatus() {
    return provisioningStatus;
  }
  public void setProvisioningStatus(SmsProvisioningStatus provisioningStatus) {
    this.provisioningStatus = provisioningStatus;
  }


  /**
   * Localized country name for the country code this phone number belongs too
   **/
  public SmsPhoneNumber country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Localized country name for the country code this phone number belongs too")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  /**
   * Set to true if this phone number has the capability to support SMS
   **/
  public SmsPhoneNumber supportsSms(Boolean supportsSms) {
    this.supportsSms = supportsSms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to true if this phone number has the capability to support SMS")
  @JsonProperty("supportsSms")
  public Boolean getSupportsSms() {
    return supportsSms;
  }
  public void setSupportsSms(Boolean supportsSms) {
    this.supportsSms = supportsSms;
  }


  /**
   * Set to true if this phone number has the capability to support MMS
   **/
  public SmsPhoneNumber supportsMms(Boolean supportsMms) {
    this.supportsMms = supportsMms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to true if this phone number has the capability to support MMS")
  @JsonProperty("supportsMms")
  public Boolean getSupportsMms() {
    return supportsMms;
  }
  public void setSupportsMms(Boolean supportsMms) {
    this.supportsMms = supportsMms;
  }


  /**
   * Set to true if this phone number has the capability to support voice
   **/
  public SmsPhoneNumber supportsVoice(Boolean supportsVoice) {
    this.supportsVoice = supportsVoice;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Set to true if this phone number has the capability to support voice")
  @JsonProperty("supportsVoice")
  public Boolean getSupportsVoice() {
    return supportsVoice;
  }
  public void setSupportsVoice(Boolean supportsVoice) {
    this.supportsVoice = supportsVoice;
  }


  /**
   * The Genesys Cloud integration this phone number belongs to.
   **/
  public SmsPhoneNumber integration(DomainEntityRef integration) {
    this.integration = integration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Genesys Cloud integration this phone number belongs to.")
  @JsonProperty("integration")
  public DomainEntityRef getIntegration() {
    return integration;
  }
  public void setIntegration(DomainEntityRef integration) {
    this.integration = integration;
  }


  /**
   * Compliance configuration for short codes, including help, stop and opt in.
   **/
  public SmsPhoneNumber compliance(Compliance compliance) {
    this.compliance = compliance;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Compliance configuration for short codes, including help, stop and opt in.")
  @JsonProperty("compliance")
  public Compliance getCompliance() {
    return compliance;
  }
  public void setCompliance(Compliance compliance) {
    this.compliance = compliance;
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
            Objects.equals(this.capabilities, smsPhoneNumber.capabilities) &&
            Objects.equals(this.countryCode, smsPhoneNumber.countryCode) &&
            Objects.equals(this.dateCreated, smsPhoneNumber.dateCreated) &&
            Objects.equals(this.dateModified, smsPhoneNumber.dateModified) &&
            Objects.equals(this.createdBy, smsPhoneNumber.createdBy) &&
            Objects.equals(this.modifiedBy, smsPhoneNumber.modifiedBy) &&
            Objects.equals(this.version, smsPhoneNumber.version) &&
            Objects.equals(this.purchaseDate, smsPhoneNumber.purchaseDate) &&
            Objects.equals(this.cancellationDate, smsPhoneNumber.cancellationDate) &&
            Objects.equals(this.renewalDate, smsPhoneNumber.renewalDate) &&
            Objects.equals(this.autoRenewable, smsPhoneNumber.autoRenewable) &&
            Objects.equals(this.addressId, smsPhoneNumber.addressId) &&
            Objects.equals(this.shortCodeBillingType, smsPhoneNumber.shortCodeBillingType) &&
            Objects.equals(this.provisioningStatus, smsPhoneNumber.provisioningStatus) &&
            Objects.equals(this.country, smsPhoneNumber.country) &&
            Objects.equals(this.supportsSms, smsPhoneNumber.supportsSms) &&
            Objects.equals(this.supportsMms, smsPhoneNumber.supportsMms) &&
            Objects.equals(this.supportsVoice, smsPhoneNumber.supportsVoice) &&
            Objects.equals(this.integration, smsPhoneNumber.integration) &&
            Objects.equals(this.compliance, smsPhoneNumber.compliance) &&
            Objects.equals(this.selfUri, smsPhoneNumber.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, phoneNumberType, provisionedThroughPureCloud, phoneNumberStatus, capabilities, countryCode, dateCreated, dateModified, createdBy, modifiedBy, version, purchaseDate, cancellationDate, renewalDate, autoRenewable, addressId, shortCodeBillingType, provisioningStatus, country, supportsSms, supportsMms, supportsVoice, integration, compliance, selfUri);
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
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    cancellationDate: ").append(toIndentedString(cancellationDate)).append("\n");
    sb.append("    renewalDate: ").append(toIndentedString(renewalDate)).append("\n");
    sb.append("    autoRenewable: ").append(toIndentedString(autoRenewable)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    shortCodeBillingType: ").append(toIndentedString(shortCodeBillingType)).append("\n");
    sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    supportsSms: ").append(toIndentedString(supportsSms)).append("\n");
    sb.append("    supportsMms: ").append(toIndentedString(supportsMms)).append("\n");
    sb.append("    supportsVoice: ").append(toIndentedString(supportsVoice)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
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

