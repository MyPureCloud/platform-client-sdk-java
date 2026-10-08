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
import com.mypurecloud.sdk.v2.model.CustomConversationAttributeOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Context returned from a guide session turn, including conversation custom attribute updates.
 */
@ApiModel(description = "Context returned from a guide session turn, including conversation custom attribute updates.")

public class GuideSessionTurnResponseContext  implements Serializable {
  
  private List<CustomConversationAttributeOutput> customConversationAttributes = null;

  public GuideSessionTurnResponseContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      customConversationAttributes = new ArrayList<CustomConversationAttributeOutput>();
    }
  }

  public GuideSessionTurnResponseContext(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      customConversationAttributes = new ArrayList<CustomConversationAttributeOutput>();
    }
  }

  
  /**
   * The Conversation Custom Attributes updates made during this turn.
   **/
  public GuideSessionTurnResponseContext customConversationAttributes(List<CustomConversationAttributeOutput> customConversationAttributes) {
    this.customConversationAttributes = customConversationAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Conversation Custom Attributes updates made during this turn.")
  @JsonProperty("customConversationAttributes")
  public List<CustomConversationAttributeOutput> getCustomConversationAttributes() {
    return customConversationAttributes;
  }
  public void setCustomConversationAttributes(List<CustomConversationAttributeOutput> customConversationAttributes) {
    this.customConversationAttributes = customConversationAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideSessionTurnResponseContext guideSessionTurnResponseContext = (GuideSessionTurnResponseContext) o;

    return Objects.equals(this.customConversationAttributes, guideSessionTurnResponseContext.customConversationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customConversationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideSessionTurnResponseContext {\n");
    
    sb.append("    customConversationAttributes: ").append(toIndentedString(customConversationAttributes)).append("\n");
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

