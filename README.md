---
title: Platform API Client SDK - Java
---

Documentation can be found at [https://developer.mypurecloud.com/api/rest/client-libraries/java/latest/](https://developer.mypurecloud.com/api/rest/client-libraries/java/latest/)

[![platform-client-v2](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.mypurecloud/platform-client-v2)

## Install Using maven

Install the library from maven via the package [com.mypurecloud:platform-client](https://mvnrepository.com/artifact/com.mypurecloud/platform-client-v2)

## Using the Library

### Referencing the Library

Import the necessary packages:

~~~
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.api.UsersApi;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersEntityListing;
~~~

### Authenticating

The Java SDK does not currently contain helper methods to complete an OAuth flow. The consuming applicaiton must complete an OAuth flow to get an access token outside the scope of the SDK. Once an access token is obtained, it should be set on the SDK via constructing a new ApiClient instance. For more information about authenticating with OAuth, see the Developer Center article [Authorization](https://developer.mypurecloud.com/api/rest/authorization/index.html).

### Building an ApiClient Instance

`ApiClient` implements a builder pattern to construct new instances. Use the `ApiClient.Builder` class to set your access token and environment/base path (optional, defaults to `"https://api.mypurecloud.com"`):

~~~
// Create ApiClient instance
ApiClient apiClient = ApiClient.Builder.standard()
		.withAccessToken(accessToken)
		.withBasePath("https://api.mypurecloud.ie")
		.build();

// Use the ApiClient instance
Configuration.setDefaultApiClient(apiClient);
~~~

### Making Requests

There are two steps to making requests:

1. Instantiate one of the API classes in the com.mypurecloud.sdk.v2.api namespace
2. Invoke the methods on the API object

Example of getting the authenticated user's information:

~~~
UsersApi usersApi = new UsersApi();
UserMe me = usersApi.getUsersMe(Collections.singletonList("presence"));
System.out.println("Hello " + me.getName());
~~~

Request builders allow requests to be constructed by only providing values for the properties you want to set. This is useful for methods with long signatures when you only need to set some properties. Here's an example of the same request, but using a request builder:

~~~
UsersApi usersApi = new UsersApi();
GetUsersMeRequest request = GetUsersMeRequest.builder()
        .withExpand(Collections.singletonList("presence"))
        .build();
UserMe me = usersApi.getUsersMe(request);
System.out.println("Hello " + me.getName());
~~~

### SDK Source Code Generation

The source code for the SDK is created using the [swagger-codegen](https://github.com/MyPureCloud/swagger-codegen) project.
