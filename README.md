# PocketRepo

**PocketRepo** is a FOSS Android app that turns your phone into a portable F-Droid repository server. Users can curate and share apps locally over Wi-Fi without central infrastructure.

## Features

- **Repo Management**: Create and manage multiple repository profiles.
- **App Selection**: Share installed apps or import APKs from storage.
- **F-Droid Compatible**: Generates signed `index.jar` and `index.xml` compliant with F-Droid standards.
- **Local Sharing**: Embedded Ktor server for LAN-based distribution with QR code support.

## Architecture

- **Language**: Kotlin
- **UI**: Jetpack Compose
- **Server**: Ktor
- **Database**: Room
- **DI**: Hilt

## Getting Started

1. Clone the repository.
2. Open in Android Studio (Flamingo or newer).
3. Build and run on an Android 8.0+ device.

## License

This project is licensed under the AGPL-3.0 License.
