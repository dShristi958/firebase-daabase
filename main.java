import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FirebaseUpload {
    public static void main(String[] args) {
        try {
            // Path to Firebase private key JSON file
            FileInputStream serviceAccount = new FileInputStream("path/to/your-firebase-adminsdk.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://your-database-name.firebaseio.com/") // Change this
                    .build();

            // Initialize Firebase
            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }

            // Get database reference
            DatabaseReference databaseRef = FirebaseDatabase.getInstance().getReference("users");

            // Example data to upload
            Map<String, Object> userData = new HashMap<>();
            userData.put("name", "John Doe");
            userData.put("email", "johndoe@example.com");
            userData.put("age", 25);

            // Push data to Firebase
            databaseRef.push().setValueAsync(userData);

            System.out.println("Data uploaded successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
