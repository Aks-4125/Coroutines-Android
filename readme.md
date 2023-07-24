# NewsApp

NewsApp is an Android application that allows users to read news articles from various sources.

## Features

- Supports Android 13 (API 33) to Android 7.0 (API 24).
- MVVM Multimodule architecture using Android Views. (Without Jetpack Compose)
- Offline persist data using Room database.
- Pagination using Jetpack Paging 3.
- Multilingual support (English - French).
- Multi-device support (Phone - Tablet).
- Dedicated tablet layout for more detailed news information (News Description).
- Portrait-Landscape support.
- Espresso UI tests.
- JUnit Tests using MockK.
- Dynamic Filter support based on API response.

## Dependencies

The application uses the following major dependencies:

- AndroidX libraries for core functionality and UI components.
- [Dagger Hilt](https://dagger.dev/hilt/) for dependency injection.
- [Retrofit](https://square.github.io/retrofit/) for networking and API requests.
- [Moshi](https://github.com/square/moshi) for JSON deserialization.
- Coil for image loading.
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation) for handling app navigation.
- LeakCanary for memory leak detection.
- [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview) for smooth pagination of news articles.
- MockK and JUnit for unit testing.
- [Room](https://developer.android.com/training/data-storage/room) for local database storage.
- Kotlin Flow for reactive stream processing.

## Jetpack Components

The NewsApp project utilizes the following Jetpack components:

- [AndroidX Core](https://developer.android.com/jetpack/androidx/releases/core) - Core functionality for AndroidX libraries.
- [AppCompat](https://developer.android.com/jetpack/androidx/releases/appcompat) - Backward compatibility for newer Android features.
- [Material](https://developer.android.com/jetpack/androidx/releases/material) - Material Design components for a modern UI.
- [ConstraintLayout](https://developer.android.com/jetpack/androidx/releases/constraintlayout) - Layout manager for complex layouts.
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation) - Navigation for Jetpack Compose UI.
- [Room](https://developer.android.com/jetpack/androidx/releases/room) - SQLite database for local data storage.

## Getting Started

To build and run the project locally, follow these steps:

1. Download the Zip file and extract it.
2. Import the project in Android Studio.
3. Sync Gradle and build the project.
4. Run the app on an emulator or a physical device.

The NewsApp project is not using any commercial library - This is developed using Free and Open-Source third-party libraries.
