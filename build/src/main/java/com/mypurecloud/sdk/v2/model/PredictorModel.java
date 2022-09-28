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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.PredictorModelFeature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PredictorModel
 */

public class PredictorModel  implements Serializable {
  
  private String id = null;
  private String kpi = null;
  private List<AddressableEntityRef> queues = new ArrayList<AddressableEntityRef>();
  private Date dateCreated = null;
  private Date dateTrained = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The media type of the model.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VOICE("voice"),
    EMAIL("email"),
    MESSAGE("message");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private List<PredictorModelFeature> features = new ArrayList<PredictorModelFeature>();

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The key performance indicator used in the model.")
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }


  @ApiModelProperty(example = "null", value = "The List of Queues that are assessed for Predictive Routing.")
  @JsonProperty("queues")
  public List<AddressableEntityRef> getQueues() {
    return queues;
  }


  @ApiModelProperty(example = "null", value = "DateTime indicating when the model was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "DateTime indicating when the model was last trained. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateTrained")
  public Date getDateTrained() {
    return dateTrained;
  }


  @ApiModelProperty(example = "null", value = "The media type of the model.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }


  /**
   **/
  public PredictorModel features(List<PredictorModelFeature> features) {
    this.features = features;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("features")
  public List<PredictorModelFeature> getFeatures() {
    return features;
  }
  public void setFeatures(List<PredictorModelFeature> features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictorModel predictorModel = (PredictorModel) o;

    return Objects.equals(this.id, predictorModel.id) &&
            Objects.equals(this.kpi, predictorModel.kpi) &&
            Objects.equals(this.queues, predictorModel.queues) &&
            Objects.equals(this.dateCreated, predictorModel.dateCreated) &&
            Objects.equals(this.dateTrained, predictorModel.dateTrained) &&
            Objects.equals(this.mediaType, predictorModel.mediaType) &&
            Objects.equals(this.features, predictorModel.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, kpi, queues, dateCreated, dateTrained, mediaType, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictorModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateTrained: ").append(toIndentedString(dateTrained)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

