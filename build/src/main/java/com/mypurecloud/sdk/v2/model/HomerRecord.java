package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * HomerRecord
 */

public class HomerRecord  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date date = null;
  private String milliTs = null;
  private String microTs = null;
  private String method = null;
  private String replyReason = null;
  private String ruri = null;
  private String ruriUser = null;
  private String ruriDomain = null;
  private String fromUser = null;
  private String fromDomain = null;
  private String fromTag = null;
  private String toUser = null;
  private String toDomain = null;
  private String toTag = null;
  private String pidUser = null;
  private String contactUser = null;
  private String authUser = null;
  private String callid = null;
  private String callidAleg = null;
  private String via1 = null;
  private String via1Branch = null;
  private String cseq = null;
  private String diversion = null;
  private String reason = null;
  private String contentType = null;
  private String auth = null;
  private String userAgent = null;
  private String sourceIp = null;
  private String sourcePort = null;
  private String destinationIp = null;
  private String destinationPort = null;
  private String contactIp = null;
  private String contactPort = null;
  private String originatorIp = null;
  private String originatorPort = null;
  private String correlationId = null;
  private String proto = null;
  private String family = null;
  private String rtpStat = null;
  private String type = null;
  private String node = null;
  private String trans = null;
  private String dbnode = null;
  private String msg = null;
  private String sourceAlias = null;
  private String destinationAlias = null;
  private String conversationId = null;
  private String participantId = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public HomerRecord name(String name) {
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
   * metadata associated to the SIP calls. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public HomerRecord date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord milliTs(String milliTs) {
    this.milliTs = milliTs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("milliTs")
  public String getMilliTs() {
    return milliTs;
  }
  public void setMilliTs(String milliTs) {
    this.milliTs = milliTs;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord microTs(String microTs) {
    this.microTs = microTs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("microTs")
  public String getMicroTs() {
    return microTs;
  }
  public void setMicroTs(String microTs) {
    this.microTs = microTs;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord method(String method) {
    this.method = method;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord replyReason(String replyReason) {
    this.replyReason = replyReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("replyReason")
  public String getReplyReason() {
    return replyReason;
  }
  public void setReplyReason(String replyReason) {
    this.replyReason = replyReason;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord ruri(String ruri) {
    this.ruri = ruri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("ruri")
  public String getRuri() {
    return ruri;
  }
  public void setRuri(String ruri) {
    this.ruri = ruri;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord ruriUser(String ruriUser) {
    this.ruriUser = ruriUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("ruriUser")
  public String getRuriUser() {
    return ruriUser;
  }
  public void setRuriUser(String ruriUser) {
    this.ruriUser = ruriUser;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord ruriDomain(String ruriDomain) {
    this.ruriDomain = ruriDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("ruriDomain")
  public String getRuriDomain() {
    return ruriDomain;
  }
  public void setRuriDomain(String ruriDomain) {
    this.ruriDomain = ruriDomain;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord fromUser(String fromUser) {
    this.fromUser = fromUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("fromUser")
  public String getFromUser() {
    return fromUser;
  }
  public void setFromUser(String fromUser) {
    this.fromUser = fromUser;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord fromDomain(String fromDomain) {
    this.fromDomain = fromDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("fromDomain")
  public String getFromDomain() {
    return fromDomain;
  }
  public void setFromDomain(String fromDomain) {
    this.fromDomain = fromDomain;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord fromTag(String fromTag) {
    this.fromTag = fromTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("fromTag")
  public String getFromTag() {
    return fromTag;
  }
  public void setFromTag(String fromTag) {
    this.fromTag = fromTag;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord toUser(String toUser) {
    this.toUser = toUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("toUser")
  public String getToUser() {
    return toUser;
  }
  public void setToUser(String toUser) {
    this.toUser = toUser;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord toDomain(String toDomain) {
    this.toDomain = toDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("toDomain")
  public String getToDomain() {
    return toDomain;
  }
  public void setToDomain(String toDomain) {
    this.toDomain = toDomain;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord toTag(String toTag) {
    this.toTag = toTag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("toTag")
  public String getToTag() {
    return toTag;
  }
  public void setToTag(String toTag) {
    this.toTag = toTag;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord pidUser(String pidUser) {
    this.pidUser = pidUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("pidUser")
  public String getPidUser() {
    return pidUser;
  }
  public void setPidUser(String pidUser) {
    this.pidUser = pidUser;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord contactUser(String contactUser) {
    this.contactUser = contactUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("contactUser")
  public String getContactUser() {
    return contactUser;
  }
  public void setContactUser(String contactUser) {
    this.contactUser = contactUser;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord authUser(String authUser) {
    this.authUser = authUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("authUser")
  public String getAuthUser() {
    return authUser;
  }
  public void setAuthUser(String authUser) {
    this.authUser = authUser;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord callid(String callid) {
    this.callid = callid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("callid")
  public String getCallid() {
    return callid;
  }
  public void setCallid(String callid) {
    this.callid = callid;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord callidAleg(String callidAleg) {
    this.callidAleg = callidAleg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("callidAleg")
  public String getCallidAleg() {
    return callidAleg;
  }
  public void setCallidAleg(String callidAleg) {
    this.callidAleg = callidAleg;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord via1(String via1) {
    this.via1 = via1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("via1")
  public String getVia1() {
    return via1;
  }
  public void setVia1(String via1) {
    this.via1 = via1;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord via1Branch(String via1Branch) {
    this.via1Branch = via1Branch;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("via1Branch")
  public String getVia1Branch() {
    return via1Branch;
  }
  public void setVia1Branch(String via1Branch) {
    this.via1Branch = via1Branch;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord cseq(String cseq) {
    this.cseq = cseq;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("cseq")
  public String getCseq() {
    return cseq;
  }
  public void setCseq(String cseq) {
    this.cseq = cseq;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord diversion(String diversion) {
    this.diversion = diversion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("diversion")
  public String getDiversion() {
    return diversion;
  }
  public void setDiversion(String diversion) {
    this.diversion = diversion;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord reason(String reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("contentType")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord auth(String auth) {
    this.auth = auth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("auth")
  public String getAuth() {
    return auth;
  }
  public void setAuth(String auth) {
    this.auth = auth;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("userAgent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord sourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("sourceIp")
  public String getSourceIp() {
    return sourceIp;
  }
  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord sourcePort(String sourcePort) {
    this.sourcePort = sourcePort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("sourcePort")
  public String getSourcePort() {
    return sourcePort;
  }
  public void setSourcePort(String sourcePort) {
    this.sourcePort = sourcePort;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord destinationIp(String destinationIp) {
    this.destinationIp = destinationIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("destinationIp")
  public String getDestinationIp() {
    return destinationIp;
  }
  public void setDestinationIp(String destinationIp) {
    this.destinationIp = destinationIp;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord destinationPort(String destinationPort) {
    this.destinationPort = destinationPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("destinationPort")
  public String getDestinationPort() {
    return destinationPort;
  }
  public void setDestinationPort(String destinationPort) {
    this.destinationPort = destinationPort;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord contactIp(String contactIp) {
    this.contactIp = contactIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("contactIp")
  public String getContactIp() {
    return contactIp;
  }
  public void setContactIp(String contactIp) {
    this.contactIp = contactIp;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord contactPort(String contactPort) {
    this.contactPort = contactPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("contactPort")
  public String getContactPort() {
    return contactPort;
  }
  public void setContactPort(String contactPort) {
    this.contactPort = contactPort;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord originatorIp(String originatorIp) {
    this.originatorIp = originatorIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("originatorIp")
  public String getOriginatorIp() {
    return originatorIp;
  }
  public void setOriginatorIp(String originatorIp) {
    this.originatorIp = originatorIp;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord originatorPort(String originatorPort) {
    this.originatorPort = originatorPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("originatorPort")
  public String getOriginatorPort() {
    return originatorPort;
  }
  public void setOriginatorPort(String originatorPort) {
    this.originatorPort = originatorPort;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord proto(String proto) {
    this.proto = proto;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("proto")
  public String getProto() {
    return proto;
  }
  public void setProto(String proto) {
    this.proto = proto;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord family(String family) {
    this.family = family;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("family")
  public String getFamily() {
    return family;
  }
  public void setFamily(String family) {
    this.family = family;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord rtpStat(String rtpStat) {
    this.rtpStat = rtpStat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("rtpStat")
  public String getRtpStat() {
    return rtpStat;
  }
  public void setRtpStat(String rtpStat) {
    this.rtpStat = rtpStat;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord node(String node) {
    this.node = node;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("node")
  public String getNode() {
    return node;
  }
  public void setNode(String node) {
    this.node = node;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord trans(String trans) {
    this.trans = trans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("trans")
  public String getTrans() {
    return trans;
  }
  public void setTrans(String trans) {
    this.trans = trans;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord dbnode(String dbnode) {
    this.dbnode = dbnode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("dbnode")
  public String getDbnode() {
    return dbnode;
  }
  public void setDbnode(String dbnode) {
    this.dbnode = dbnode;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord msg(String msg) {
    this.msg = msg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord sourceAlias(String sourceAlias) {
    this.sourceAlias = sourceAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("sourceAlias")
  public String getSourceAlias() {
    return sourceAlias;
  }
  public void setSourceAlias(String sourceAlias) {
    this.sourceAlias = sourceAlias;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord destinationAlias(String destinationAlias) {
    this.destinationAlias = destinationAlias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("destinationAlias")
  public String getDestinationAlias() {
    return destinationAlias;
  }
  public void setDestinationAlias(String destinationAlias) {
    this.destinationAlias = destinationAlias;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  
  /**
   * metadata associated to the SIP calls
   **/
  public HomerRecord participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "metadata associated to the SIP calls")
  @JsonProperty("participantId")
  public String getParticipantId() {
    return participantId;
  }
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
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
    HomerRecord homerRecord = (HomerRecord) o;
    return Objects.equals(this.id, homerRecord.id) &&
        Objects.equals(this.name, homerRecord.name) &&
        Objects.equals(this.date, homerRecord.date) &&
        Objects.equals(this.milliTs, homerRecord.milliTs) &&
        Objects.equals(this.microTs, homerRecord.microTs) &&
        Objects.equals(this.method, homerRecord.method) &&
        Objects.equals(this.replyReason, homerRecord.replyReason) &&
        Objects.equals(this.ruri, homerRecord.ruri) &&
        Objects.equals(this.ruriUser, homerRecord.ruriUser) &&
        Objects.equals(this.ruriDomain, homerRecord.ruriDomain) &&
        Objects.equals(this.fromUser, homerRecord.fromUser) &&
        Objects.equals(this.fromDomain, homerRecord.fromDomain) &&
        Objects.equals(this.fromTag, homerRecord.fromTag) &&
        Objects.equals(this.toUser, homerRecord.toUser) &&
        Objects.equals(this.toDomain, homerRecord.toDomain) &&
        Objects.equals(this.toTag, homerRecord.toTag) &&
        Objects.equals(this.pidUser, homerRecord.pidUser) &&
        Objects.equals(this.contactUser, homerRecord.contactUser) &&
        Objects.equals(this.authUser, homerRecord.authUser) &&
        Objects.equals(this.callid, homerRecord.callid) &&
        Objects.equals(this.callidAleg, homerRecord.callidAleg) &&
        Objects.equals(this.via1, homerRecord.via1) &&
        Objects.equals(this.via1Branch, homerRecord.via1Branch) &&
        Objects.equals(this.cseq, homerRecord.cseq) &&
        Objects.equals(this.diversion, homerRecord.diversion) &&
        Objects.equals(this.reason, homerRecord.reason) &&
        Objects.equals(this.contentType, homerRecord.contentType) &&
        Objects.equals(this.auth, homerRecord.auth) &&
        Objects.equals(this.userAgent, homerRecord.userAgent) &&
        Objects.equals(this.sourceIp, homerRecord.sourceIp) &&
        Objects.equals(this.sourcePort, homerRecord.sourcePort) &&
        Objects.equals(this.destinationIp, homerRecord.destinationIp) &&
        Objects.equals(this.destinationPort, homerRecord.destinationPort) &&
        Objects.equals(this.contactIp, homerRecord.contactIp) &&
        Objects.equals(this.contactPort, homerRecord.contactPort) &&
        Objects.equals(this.originatorIp, homerRecord.originatorIp) &&
        Objects.equals(this.originatorPort, homerRecord.originatorPort) &&
        Objects.equals(this.correlationId, homerRecord.correlationId) &&
        Objects.equals(this.proto, homerRecord.proto) &&
        Objects.equals(this.family, homerRecord.family) &&
        Objects.equals(this.rtpStat, homerRecord.rtpStat) &&
        Objects.equals(this.type, homerRecord.type) &&
        Objects.equals(this.node, homerRecord.node) &&
        Objects.equals(this.trans, homerRecord.trans) &&
        Objects.equals(this.dbnode, homerRecord.dbnode) &&
        Objects.equals(this.msg, homerRecord.msg) &&
        Objects.equals(this.sourceAlias, homerRecord.sourceAlias) &&
        Objects.equals(this.destinationAlias, homerRecord.destinationAlias) &&
        Objects.equals(this.conversationId, homerRecord.conversationId) &&
        Objects.equals(this.participantId, homerRecord.participantId) &&
        Objects.equals(this.selfUri, homerRecord.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, date, milliTs, microTs, method, replyReason, ruri, ruriUser, ruriDomain, fromUser, fromDomain, fromTag, toUser, toDomain, toTag, pidUser, contactUser, authUser, callid, callidAleg, via1, via1Branch, cseq, diversion, reason, contentType, auth, userAgent, sourceIp, sourcePort, destinationIp, destinationPort, contactIp, contactPort, originatorIp, originatorPort, correlationId, proto, family, rtpStat, type, node, trans, dbnode, msg, sourceAlias, destinationAlias, conversationId, participantId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomerRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    milliTs: ").append(toIndentedString(milliTs)).append("\n");
    sb.append("    microTs: ").append(toIndentedString(microTs)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    replyReason: ").append(toIndentedString(replyReason)).append("\n");
    sb.append("    ruri: ").append(toIndentedString(ruri)).append("\n");
    sb.append("    ruriUser: ").append(toIndentedString(ruriUser)).append("\n");
    sb.append("    ruriDomain: ").append(toIndentedString(ruriDomain)).append("\n");
    sb.append("    fromUser: ").append(toIndentedString(fromUser)).append("\n");
    sb.append("    fromDomain: ").append(toIndentedString(fromDomain)).append("\n");
    sb.append("    fromTag: ").append(toIndentedString(fromTag)).append("\n");
    sb.append("    toUser: ").append(toIndentedString(toUser)).append("\n");
    sb.append("    toDomain: ").append(toIndentedString(toDomain)).append("\n");
    sb.append("    toTag: ").append(toIndentedString(toTag)).append("\n");
    sb.append("    pidUser: ").append(toIndentedString(pidUser)).append("\n");
    sb.append("    contactUser: ").append(toIndentedString(contactUser)).append("\n");
    sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
    sb.append("    callid: ").append(toIndentedString(callid)).append("\n");
    sb.append("    callidAleg: ").append(toIndentedString(callidAleg)).append("\n");
    sb.append("    via1: ").append(toIndentedString(via1)).append("\n");
    sb.append("    via1Branch: ").append(toIndentedString(via1Branch)).append("\n");
    sb.append("    cseq: ").append(toIndentedString(cseq)).append("\n");
    sb.append("    diversion: ").append(toIndentedString(diversion)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
    sb.append("    destinationIp: ").append(toIndentedString(destinationIp)).append("\n");
    sb.append("    destinationPort: ").append(toIndentedString(destinationPort)).append("\n");
    sb.append("    contactIp: ").append(toIndentedString(contactIp)).append("\n");
    sb.append("    contactPort: ").append(toIndentedString(contactPort)).append("\n");
    sb.append("    originatorIp: ").append(toIndentedString(originatorIp)).append("\n");
    sb.append("    originatorPort: ").append(toIndentedString(originatorPort)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    proto: ").append(toIndentedString(proto)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    rtpStat: ").append(toIndentedString(rtpStat)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    trans: ").append(toIndentedString(trans)).append("\n");
    sb.append("    dbnode: ").append(toIndentedString(dbnode)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    sourceAlias: ").append(toIndentedString(sourceAlias)).append("\n");
    sb.append("    destinationAlias: ").append(toIndentedString(destinationAlias)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
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

