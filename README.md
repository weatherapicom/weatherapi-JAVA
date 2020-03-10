# Getting started


# Introduction

WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy.

We provide following data through our API:

  * Real-time weather

  * 10 day weather forecast

  * Astronomy

  * Time zone

  * Location data

  * Search or Autocomplete API

  * NEW: Historical weather

# Getting Started

You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!

If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).

# Authentication

API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.

Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .

  ##  key parameter
  key=YOUR_API_KEY


## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

## How to Use

The following section explains how to use the WeatherAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *WeatherAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify WeatherAPI in ``` Group Id ``` and WeatherAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Weather%20API-Java&workspaceName=WeatherAPI&projectName=WeatherAPILib&rootNamespace=com.weatherapi.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *WeatherAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| key | TODO: add a description |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String key = "key";

WeatherAPIClient client = new WeatherAPIClient(key);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [APIsController](#ap_is_controller)

## <a name="ap_is_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.weatherapi.api.controllers.APIsController") APIsController

### Get singleton instance

The singleton instance of the ``` APIsController ``` class can be accessed from the API Client.

```java
APIsController aPIs = client.getAPIs();
```

### <a name="get_realtime_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getRealtimeWeatherAsync") getRealtimeWeatherAsync

> Current weather or realtime weather API method allows a user to get up to date current weather information in json and xml. The data is returned as a Current Object.Current object contains current or realtime weather information for a given city.


```java
void getRealtimeWeatherAsync(
        final String q,
        final String lang,
        final APICallBack<CurrentJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| lang |  ``` Optional ```  | Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. |


#### Example Usage

```java
String q = "q";
String lang = "lang";
// Invoking the API call with sample inputs
aPIs.getRealtimeWeatherAsync(q, lang, new APICallBack<CurrentJsonResponse>() {
    public void onSuccess(HttpContext context, CurrentJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_forecast_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getForecastWeatherAsync") getForecastWeatherAsync

> Forecast weather API method returns upto next 10 day weather forecast and weather alert as json. The data is returned as a Forecast Object.<br />Forecast object contains astronomy data, day weather forecast and hourly interval weather information for a given city.


```java
void getForecastWeatherAsync(
        final String q,
        final int days,
        final LocalDate dt,
        final Integer unixdt,
        final Integer hour,
        final String lang,
        final APICallBack<ForecastJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| days |  ``` Required ```  | Number of days of weather forecast. Value ranges from 1 to 10 |
| dt |  ``` Optional ```  | Date should be between today and next 10 day in yyyy-MM-dd format |
| unixdt |  ``` Optional ```  | Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be between today and next 10 day in Unix format |
| hour |  ``` Optional ```  | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6 |
| lang |  ``` Optional ```  | Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. |


#### Example Usage

```java
String q = "q";
int days = 243;
LocalDate dt = new Date();
Integer unixdt = 243;
Integer hour = 243;
String lang = "lang";
// Invoking the API call with sample inputs
aPIs.getForecastWeatherAsync(q, days, dt, unixdt, hour, lang, new APICallBack<ForecastJsonResponse>() {
    public void onSuccess(HttpContext context, ForecastJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_history_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getHistoryWeatherAsync") getHistoryWeatherAsync

> History weather API method returns historical weather for a date on or after 1st Jan, 2015 as json. The data is returned as a Forecast Object.


```java
void getHistoryWeatherAsync(
        final String q,
        final LocalDate dt,
        final Integer unixdt,
        final LocalDate endDt,
        final Integer unixendDt,
        final Integer hour,
        final String lang,
        final APICallBack<HistoryJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| dt |  ``` Required ```  | Date on or after 1st Jan, 2015 in yyyy-MM-dd format |
| unixdt |  ``` Optional ```  | Please either pass 'dt' or 'unixdt' and not both in same request.<br />unixdt should be on or after 1st Jan, 2015 in Unix format |
| endDt |  ``` Optional ```  | Date on or after 1st Jan, 2015 in yyyy-MM-dd format'end_dt' should be greater than 'dt' parameter and difference should not be more than 30 days between the two dates. |
| unixendDt |  ``` Optional ```  | Date on or after 1st Jan, 2015 in Unix Timestamp format<br />unixend_dt has same restriction as 'end_dt' parameter. Please either pass 'end_dt' or 'unixend_dt' and not both in same request. e.g.: unixend_dt=1490227200 |
| hour |  ``` Optional ```  | Must be in 24 hour. For example 5 pm should be hour=17, 6 am as hour=6 |
| lang |  ``` Optional ```  | Returns 'condition:text' field in API in the desired language. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to check 'lang-code'. |


#### Example Usage

```java
String q = "q";
LocalDate dt = new Date();
Integer unixdt = 243;
LocalDate endDt = new Date();
Integer unixendDt = 243;
Integer hour = 243;
String lang = "lang";
// Invoking the API call with sample inputs
aPIs.getHistoryWeatherAsync(q, dt, unixdt, endDt, unixendDt, hour, lang, new APICallBack<HistoryJsonResponse>() {
    public void onSuccess(HttpContext context, HistoryJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="search_autocomplete_weather_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.searchAutocompleteWeatherAsync") searchAutocompleteWeatherAsync

> WeatherAPI.com Search or Autocomplete API returns matching cities and towns as an array of Location object.


```java
void searchAutocompleteWeatherAsync(
        final String q,
        final APICallBack<List<SearchJsonResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
aPIs.searchAutocompleteWeatherAsync(q, new APICallBack<List<SearchJsonResponse>>() {
    public void onSuccess(HttpContext context, List<SearchJsonResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_ip_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getIpLookupAsync") getIpLookupAsync

> IP Lookup API method allows a user to get up to date information for an IP address.


```java
void getIpLookupAsync(
        final String q,
        final APICallBack<IpJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass IP address. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
aPIs.getIpLookupAsync(q, new APICallBack<IpJsonResponse>() {
    public void onSuccess(HttpContext context, IpJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_time_zone_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getTimeZoneAsync") getTimeZoneAsync

> Return Location Object


```java
void getTimeZoneAsync(
        final String q,
        final APICallBack<TimezoneJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
aPIs.getTimeZoneAsync(q, new APICallBack<TimezoneJsonResponse>() {
    public void onSuccess(HttpContext context, TimezoneJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



### <a name="get_astronomy_async"></a>![Method: ](https://apidocs.io/img/method.png "com.weatherapi.api.controllers.APIsController.getAstronomyAsync") getAstronomyAsync

> Return Location and Astronomy Object


```java
void getAstronomyAsync(
        final String q,
        final LocalDate dt,
        final APICallBack<AstronomyJsonResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more. |
| dt |  ``` Required ```  | Date on or after 1st Jan, 2015 in yyyy-MM-dd format |


#### Example Usage

```java
String q = "q";
LocalDate dt = new Date();
// Invoking the API call with sample inputs
aPIs.getAstronomyAsync(q, dt, new APICallBack<AstronomyJsonResponse>() {
    public void onSuccess(HttpContext context, AstronomyJsonResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Error code 1003: Parameter 'q' not provided.Error code 1005: API request url is invalid.Error code 1006: No location found matching parameter 'q'Error code 9999: Internal application error. |
| 401 | Error code 1002: API key not provided.Error code 2006: API key provided is invalid |
| 403 | Error code 2007: API key has exceeded calls per month quota.<br />Error code 2008: API key has been disabled. |



[Back to List of Controllers](#list_of_controllers)



