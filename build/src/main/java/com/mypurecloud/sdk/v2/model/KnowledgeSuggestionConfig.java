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
import com.mypurecloud.sdk.v2.model.KnowledgeBaseReference;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseWithDialectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSuggestionConfig
 */

public class KnowledgeSuggestionConfig  implements Serializable {
  

  private static class VendorNameEnumDeserializer extends StdDeserializer<VendorNameEnum> {
    public VendorNameEnumDeserializer() {
      super(VendorNameEnumDeserializer.class);
    }

    @Override
    public VendorNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VendorNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The name of vendor used for knowledge suggestions.
   */
 @JsonDeserialize(using = VendorNameEnumDeserializer.class)
  public enum VendorNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GOOGLEDIALOGFLOW("GoogleDialogflow"),
    GENESYSKNOWLEDGE("GenesysKnowledge"),
    UNKNOWN("Unknown");

    private String value;

    VendorNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VendorNameEnum fromString(String key) {
      if (key == null) return null;

      for (VendorNameEnum value : VendorNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VendorNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VendorNameEnum vendorName = null;
  private KnowledgeBaseReference knowledgeBase = null;
  private List<KnowledgeBaseWithDialectReference> knowledgeBases = new ArrayList<KnowledgeBaseWithDialectReference>();

  
  /**
   * The name of vendor used for knowledge suggestions.
   **/
  public KnowledgeSuggestionConfig vendorName(VendorNameEnum vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of vendor used for knowledge suggestions.")
  @JsonProperty("vendorName")
  public VendorNameEnum getVendorName() {
    return vendorName;
  }
  public void setVendorName(VendorNameEnum vendorName) {
    this.vendorName = vendorName;
  }


  /**
   * The ID of knowledge base to query when Genesys is the knowledge suggestions provider.
   **/
  public KnowledgeSuggestionConfig knowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of knowledge base to query when Genesys is the knowledge suggestions provider.")
  @JsonProperty("knowledgeBase")
  public KnowledgeBaseReference getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBaseReference knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }


  /**
   * The knowledge bases to query based on dialect, when Genesys is the knowledge suggestions provider.
   **/
  public KnowledgeSuggestionConfig knowledgeBases(List<KnowledgeBaseWithDialectReference> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The knowledge bases to query based on dialect, when Genesys is the knowledge suggestions provider.")
  @JsonProperty("knowledgeBases")
  public List<KnowledgeBaseWithDialectReference> getKnowledgeBases() {
    return knowledgeBases;
  }
  public void setKnowledgeBases(List<KnowledgeBaseWithDialectReference> knowledgeBases) {
    this.knowledgeBases = knowledgeBases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSuggestionConfig knowledgeSuggestionConfig = (KnowledgeSuggestionConfig) o;

    return Objects.equals(this.vendorName, knowledgeSuggestionConfig.vendorName) &&
            Objects.equals(this.knowledgeBase, knowledgeSuggestionConfig.knowledgeBase) &&
            Objects.equals(this.knowledgeBases, knowledgeSuggestionConfig.knowledgeBases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorName, knowledgeBase, knowledgeBases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSuggestionConfig {\n");
    
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    knowledgeBases: ").append(toIndentedString(knowledgeBases)).append("\n");
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

