# fetch-android-interview

## Overview

This is an Android project developed as part of the interview process for Fetch.
The project demonstrates the use of modern Android development practices, including
`Clean Architecture`, `ViewModel`, `Coroutine`, and `RecyclerView`. I set up the project.
without `Dependency Injection` to keep the project light on libraries. 
Using `OKHttp` and `UseCases`to make calls to the server.

## Requirements

- Kotlin 1.5+
- OkHttp 4.9.3
- Gson 2.8.8

## Setup

1. **Clone the Repository**

```bash
   git clone git@github.com:cejimenez0123/fetch-android-interview.git
```
2. **Check gradle has the following dependencies**
```kotlin
dependencies {
    implementation(libs.okhttp)
    implementation(libs.gson)
}
```
3. **Sync**

```text
File > Sync Project with Gradle Files
```
4. **Run Application**

```text
Run > Run 'app'
```


## Features

- **RecyclerView**: Displays a list of items using a `RecyclerView` with an `Adapter` for efficient rendering.
- **ViewModel**: Handles data and business logic, ensuring that UI-related data survives configuration changes.
- **Coroutine-based Data Fetching**: Uses Kotlin coroutines for asynchronous operations and data fetching.


