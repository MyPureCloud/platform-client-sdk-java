# BillingInvoice


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **billToCustomer** | [**Customer**](Customer) | The bill to customer. |  [optional] |
| **shipToCustomer** | [**Customer**](Customer) | The ship to customer. |  [optional] |
| **soldToCustomer** | [**Customer**](Customer) | The sold to customer. |  [optional] |
| **dateInvoiced** | [**LocalDate**](LocalDate) | Date when the invoice was issued. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **billToAddress** | [**InvoiceAddress**](InvoiceAddress) | Details of the bill to address. |  [optional] |
| **shipToAddress** | [**InvoiceAddress**](InvoiceAddress) | Details of the ship to address. |  [optional] |
| **currencyIsoCode** | **String** | Contains the ISO code for any currency allowed by the organization. |  [optional] |
| **paymentStatus** | [**PaymentStatusEnum**](#Enum--PaymentStatusEnum) | Status of the payment. |  [optional] |
| **paymentTerms** | **String** | Payment terms. |  [optional] |
| **paymentLink** | **String** | Payment link. |  [optional] |
| **customerPoNumber** | **String** | Purchase Order Number. |  [optional] |
| **customerInvoiceType** | **String** | Type of the invoice. |  [optional] |
| **amount** | [**BigDecimal**](BigDecimal) | Amount. |  [optional] |


## Enum: PaymentStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PAID | &quot;Paid&quot; | 
| UNPAID | &quot;Unpaid&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
