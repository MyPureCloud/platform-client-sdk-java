# BillingAiSubItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **chargeName** | **String** | Charge-level name of the member charge. Omitted when the source charge has no name. |  [optional] |
| **actualQuantity** | [**BigDecimal**](BigDecimal) | Usage in the child product's original unit. |  [optional] |
| **unitOfMeasure** | [**UnitOfMeasureEnum**](#Enum--UnitOfMeasureEnum) | Original unit of measure for the child product usage. |  [optional] |
| **convertedTokenCount** | [**BigDecimal**](BigDecimal) | Child usage converted to parent-bundle tokens. |  [optional] |
| **tokenConversionRate** | [**BigDecimal**](BigDecimal) | Bundle tokens per one original unit. |  [optional] |


## Enum: UnitOfMeasureEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| CHARACTER | &quot;Character&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| COURSE | &quot;Course&quot; | 
| DAY | &quot;Day&quot; | 
| EA | &quot;EA&quot; | 
| EACH | &quot;Each&quot; | 
| EMPLOYEE | &quot;Employee&quot; | 
| ENGAGEMENT | &quot;Engagement&quot; | 
| EVALUATION | &quot;Evaluation&quot; | 
| EVENT | &quot;Event&quot; | 
| EXAM | &quot;Exam&quot; | 
| GB | &quot;GB&quot; | 
| GUIDE | &quot;Guide&quot; | 
| HOUR | &quot;Hour&quot; | 
| INGESTION | &quot;Ingestion&quot; | 
| INSTANCE | &quot;Instance&quot; | 
| INTERACTION | &quot;Interaction&quot; | 
| INVOCATION | &quot;Invocation&quot; | 
| MESSAGE | &quot;Message&quot; | 
| MILLIONCHARACTERS | &quot;MillionCharacters&quot; | 
| MINUTE | &quot;Minute&quot; | 
| PERSON | &quot;Person&quot; | 
| PHONENUMBER | &quot;PhoneNumber&quot; | 
| PORT | &quot;Port&quot; | 
| RATETABLE | &quot;RateTable&quot; | 
| SEGMENT | &quot;Segment&quot; | 
| SESSION | &quot;Session&quot; | 
| STREAM | &quot;Stream&quot; | 
| SUMMARY | &quot;Summary&quot; | 
| TOKEN | &quot;Token&quot; | 
| TRANSACTION | &quot;Transaction&quot; | 
| TRANSLATION | &quot;Translation&quot; | 
| TURN | &quot;Turn&quot; | 
| UNIT | &quot;Unit&quot; | 
| USER | &quot;User&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
