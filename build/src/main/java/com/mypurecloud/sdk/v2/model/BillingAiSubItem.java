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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * BillingAiSubItem
 */

public class BillingAiSubItem  implements Serializable {
  
  private String chargeName = null;
  private BigDecimal actualQuantity = null;

  private static class UnitOfMeasureEnumDeserializer extends StdDeserializer<UnitOfMeasureEnum> {
    public UnitOfMeasureEnumDeserializer() {
      super(UnitOfMeasureEnumDeserializer.class);
    }

    @Override
    public UnitOfMeasureEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UnitOfMeasureEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Original unit of measure for the child product usage.
   */
 @JsonDeserialize(using = UnitOfMeasureEnumDeserializer.class)
  public enum UnitOfMeasureEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("Call"),
    CHARACTER("Character"),
    CONVERSATION("Conversation"),
    COURSE("Course"),
    DAY("Day"),
    EA("EA"),
    EACH("Each"),
    EMPLOYEE("Employee"),
    ENGAGEMENT("Engagement"),
    EVALUATION("Evaluation"),
    EVENT("Event"),
    EXAM("Exam"),
    GB("GB"),
    GUIDE("Guide"),
    HOUR("Hour"),
    INGESTION("Ingestion"),
    INSTANCE("Instance"),
    INTERACTION("Interaction"),
    INVOCATION("Invocation"),
    MESSAGE("Message"),
    MILLIONCHARACTERS("MillionCharacters"),
    MINUTE("Minute"),
    PERSON("Person"),
    PHONENUMBER("PhoneNumber"),
    PORT("Port"),
    RATETABLE("RateTable"),
    SEGMENT("Segment"),
    SESSION("Session"),
    STREAM("Stream"),
    SUMMARY("Summary"),
    TOKEN("Token"),
    TRANSACTION("Transaction"),
    TRANSLATION("Translation"),
    TURN("Turn"),
    UNIT("Unit"),
    USER("User");

    private String value;

    UnitOfMeasureEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UnitOfMeasureEnum fromString(String key) {
      if (key == null) return null;

      for (UnitOfMeasureEnum value : UnitOfMeasureEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UnitOfMeasureEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UnitOfMeasureEnum unitOfMeasure = null;
  private BigDecimal convertedTokenCount = null;
  private BigDecimal tokenConversionRate = null;

  public BillingAiSubItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public BillingAiSubItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Charge-level name of the member charge. Omitted when the source charge has no name.
   **/
  public BillingAiSubItem chargeName(String chargeName) {
    this.chargeName = chargeName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Charge-level name of the member charge. Omitted when the source charge has no name.")
  @JsonProperty("chargeName")
  public String getChargeName() {
    return chargeName;
  }
  public void setChargeName(String chargeName) {
    this.chargeName = chargeName;
  }


  /**
   * Usage in the child product's original unit.
   **/
  public BillingAiSubItem actualQuantity(BigDecimal actualQuantity) {
    this.actualQuantity = actualQuantity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usage in the child product's original unit.")
  @JsonProperty("actualQuantity")
  public BigDecimal getActualQuantity() {
    return actualQuantity;
  }
  public void setActualQuantity(BigDecimal actualQuantity) {
    this.actualQuantity = actualQuantity;
  }


  /**
   * Original unit of measure for the child product usage.
   **/
  public BillingAiSubItem unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Original unit of measure for the child product usage.")
  @JsonProperty("unitOfMeasure")
  public UnitOfMeasureEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }
  public void setUnitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  /**
   * Child usage converted to parent-bundle tokens.
   **/
  public BillingAiSubItem convertedTokenCount(BigDecimal convertedTokenCount) {
    this.convertedTokenCount = convertedTokenCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Child usage converted to parent-bundle tokens.")
  @JsonProperty("convertedTokenCount")
  public BigDecimal getConvertedTokenCount() {
    return convertedTokenCount;
  }
  public void setConvertedTokenCount(BigDecimal convertedTokenCount) {
    this.convertedTokenCount = convertedTokenCount;
  }


  /**
   * Bundle tokens per one original unit.
   **/
  public BillingAiSubItem tokenConversionRate(BigDecimal tokenConversionRate) {
    this.tokenConversionRate = tokenConversionRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Bundle tokens per one original unit.")
  @JsonProperty("tokenConversionRate")
  public BigDecimal getTokenConversionRate() {
    return tokenConversionRate;
  }
  public void setTokenConversionRate(BigDecimal tokenConversionRate) {
    this.tokenConversionRate = tokenConversionRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAiSubItem billingAiSubItem = (BillingAiSubItem) o;

    return Objects.equals(this.chargeName, billingAiSubItem.chargeName) &&
            Objects.equals(this.actualQuantity, billingAiSubItem.actualQuantity) &&
            Objects.equals(this.unitOfMeasure, billingAiSubItem.unitOfMeasure) &&
            Objects.equals(this.convertedTokenCount, billingAiSubItem.convertedTokenCount) &&
            Objects.equals(this.tokenConversionRate, billingAiSubItem.tokenConversionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeName, actualQuantity, unitOfMeasure, convertedTokenCount, tokenConversionRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAiSubItem {\n");
    
    sb.append("    chargeName: ").append(toIndentedString(chargeName)).append("\n");
    sb.append("    actualQuantity: ").append(toIndentedString(actualQuantity)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    convertedTokenCount: ").append(toIndentedString(convertedTokenCount)).append("\n");
    sb.append("    tokenConversionRate: ").append(toIndentedString(tokenConversionRate)).append("\n");
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

