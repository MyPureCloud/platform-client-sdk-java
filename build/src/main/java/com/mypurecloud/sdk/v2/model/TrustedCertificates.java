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
import com.mypurecloud.sdk.v2.model.TrustedCertificateInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Information about trusted certificates
 */
@ApiModel(description = "Information about trusted certificates")

public class TrustedCertificates  implements Serializable {
  
  private List<TrustedCertificateInfo> entities = null;
  private Integer total = null;

  public TrustedCertificates() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<TrustedCertificateInfo>();
    }
  }

  
  /**
   * The list of trusted certificates
   **/
  public TrustedCertificates entities(List<TrustedCertificateInfo> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of trusted certificates")
  @JsonProperty("entities")
  public List<TrustedCertificateInfo> getEntities() {
    return entities;
  }
  public void setEntities(List<TrustedCertificateInfo> entities) {
    this.entities = entities;
  }


  /**
   * The total number of trusted certificates
   **/
  public TrustedCertificates total(Integer total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of trusted certificates")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustedCertificates trustedCertificates = (TrustedCertificates) o;

    return Objects.equals(this.entities, trustedCertificates.entities) &&
            Objects.equals(this.total, trustedCertificates.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustedCertificates {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

