# BillingInvoiceItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **product** | [**BillingProduct**](BillingProduct) | Represents the details of a product. |  [optional] |
| **description** | **String** | Line Item Description. |  [optional] |
| **dateTransacted** | [**LocalDate**](LocalDate) | Invoice transaction date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateStart** | [**LocalDate**](LocalDate) | Invoice start date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEnd** | [**LocalDate**](LocalDate) | Invoice end date. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **organization** | [**NamedEntity**](NamedEntity) | A Genesys Cloud Organization. |  [optional] |
| **quantity** | **Integer** | Quantity of the item. |  [optional] |
| **unitOfMeasure** | [**UnitOfMeasureEnum**](#Enum--UnitOfMeasureEnum) | Unit of Measure. |  [optional] |
| **amount** | [**BigDecimal**](BigDecimal) | Amount. |  [optional] |


## Enum: UnitOfMeasureEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| CHARACTER | &quot;Character&quot; | 
| CONVERSATION | &quot;Conversation&quot; | 
| COURSE | &quot;Course&quot; | 
| DAY | &quot;Day&quot; | 
| EACH | &quot;Each&quot; | 
| EMPLOYEE | &quot;Employee&quot; | 
| ENGAGEMENT | &quot;Engagement&quot; | 
| EVENT | &quot;Event&quot; | 
| EXAM | &quot;Exam&quot; | 
| GB | &quot;GB&quot; | 
| HOUR | &quot;Hour&quot; | 
| INSTANCE | &quot;Instance&quot; | 
| INTERACTION | &quot;Interaction&quot; | 
| INVOCATION | &quot;Invocation&quot; | 
| MESSAGE | &quot;Message&quot; | 
| MILLIONCHARACTERS | &quot;MillionCharacters&quot; | 
| MINUTE | &quot;Minute&quot; | 
| PERSON | &quot;Person&quot; | 
| PHONENUMBER | &quot;PhoneNumber&quot; | 
| PORT | &quot;Port&quot; | 
| SEGMENT | &quot;Segment&quot; | 
| SESSION | &quot;Session&quot; | 
| STREAM | &quot;Stream&quot; | 
| TOKEN | &quot;Token&quot; | 
| TRANSACTION | &quot;Transaction&quot; | 
| TURN | &quot;Turn&quot; | 
| UNIT | &quot;Unit&quot; | 
| USER | &quot;User&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
