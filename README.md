Firebase Data Upload in Java
This project demonstrates how to upload data to Firebase Realtime Database using the Firebase Admin SDK in Java.

Prerequisites
Java 8+
Firebase Project with Realtime Database enabled
Firebase Admin SDK setup
Maven or manual dependency setup
Setup
Create a Firebase Project at Firebase Console.
Generate a Service Account Key in Project Settings → Service Accounts.
Add Firebase Admin SDK:
Maven: Add to pom.xml:
<dependency>
    <groupId>com.google.firebase</groupId>
    <artifactId>firebase-admin</artifactId>
    <version>9.2.0</version>
</dependency>
Manual: Download and add the SDK to your project.
Update FirebaseUpload.java:
Set the correct path to the service account key.
Replace the database URL with your Firebase URL.
Run
Clone or download this repo.
Compile and run FirebaseUpload.java to upload example data to Firebase.
Code Overview
Firebase Initialization: Using the service account key.
Uploading Data: Uploads sample user data to Firebase Realtime Database under "users".
Troubleshooting
Verify the correct service account key and database URL if you encounter errors.
