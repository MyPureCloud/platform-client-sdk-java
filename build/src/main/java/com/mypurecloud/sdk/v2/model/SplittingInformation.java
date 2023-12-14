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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SplittingInformation
 */

public class SplittingInformation  implements Serializable {
  

  private static class CriteriaEnumDeserializer extends StdDeserializer<CriteriaEnum> {
    public CriteriaEnumDeserializer() {
      super(CriteriaEnumDeserializer.class);
    }

    @Override
    public CriteriaEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CriteriaEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The splitting criteria type
   */
 @JsonDeserialize(using = CriteriaEnumDeserializer.class)
  public enum CriteriaEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PERCENTAGE("Percentage"),
    QUANTITY("Quantity"),
    COLUMN("Column"),
    CUSTOM("Custom");

    private String value;

    CriteriaEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CriteriaEnum fromString(String key) {
      if (key == null) return null;

      for (CriteriaEnum value : CriteriaEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CriteriaEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CriteriaEnum criteria = null;
  private String criteriaValue = null;
  private Boolean createRemainderContactList = null;
  private Boolean useWaterfallRule = null;

  
  /**
   * The splitting criteria type
   **/
  public SplittingInformation criteria(CriteriaEnum criteria) {
    this.criteria = criteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The splitting criteria type")
  @JsonProperty("criteria")
  public CriteriaEnum getCriteria() {
    return criteria;
  }
  public void setCriteria(CriteriaEnum criteria) {
    this.criteria = criteria;
  }


  /**
   * The criteria value for the specified criteria type
   **/
  public SplittingInformation criteriaValue(String criteriaValue) {
    this.criteriaValue = criteriaValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The criteria value for the specified criteria type")
  @JsonProperty("criteriaValue")
  public String getCriteriaValue() {
    return criteriaValue;
  }
  public void setCriteriaValue(String criteriaValue) {
    this.criteriaValue = criteriaValue;
  }


  /**
   * Whether to create remainder contact list
   **/
  public SplittingInformation createRemainderContactList(Boolean createRemainderContactList) {
    this.createRemainderContactList = createRemainderContactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to create remainder contact list")
  @JsonProperty("createRemainderContactList")
  public Boolean getCreateRemainderContactList() {
    return createRemainderContactList;
  }
  public void setCreateRemainderContactList(Boolean createRemainderContactList) {
    this.createRemainderContactList = createRemainderContactList;
  }


  /**
   * Whether to use waterfall rule
   **/
  public SplittingInformation useWaterfallRule(Boolean useWaterfallRule) {
    this.useWaterfallRule = useWaterfallRule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to use waterfall rule")
  @JsonProperty("useWaterfallRule")
  public Boolean getUseWaterfallRule() {
    return useWaterfallRule;
  }
  public void setUseWaterfallRule(Boolean useWaterfallRule) {
    this.useWaterfallRule = useWaterfallRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplittingInformation splittingInformation = (SplittingInformation) o;

    return Objects.equals(this.criteria, splittingInformation.criteria) &&
            Objects.equals(this.criteriaValue, splittingInformation.criteriaValue) &&
            Objects.equals(this.createRemainderContactList, splittingInformation.createRemainderContactList) &&
            Objects.equals(this.useWaterfallRule, splittingInformation.useWaterfallRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criteria, criteriaValue, createRemainderContactList, useWaterfallRule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplittingInformation {\n");
    
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    criteriaValue: ").append(toIndentedString(criteriaValue)).append("\n");
    sb.append("    createRemainderContactList: ").append(toIndentedString(createRemainderContactList)).append("\n");
    sb.append("    useWaterfallRule: ").append(toIndentedString(useWaterfallRule)).append("\n");
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

