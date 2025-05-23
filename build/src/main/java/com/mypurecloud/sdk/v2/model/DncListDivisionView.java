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
import com.mypurecloud.sdk.v2.model.Division;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DncListDivisionView
 */

public class DncListDivisionView  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
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
    RDS_CUSTOM("rds_custom"),
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
   * The contact method. Required if dncSourceType is rds.
   */
 @JsonDeserialize(using = ContactMethodEnumDeserializer.class)
  public enum ContactMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL("Email"),
    PHONE("Phone"),
    ANY("Any"),
    WHATSAPP("WhatsApp");

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
  private String selfUri = null;

  public DncListDivisionView() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DncListDivisionView name(String name) {
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
   * The division to which this entity belongs.
   **/
  public DncListDivisionView division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }


  @ApiModelProperty(example = "null", value = "The status of the import process.")
  @JsonProperty("importStatus")
  public ImportStatus getImportStatus() {
    return importStatus;
  }


  @ApiModelProperty(example = "null", value = "The number of contacts in the DncList.")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }


  @ApiModelProperty(example = "null", value = "The type of the DncList.")
  @JsonProperty("dncSourceType")
  public DncSourceTypeEnum getDncSourceType() {
    return dncSourceType;
  }


  /**
   * The contact method. Required if dncSourceType is rds.
   **/
  public DncListDivisionView contactMethod(ContactMethodEnum contactMethod) {
    this.contactMethod = contactMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contact method. Required if dncSourceType is rds.")
  @JsonProperty("contactMethod")
  public ContactMethodEnum getContactMethod() {
    return contactMethod;
  }
  public void setContactMethod(ContactMethodEnum contactMethod) {
    this.contactMethod = contactMethod;
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
    DncListDivisionView dncListDivisionView = (DncListDivisionView) o;

    return Objects.equals(this.id, dncListDivisionView.id) &&
            Objects.equals(this.name, dncListDivisionView.name) &&
            Objects.equals(this.division, dncListDivisionView.division) &&
            Objects.equals(this.importStatus, dncListDivisionView.importStatus) &&
            Objects.equals(this.size, dncListDivisionView.size) &&
            Objects.equals(this.dncSourceType, dncListDivisionView.dncSourceType) &&
            Objects.equals(this.contactMethod, dncListDivisionView.contactMethod) &&
            Objects.equals(this.selfUri, dncListDivisionView.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, importStatus, size, dncSourceType, contactMethod, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DncListDivisionView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dncSourceType: ").append(toIndentedString(dncSourceType)).append("\n");
    sb.append("    contactMethod: ").append(toIndentedString(contactMethod)).append("\n");
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

