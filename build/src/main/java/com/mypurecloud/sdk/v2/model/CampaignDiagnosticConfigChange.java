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
import java.util.Date;

import java.io.Serializable;
/**
 * CampaignDiagnosticConfigChange
 */

public class CampaignDiagnosticConfigChange  implements Serializable {
  
  private Date date = null;
  private String field = null;
  private String value = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of operation applied
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPDATE("Update"),
    CREATE("Create"),
    DELETE("Delete");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;

  public CampaignDiagnosticConfigChange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Timestamp when the configuration change occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CampaignDiagnosticConfigChange date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp when the configuration change occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   * Field name that was changed
   **/
  public CampaignDiagnosticConfigChange field(String field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field name that was changed")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }


  /**
   * New value assigned to the configuration field
   **/
  public CampaignDiagnosticConfigChange value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New value assigned to the configuration field")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Type of operation applied
   **/
  public CampaignDiagnosticConfigChange action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of operation applied")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDiagnosticConfigChange campaignDiagnosticConfigChange = (CampaignDiagnosticConfigChange) o;

    return Objects.equals(this.date, campaignDiagnosticConfigChange.date) &&
            Objects.equals(this.field, campaignDiagnosticConfigChange.field) &&
            Objects.equals(this.value, campaignDiagnosticConfigChange.value) &&
            Objects.equals(this.action, campaignDiagnosticConfigChange.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, field, value, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDiagnosticConfigChange {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

