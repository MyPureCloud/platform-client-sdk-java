# CoachingApi

All URIs are relative to *https://api.mypurecloud.com*

| Method | Description |
| ------------- | ------------- |
| [**deleteCoachingAppointment**](CoachingApi#deleteCoachingAppointment) | Delete an existing appointment |
| [**deleteCoachingAppointmentAnnotation**](CoachingApi#deleteCoachingAppointmentAnnotation) | Delete an existing annotation |
| [**getCoachingAppointment**](CoachingApi#getCoachingAppointment) | Retrieve an appointment |
| [**getCoachingAppointmentAnnotation**](CoachingApi#getCoachingAppointmentAnnotation) | Retrieve an annotation. |
| [**getCoachingAppointmentAnnotations**](CoachingApi#getCoachingAppointmentAnnotations) | Get a list of annotations. |
| [**getCoachingAppointmentStatuses**](CoachingApi#getCoachingAppointmentStatuses) | Get the list of status changes for a coaching appointment. |
| [**getCoachingAppointments**](CoachingApi#getCoachingAppointments) | Get appointments for users and optional date range |
| [**getCoachingAppointmentsMe**](CoachingApi#getCoachingAppointmentsMe) | Get my appointments for a given date range |
| [**getCoachingNotification**](CoachingApi#getCoachingNotification) | Get an existing notification |
| [**getCoachingNotifications**](CoachingApi#getCoachingNotifications) | Retrieve the list of your notifications. |
| [**getCoachingScheduleslotsJob**](CoachingApi#getCoachingScheduleslotsJob) | Retrieve the status of the job for the slots where a coaching appointment can be scheduled. |
| [**patchCoachingAppointment**](CoachingApi#patchCoachingAppointment) | Update an existing appointment |
| [**patchCoachingAppointmentAnnotation**](CoachingApi#patchCoachingAppointmentAnnotation) | Update an existing annotation. |
| [**patchCoachingAppointmentStatus**](CoachingApi#patchCoachingAppointmentStatus) | Update the status of a coaching appointment |
| [**patchCoachingNotification**](CoachingApi#patchCoachingNotification) | Update an existing notification. |
| [**postCoachingAppointmentAnnotations**](CoachingApi#postCoachingAppointmentAnnotations) | Create a new annotation. |
| [**postCoachingAppointmentConversations**](CoachingApi#postCoachingAppointmentConversations) | Add a conversation to an appointment |
| [**postCoachingAppointments**](CoachingApi#postCoachingAppointments) | Create a new appointment |
| [**postCoachingAppointmentsAggregatesQuery**](CoachingApi#postCoachingAppointmentsAggregatesQuery) | Retrieve aggregated appointment data |
| [**postCoachingScheduleslotsJobs**](CoachingApi#postCoachingScheduleslotsJobs) | Start job to retrieve the slots where a coaching appointment can be scheduled. |
| [**postCoachingScheduleslotsQuery**](CoachingApi#postCoachingScheduleslotsQuery) | Get list of possible slots where a coaching appointment can be scheduled. |
{: class="table-striped"}


# **deleteCoachingAppointment**


> [CoachingAppointmentReference](CoachingAppointmentReference) deleteCoachingAppointment(appointmentId)

Delete an existing appointment

Permission not required if you are the creator of the appointment

Wraps DELETE /api/v2/coaching/appointments/{appointmentId}  

Requires ANY permissions: 

* coaching:appointment:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
try {
    CoachingAppointmentReference result = apiInstance.deleteCoachingAppointment(appointmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#deleteCoachingAppointment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
{: class="table-striped"}


### Return type

[**CoachingAppointmentReference**](CoachingAppointmentReference)


# **deleteCoachingAppointmentAnnotation**


> Void deleteCoachingAppointmentAnnotation(appointmentId, annotationId)

Delete an existing annotation

You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment

Wraps DELETE /api/v2/coaching/appointments/{appointmentId}/annotations/{annotationId}  

Requires ANY permissions: 

* coaching:annotation:delete
* coaching:privateAnnotation:delete

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
String annotationId = "annotationId_example"; // String | The ID of the annotation.
try {
    apiInstance.deleteCoachingAppointmentAnnotation(appointmentId, annotationId);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#deleteCoachingAppointmentAnnotation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **annotationId** | **String**| The ID of the annotation. | 
{: class="table-striped"}


### Return type

null (empty response body)


# **getCoachingAppointment**


> [CoachingAppointmentResponse](CoachingAppointmentResponse) getCoachingAppointment(appointmentId)

Retrieve an appointment

Permission not required if you are the attendee, creator or facilitator of the appointment

Wraps GET /api/v2/coaching/appointments/{appointmentId}  

Requires ANY permissions: 

* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
try {
    CoachingAppointmentResponse result = apiInstance.getCoachingAppointment(appointmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingAppointment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
{: class="table-striped"}


### Return type

[**CoachingAppointmentResponse**](CoachingAppointmentResponse)


# **getCoachingAppointmentAnnotation**


> [CoachingAnnotation](CoachingAnnotation) getCoachingAppointmentAnnotation(appointmentId, annotationId)

Retrieve an annotation.

You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).

Wraps GET /api/v2/coaching/appointments/{appointmentId}/annotations/{annotationId}  

Requires ANY permissions: 

* coaching:annotation:view
* coaching:privateAnnotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
String annotationId = "annotationId_example"; // String | The ID of the annotation.
try {
    CoachingAnnotation result = apiInstance.getCoachingAppointmentAnnotation(appointmentId, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingAppointmentAnnotation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **annotationId** | **String**| The ID of the annotation. | 
{: class="table-striped"}


### Return type

[**CoachingAnnotation**](CoachingAnnotation)


# **getCoachingAppointmentAnnotations**


> [CoachingAnnotationList](CoachingAnnotationList) getCoachingAppointmentAnnotations(appointmentId, pageNumber, pageSize)

Get a list of annotations.

You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can view private annotations).

Wraps GET /api/v2/coaching/appointments/{appointmentId}/annotations  

Requires ANY permissions: 

* coaching:annotation:view
* coaching:privateAnnotation:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    CoachingAnnotationList result = apiInstance.getCoachingAppointmentAnnotations(appointmentId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingAppointmentAnnotations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**CoachingAnnotationList**](CoachingAnnotationList)


# **getCoachingAppointmentStatuses**


> [CoachingAppointmentStatusResponseList](CoachingAppointmentStatusResponseList) getCoachingAppointmentStatuses(appointmentId, pageNumber, pageSize)

Get the list of status changes for a coaching appointment.

Permission not required if you are an attendee, creator or facilitator of the appointment

Wraps GET /api/v2/coaching/appointments/{appointmentId}/statuses  

Requires ANY permissions: 

* coaching:appointmentStatus:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
try {
    CoachingAppointmentStatusResponseList result = apiInstance.getCoachingAppointmentStatuses(appointmentId, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingAppointmentStatuses");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
{: class="table-striped"}


### Return type

[**CoachingAppointmentStatusResponseList**](CoachingAppointmentStatusResponseList)


# **getCoachingAppointments**


> [CoachingAppointmentResponseList](CoachingAppointmentResponseList) getCoachingAppointments(userIds, interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue, intervalCondition)

Get appointments for users and optional date range

Wraps GET /api/v2/coaching/appointments  

Requires ANY permissions: 

* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
List<String> userIds = Arrays.asList(null); // List<String> | The user IDs for which to retrieve appointments
String interval = "interval_example"; // String | Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> statuses = Arrays.asList(null); // List<String> | Appointment Statuses to filter by
List<String> facilitatorIds = Arrays.asList(null); // List<String> | The facilitator IDs for which to retrieve appointments
String sortOrder = "sortOrder_example"; // String | Sort (by due date) either Asc or Desc
List<String> relationships = Arrays.asList(null); // List<String> | Relationships to filter by
String completionInterval = "completionInterval_example"; // String | Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "overdue_example"; // String | Overdue status to filter by
String intervalCondition = "intervalCondition_example"; // String | Filter condition for interval
try {
    CoachingAppointmentResponseList result = apiInstance.getCoachingAppointments(userIds, interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue, intervalCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingAppointments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userIds** | [**List&lt;String&gt;**](String)| The user IDs for which to retrieve appointments | 
| **interval** | **String**| Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **statuses** | [**List&lt;String&gt;**](String)| Appointment Statuses to filter by | [optional]<br />**Values**: Scheduled, InProgress, Completed, InvalidSchedule 
| **facilitatorIds** | [**List&lt;String&gt;**](String)| The facilitator IDs for which to retrieve appointments | [optional] 
| **sortOrder** | **String**| Sort (by due date) either Asc or Desc | [optional]<br />**Values**: Desc, Asc 
| **relationships** | [**List&lt;String&gt;**](String)| Relationships to filter by | [optional]<br />**Values**: Creator, Facilitator, Attendee 
| **completionInterval** | **String**| Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Overdue status to filter by | [optional]<br />**Values**: True, False, Any 
| **intervalCondition** | **String**| Filter condition for interval | [optional]<br />**Values**: StartsIn, Overlaps 
{: class="table-striped"}


### Return type

[**CoachingAppointmentResponseList**](CoachingAppointmentResponseList)


# **getCoachingAppointmentsMe**


> [CoachingAppointmentResponseList](CoachingAppointmentResponseList) getCoachingAppointmentsMe(interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue, intervalCondition)

Get my appointments for a given date range

Wraps GET /api/v2/coaching/appointments/me  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String interval = "interval_example"; // String | Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> statuses = Arrays.asList(null); // List<String> | Appointment Statuses to filter by
List<String> facilitatorIds = Arrays.asList(null); // List<String> | The facilitator IDs for which to retrieve appointments
String sortOrder = "sortOrder_example"; // String | Sort (by due date) either Asc or Desc
List<String> relationships = Arrays.asList(null); // List<String> | Relationships to filter by
String completionInterval = "completionInterval_example"; // String | Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
String overdue = "overdue_example"; // String | Overdue status to filter by
String intervalCondition = "intervalCondition_example"; // String | Filter condition for interval
try {
    CoachingAppointmentResponseList result = apiInstance.getCoachingAppointmentsMe(interval, pageNumber, pageSize, statuses, facilitatorIds, sortOrder, relationships, completionInterval, overdue, intervalCondition);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingAppointmentsMe");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **interval** | **String**| Interval to filter data by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **statuses** | [**List&lt;String&gt;**](String)| Appointment Statuses to filter by | [optional]<br />**Values**: Scheduled, InProgress, Completed, InvalidSchedule 
| **facilitatorIds** | [**List&lt;String&gt;**](String)| The facilitator IDs for which to retrieve appointments | [optional] 
| **sortOrder** | **String**| Sort (by due date) either Asc or Desc | [optional]<br />**Values**: Desc, Asc 
| **relationships** | [**List&lt;String&gt;**](String)| Relationships to filter by | [optional]<br />**Values**: Creator, Facilitator, Attendee 
| **completionInterval** | **String**| Appointment completion start and end to filter by. End date is not inclusive. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss | [optional] 
| **overdue** | **String**| Overdue status to filter by | [optional]<br />**Values**: True, False, Any 
| **intervalCondition** | **String**| Filter condition for interval | [optional]<br />**Values**: StartsIn, Overlaps 
{: class="table-striped"}


### Return type

[**CoachingAppointmentResponseList**](CoachingAppointmentResponseList)


# **getCoachingNotification**


> [CoachingNotification](CoachingNotification) getCoachingNotification(notificationId, expand)

Get an existing notification

Permission not required if you are the owner of the notification.

Wraps GET /api/v2/coaching/notifications/{notificationId}  

Requires ANY permissions: 

* coaching:notification:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String notificationId = "notificationId_example"; // String | The ID of the notification.
List<String> expand = Arrays.asList(null); // List<String> | Indicates a field in the response which should be expanded.
try {
    CoachingNotification result = apiInstance.getCoachingNotification(notificationId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingNotification");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationId** | **String**| The ID of the notification. | 
| **expand** | [**List&lt;String&gt;**](String)| Indicates a field in the response which should be expanded. | [optional]<br />**Values**: appointment 
{: class="table-striped"}


### Return type

[**CoachingNotification**](CoachingNotification)


# **getCoachingNotifications**


> [CoachingNotificationList](CoachingNotificationList) getCoachingNotifications(pageNumber, pageSize, expand)

Retrieve the list of your notifications.

Wraps GET /api/v2/coaching/notifications  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
Integer pageNumber = 1; // Integer | Page number
Integer pageSize = 25; // Integer | Page size
List<String> expand = Arrays.asList(null); // List<String> | Indicates a field in the response which should be expanded.
try {
    CoachingNotificationList result = apiInstance.getCoachingNotifications(pageNumber, pageSize, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingNotifications");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pageNumber** | **Integer**| Page number | [optional] [default to 1] 
| **pageSize** | **Integer**| Page size | [optional] [default to 25] 
| **expand** | [**List&lt;String&gt;**](String)| Indicates a field in the response which should be expanded. | [optional]<br />**Values**: appointment 
{: class="table-striped"}


### Return type

[**CoachingNotificationList**](CoachingNotificationList)


# **getCoachingScheduleslotsJob**


> [CoachingScheduleSlotsJobResponse](CoachingScheduleSlotsJobResponse) getCoachingScheduleslotsJob(jobId)

Retrieve the status of the job for the slots where a coaching appointment can be scheduled.

Wraps GET /api/v2/coaching/scheduleslots/jobs/{jobId}  

Requires ANY permissions: 

* coaching:scheduleSlotJob:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String jobId = "jobId_example"; // String | The ID of job
try {
    CoachingScheduleSlotsJobResponse result = apiInstance.getCoachingScheduleslotsJob(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#getCoachingScheduleslotsJob");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobId** | **String**| The ID of job | 
{: class="table-striped"}


### Return type

[**CoachingScheduleSlotsJobResponse**](CoachingScheduleSlotsJobResponse)


# **patchCoachingAppointment**


> [CoachingAppointmentResponse](CoachingAppointmentResponse) patchCoachingAppointment(appointmentId, body)

Update an existing appointment

Permission not required if you are the creator or facilitator of the appointment

Wraps PATCH /api/v2/coaching/appointments/{appointmentId}  

Requires ANY permissions: 

* coaching:appointment:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
UpdateCoachingAppointmentRequest body = new UpdateCoachingAppointmentRequest(); // UpdateCoachingAppointmentRequest | The new version of the appointment
try {
    CoachingAppointmentResponse result = apiInstance.patchCoachingAppointment(appointmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#patchCoachingAppointment");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **body** | [**UpdateCoachingAppointmentRequest**](UpdateCoachingAppointmentRequest)| The new version of the appointment | 
{: class="table-striped"}


### Return type

[**CoachingAppointmentResponse**](CoachingAppointmentResponse)


# **patchCoachingAppointmentAnnotation**


> [CoachingAnnotation](CoachingAnnotation) patchCoachingAppointmentAnnotation(appointmentId, annotationId, body)

Update an existing annotation.

You must have the appropriate permission for the type of annotation you are updating. Permission not required if you are the creator or facilitator of the appointment

Wraps PATCH /api/v2/coaching/appointments/{appointmentId}/annotations/{annotationId}  

Requires ANY permissions: 

* coaching:annotation:edit
* coaching:privateAnnotation:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
String annotationId = "annotationId_example"; // String | The ID of the annotation.
CoachingAnnotation body = new CoachingAnnotation(); // CoachingAnnotation | The new version of the annotation
try {
    CoachingAnnotation result = apiInstance.patchCoachingAppointmentAnnotation(appointmentId, annotationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#patchCoachingAppointmentAnnotation");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **annotationId** | **String**| The ID of the annotation. | 
| **body** | [**CoachingAnnotation**](CoachingAnnotation)| The new version of the annotation | 
{: class="table-striped"}


### Return type

[**CoachingAnnotation**](CoachingAnnotation)


# **patchCoachingAppointmentStatus**


> [CoachingAppointmentStatusResponse](CoachingAppointmentStatusResponse) patchCoachingAppointmentStatus(appointmentId, body)

Update the status of a coaching appointment

Permission not required if you are an attendee, creator or facilitator of the appointment

Wraps PATCH /api/v2/coaching/appointments/{appointmentId}/status  

Requires ANY permissions: 

* coaching:appointmentStatus:edit

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
CoachingAppointmentStatusRequest body = new CoachingAppointmentStatusRequest(); // CoachingAppointmentStatusRequest | Updated status of the coaching appointment
try {
    CoachingAppointmentStatusResponse result = apiInstance.patchCoachingAppointmentStatus(appointmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#patchCoachingAppointmentStatus");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **body** | [**CoachingAppointmentStatusRequest**](CoachingAppointmentStatusRequest)| Updated status of the coaching appointment | 
{: class="table-striped"}


### Return type

[**CoachingAppointmentStatusResponse**](CoachingAppointmentStatusResponse)


# **patchCoachingNotification**


> [CoachingNotification](CoachingNotification) patchCoachingNotification(notificationId, body)

Update an existing notification.

Can only update your own notifications.

Wraps PATCH /api/v2/coaching/notifications/{notificationId}  

Requires NO permissions: 


### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String notificationId = "notificationId_example"; // String | The ID of the notification.
CoachingNotification body = new CoachingNotification(); // CoachingNotification | Change the read state of a notification
try {
    CoachingNotification result = apiInstance.patchCoachingNotification(notificationId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#patchCoachingNotification");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationId** | **String**| The ID of the notification. | 
| **body** | [**CoachingNotification**](CoachingNotification)| Change the read state of a notification | 
{: class="table-striped"}


### Return type

[**CoachingNotification**](CoachingNotification)


# **postCoachingAppointmentAnnotations**


> [CoachingAnnotation](CoachingAnnotation) postCoachingAppointmentAnnotations(appointmentId, body)

Create a new annotation.

You must have the appropriate permission for the type of annotation you are creating. Permission not required if you are related to the appointment (only the creator or facilitator can create private annotations).

Wraps POST /api/v2/coaching/appointments/{appointmentId}/annotations  

Requires ANY permissions: 

* coaching:annotation:add
* coaching:privateAnnotation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
CoachingAnnotationCreateRequest body = new CoachingAnnotationCreateRequest(); // CoachingAnnotationCreateRequest | The annotation to add
try {
    CoachingAnnotation result = apiInstance.postCoachingAppointmentAnnotations(appointmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#postCoachingAppointmentAnnotations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **body** | [**CoachingAnnotationCreateRequest**](CoachingAnnotationCreateRequest)| The annotation to add | 
{: class="table-striped"}


### Return type

[**CoachingAnnotation**](CoachingAnnotation)


# **postCoachingAppointmentConversations**


> [AddConversationResponse](AddConversationResponse) postCoachingAppointmentConversations(appointmentId, body)

Add a conversation to an appointment

Permission not required if you are the creator or facilitator of the appointment

Wraps POST /api/v2/coaching/appointments/{appointmentId}/conversations  

Requires ANY permissions: 

* coaching:appointment:edit
* coaching:appointmentConversation:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
String appointmentId = "appointmentId_example"; // String | The ID of the coaching appointment.
AddConversationRequest body = new AddConversationRequest(); // AddConversationRequest | body
try {
    AddConversationResponse result = apiInstance.postCoachingAppointmentConversations(appointmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#postCoachingAppointmentConversations");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appointmentId** | **String**| The ID of the coaching appointment. | 
| **body** | [**AddConversationRequest**](AddConversationRequest)| body | 
{: class="table-striped"}


### Return type

[**AddConversationResponse**](AddConversationResponse)


# **postCoachingAppointments**


> [CoachingAppointmentResponse](CoachingAppointmentResponse) postCoachingAppointments(body)

Create a new appointment

Wraps POST /api/v2/coaching/appointments  

Requires ANY permissions: 

* coaching:appointment:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
CreateCoachingAppointmentRequest body = new CreateCoachingAppointmentRequest(); // CreateCoachingAppointmentRequest | The appointment to add
try {
    CoachingAppointmentResponse result = apiInstance.postCoachingAppointments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#postCoachingAppointments");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CreateCoachingAppointmentRequest**](CreateCoachingAppointmentRequest)| The appointment to add | 
{: class="table-striped"}


### Return type

[**CoachingAppointmentResponse**](CoachingAppointmentResponse)


# **postCoachingAppointmentsAggregatesQuery**


> [CoachingAppointmentAggregateResponse](CoachingAppointmentAggregateResponse) postCoachingAppointmentsAggregatesQuery(body)

Retrieve aggregated appointment data

Wraps POST /api/v2/coaching/appointments/aggregates/query  

Requires ANY permissions: 

* coaching:appointment:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
CoachingAppointmentAggregateRequest body = new CoachingAppointmentAggregateRequest(); // CoachingAppointmentAggregateRequest | Aggregate Request
try {
    CoachingAppointmentAggregateResponse result = apiInstance.postCoachingAppointmentsAggregatesQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#postCoachingAppointmentsAggregatesQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CoachingAppointmentAggregateRequest**](CoachingAppointmentAggregateRequest)| Aggregate Request | 
{: class="table-striped"}


### Return type

[**CoachingAppointmentAggregateResponse**](CoachingAppointmentAggregateResponse)


# **postCoachingScheduleslotsJobs**


> [CoachingScheduleSlotsJobResponse](CoachingScheduleSlotsJobResponse) postCoachingScheduleslotsJobs(body)

Start job to retrieve the slots where a coaching appointment can be scheduled.

Wraps POST /api/v2/coaching/scheduleslots/jobs  

Requires ANY permissions: 

* coaching:scheduleSlotJob:add

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
CoachingScheduleSlotsJobRequest body = new CoachingScheduleSlotsJobRequest(); // CoachingScheduleSlotsJobRequest | The slots search request
try {
    CoachingScheduleSlotsJobResponse result = apiInstance.postCoachingScheduleslotsJobs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#postCoachingScheduleslotsJobs");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CoachingScheduleSlotsJobRequest**](CoachingScheduleSlotsJobRequest)| The slots search request | 
{: class="table-striped"}


### Return type

[**CoachingScheduleSlotsJobResponse**](CoachingScheduleSlotsJobResponse)


# **postCoachingScheduleslotsQuery**


> [CoachingSlotsResponse](CoachingSlotsResponse) postCoachingScheduleslotsQuery(body)

Get list of possible slots where a coaching appointment can be scheduled.

Wraps POST /api/v2/coaching/scheduleslots/query  

Requires ANY permissions: 

* coaching:scheduleSlot:view

### Example

```{"language":"java"}
//Import classes:
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.auth.*;
import com.mypurecloud.sdk.v2.api.CoachingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.com")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);

CoachingApi apiInstance = new CoachingApi();
CoachingSlotsRequest body = new CoachingSlotsRequest(); // CoachingSlotsRequest | The slot search request
try {
    CoachingSlotsResponse result = apiInstance.postCoachingScheduleslotsQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CoachingApi#postCoachingScheduleslotsQuery");
    e.printStackTrace();
}
```

### Parameters


| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**CoachingSlotsRequest**](CoachingSlotsRequest)| The slot search request | 
{: class="table-striped"}


### Return type

[**CoachingSlotsResponse**](CoachingSlotsResponse)


_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
