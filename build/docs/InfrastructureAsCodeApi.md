---
title: InfrastructureAsCodeApi
---
## InfrastructureAsCodeApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**getInfrastructureascodeAccelerator**](InfrastructureAsCodeApi.html#getInfrastructureascodeAccelerator) | Get information about an accelerator |
| [**getInfrastructureascodeAccelerators**](InfrastructureAsCodeApi.html#getInfrastructureascodeAccelerators) | Get a list of available accelerators |
| [**getInfrastructureascodeJob**](InfrastructureAsCodeApi.html#getInfrastructureascodeJob) | Get job status and results |
| [**getInfrastructureascodeJobs**](InfrastructureAsCodeApi.html#getInfrastructureascodeJobs) | Get job history |
| [**postInfrastructureascodeJobs**](InfrastructureAsCodeApi.html#postInfrastructureascodeJobs) | Create a Job |
{: class="table-striped"}

<a name="getInfrastructureascodeAccelerator"></a>

# **getInfrastructureascodeAccelerator**



> [AcceleratorSpecification](AcceleratorSpecification.html) getInfrastructureascodeAccelerator(acceleratorId, preferredLanguage)

Get information about an accelerator

Get the complete metadata specification for an accelerator, including requirements and parameters.

Wraps GET /api/v2/infrastructureascode/accelerators/{acceleratorId}  

Requires ANY permissions: 

* infrastructureascode:accelerator:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.InfrastructureAsCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

InfrastructureAsCodeApi apiInstance = new InfrastructureAsCodeApi();
String acceleratorId = "acceleratorId_example"; // String | Accelerator ID
String preferredLanguage = "en-US"; // String | Preferred Language
try {
    AcceleratorSpecification result = apiInstance.getInfrastructureascodeAccelerator(acceleratorId, preferredLanguage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfrastructureAsCodeApi#getInfrastructureascodeAccelerator");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **acceleratorId** | **String**| Accelerator ID | 
| **preferredLanguage** | **String**| Preferred Language | [optional] [default to en-US]<br />**Values**: ar, cs, da, de, en-US, es, fi, fr, it, iw, ko, ja, nl, no, pl, pt-BR, pt-PT, sv, th, tr, zh-CN, zh-TW 
{: class="table-striped"}


### Return type

[**AcceleratorSpecification**](AcceleratorSpecification.html)

<a name="getInfrastructureascodeAccelerators"></a>

# **getInfrastructureascodeAccelerators**



> [AcceleratorList](AcceleratorList.html) getInfrastructureascodeAccelerators(pageSize, pageNumber, sortBy, sortOrder, name, description, origin, type, classification, tags)

Get a list of available accelerators

Search for accelerators that can be run.

Wraps GET /api/v2/infrastructureascode/accelerators  

Requires ANY permissions: 

* infrastructureascode:accelerator:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.InfrastructureAsCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

InfrastructureAsCodeApi apiInstance = new InfrastructureAsCodeApi();
Integer pageSize = 25; // Integer | The total page size requested
Integer pageNumber = 1; // Integer | The page number requested
String sortBy = "sortBy_example"; // String | variable name requested to sort by
String sortOrder = "asc"; // String | Sort order
String name = "name_example"; // String | Filter by name
String description = "description_example"; // String | Filter by description
String origin = "origin_example"; // String | Filter by origin
String type = "type_example"; // String | Filter by type
String classification = "classification_example"; // String | Filter by classification
String tags = "tags_example"; // String | Filter by tags
try {
    AcceleratorList result = apiInstance.getInfrastructureascodeAccelerators(pageSize, pageNumber, sortBy, sortOrder, name, description, origin, type, classification, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfrastructureAsCodeApi#getInfrastructureascodeAccelerators");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageSize** | **Integer**| The total page size requested | [optional] [default to 25] 
| **pageNumber** | **Integer**| The page number requested | [optional] [default to 1] 
| **sortBy** | **String**| variable name requested to sort by | [optional] 
| **sortOrder** | **String**| Sort order | [optional] [default to asc]<br />**Values**: asc, desc 
| **name** | **String**| Filter by name | [optional] 
| **description** | **String**| Filter by description | [optional] 
| **origin** | **String**| Filter by origin | [optional]<br />**Values**: community, partner, genesys 
| **type** | **String**| Filter by type | [optional]<br />**Values**: module, accelerator, blueprint 
| **classification** | **String**| Filter by classification | [optional] 
| **tags** | **String**| Filter by tags | [optional] 
{: class="table-striped"}


### Return type

[**AcceleratorList**](AcceleratorList.html)

<a name="getInfrastructureascodeJob"></a>

# **getInfrastructureascodeJob**



> [InfrastructureascodeJob](InfrastructureascodeJob.html) getInfrastructureascodeJob(jobId, details)

Get job status and results

Get the execution status of a submitted job, optionally including results and error details.

Wraps GET /api/v2/infrastructureascode/jobs/{jobId}  

Requires ALL permissions: 

* infrastructureascode:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.InfrastructureAsCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

InfrastructureAsCodeApi apiInstance = new InfrastructureAsCodeApi();
String jobId = "jobId_example"; // String | Job ID
Boolean details = false; // Boolean | Include details of execution, including job results or error information
try {
    InfrastructureascodeJob result = apiInstance.getInfrastructureascodeJob(jobId, details);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfrastructureAsCodeApi#getInfrastructureascodeJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| Job ID | 
| **details** | **Boolean**| Include details of execution, including job results or error information | [optional] [default to false] 
{: class="table-striped"}


### Return type

[**InfrastructureascodeJob**](InfrastructureascodeJob.html)

<a name="getInfrastructureascodeJobs"></a>

# **getInfrastructureascodeJobs**



> [InfrastructureascodeJob](InfrastructureascodeJob.html) getInfrastructureascodeJobs(maxResults, includeErrors, sortBy, sortOrder, acceleratorId, submittedBy, status)

Get job history

Get a history of submitted jobs, optionally including error messages.

Wraps GET /api/v2/infrastructureascode/jobs  

Requires ANY permissions: 

* infrastructureascode:job:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.InfrastructureAsCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

InfrastructureAsCodeApi apiInstance = new InfrastructureAsCodeApi();
Integer maxResults = 1; // Integer | Number of jobs to show
Boolean includeErrors = false; // Boolean | Include error messages
String sortBy = "dateSubmitted"; // String | Sort by
String sortOrder = "desc"; // String | Sort order
String acceleratorId = "acceleratorId_example"; // String | Find only jobs associated with this accelerator
String submittedBy = "submittedBy_example"; // String | Find only jobs submitted by this user
String status = "status_example"; // String | Find only jobs in this state
try {
    InfrastructureascodeJob result = apiInstance.getInfrastructureascodeJobs(maxResults, includeErrors, sortBy, sortOrder, acceleratorId, submittedBy, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfrastructureAsCodeApi#getInfrastructureascodeJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maxResults** | **Integer**| Number of jobs to show | [optional] [default to 1] 
| **includeErrors** | **Boolean**| Include error messages | [optional] [default to false] 
| **sortBy** | **String**| Sort by | [optional] [default to dateSubmitted]<br />**Values**: id, dateSubmitted, submittedBy, acceleratorId, status 
| **sortOrder** | **String**| Sort order | [optional] [default to desc]<br />**Values**: asc, desc 
| **acceleratorId** | **String**| Find only jobs associated with this accelerator | [optional] 
| **submittedBy** | **String**| Find only jobs submitted by this user | [optional] 
| **status** | **String**| Find only jobs in this state | [optional]<br />**Values**: Created, Queued, Running, Complete, Failed, Incomplete 
{: class="table-striped"}


### Return type

[**InfrastructureascodeJob**](InfrastructureascodeJob.html)

<a name="postInfrastructureascodeJobs"></a>

# **postInfrastructureascodeJobs**



> [InfrastructureascodeJob](InfrastructureascodeJob.html) postInfrastructureascodeJobs(body)

Create a Job

Create and submit a job for remote execution or see job planning results.

Wraps POST /api/v2/infrastructureascode/jobs  

Requires ANY permissions: 

* infrastructureascode:job:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.InfrastructureAsCodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

InfrastructureAsCodeApi apiInstance = new InfrastructureAsCodeApi();
AcceleratorInput body = new AcceleratorInput(); // AcceleratorInput | 
try {
    InfrastructureascodeJob result = apiInstance.postInfrastructureascodeJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InfrastructureAsCodeApi#postInfrastructureascodeJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**AcceleratorInput**](AcceleratorInput.html)|  | 
{: class="table-striped"}


### Return type

[**InfrastructureascodeJob**](InfrastructureascodeJob.html)

