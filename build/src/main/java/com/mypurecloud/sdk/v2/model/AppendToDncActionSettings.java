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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AppendToDncActionSettings
 */

public class AppendToDncActionSettings  implements Serializable {
  
  private Boolean expire = null;
  private String expirationDuration = null;

  private static class ListTypeEnumDeserializer extends StdDeserializer<ListTypeEnum> {
    public ListTypeEnumDeserializer() {
      super(ListTypeEnumDeserializer.class);
    }

    @Override
    public ListTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ListTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Dnc List Type to append entries to
   */
 @JsonDeserialize(using = ListTypeEnumDeserializer.class)
  public enum ListTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RDS("Rds"),
    RDSCUSTOM("RdsCustom");

    private String value;

    ListTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ListTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ListTypeEnum value : ListTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ListTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ListTypeEnum listType = null;

  public AppendToDncActionSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether to expire the record appended to the DNC list.
   **/
  public AppendToDncActionSettings expire(Boolean expire) {
    this.expire = expire;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether to expire the record appended to the DNC list.")
  @JsonProperty("expire")
  public Boolean getExpire() {
    return expire;
  }
  public void setExpire(Boolean expire) {
    this.expire = expire;
  }


  /**
   * If 'expire' is set to true, how long to keep the record.
   **/
  public AppendToDncActionSettings expirationDuration(String expirationDuration) {
    this.expirationDuration = expirationDuration;
    return this;
  }
  
  @ApiModelProperty(example = "P19DT15H13M", value = "If 'expire' is set to true, how long to keep the record.")
  @JsonProperty("expirationDuration")
  public String getExpirationDuration() {
    return expirationDuration;
  }
  public void setExpirationDuration(String expirationDuration) {
    this.expirationDuration = expirationDuration;
  }


  /**
   * The Dnc List Type to append entries to
   **/
  public AppendToDncActionSettings listType(ListTypeEnum listType) {
    this.listType = listType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Dnc List Type to append entries to")
  @JsonProperty("listType")
  public ListTypeEnum getListType() {
    return listType;
  }
  public void setListType(ListTypeEnum listType) {
    this.listType = listType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendToDncActionSettings appendToDncActionSettings = (AppendToDncActionSettings) o;

    return Objects.equals(this.expire, appendToDncActionSettings.expire) &&
            Objects.equals(this.expirationDuration, appendToDncActionSettings.expirationDuration) &&
            Objects.equals(this.listType, appendToDncActionSettings.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expire, expirationDuration, listType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendToDncActionSettings {\n");
    
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    expirationDuration: ").append(toIndentedString(expirationDuration)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
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

