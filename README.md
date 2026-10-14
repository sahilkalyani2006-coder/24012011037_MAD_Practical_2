# MAD Practical 2 – Activity Life Cycle and Basic UI


## AIM

Create an Android Application to demonstrate the functions of the **Activity Life Cycle** and **Basic UI**.

The application displays **"Hello World"** in the center of the Activity screen with a yellow background. The TextView uses Holo Blue color, 27sp font size, and bold-italic text style.

The application also demonstrates Activity Life Cycle methods using:

- Log messages in Logcat
- Toast messages
- Snackbar messages

All Activity Life Cycle methods are printed in Logcat.

---

## Objectives

1. Create a basic Android Activity.
2. Display **Hello World** using a `TextView`.
3. Set the Activity layout background to yellow.
4. Apply the required TextView properties.
5. Understand the Activity Life Cycle.
6. Display Life Cycle events using Logcat.
7. Display Toast messages.
8. Display Snackbar messages.
9. Understand ConstraintLayout properties.
10. Generate and use an ID for the TextView.

---

## UI Requirements

The TextView is configured with the following properties:

| Property | Value |
|---|---|
| Text | `Hello World` |
| Background | `#FFFF00` |
| Text Color | `@android:color/holo_blue_bright` |
| Text Size | `27sp` |
| Text Style | `bold\|italic` |
| Alignment | Center |

---

## Activity Life Cycle

The main Activity demonstrates these life cycle methods:

```text
onCreate()
onStart()
onResume()
onPause()
onStop()
onRestart()
onDestroy()
```

### Life Cycle Flow

```text
onCreate()
    ↓
onStart()
    ↓
onResume()
    ↓
Activity Running
    ↓
onPause()
    ↓
onStop()
    ↓
onDestroy()

If Activity comes back after onStop():

onRestart()
    ↓
onStart()
    ↓
onResume()
```

---

## XML Layout

Example `activity_main.xml`:

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFF00">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World"
        android:textColor="@android:color/holo_blue_bright"
        android:textSize="27sp"
        android:textStyle="bold|italic"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

---

## Kotlin Implementation

Example `MainActivity.kt`:

```kotlin
package com.example.a24012021005_practical2

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate called")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        val rootView = findViewById<android.view.View>(R.id.main)
        Snackbar.make(rootView, "Activity Created", Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart called")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume called")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause called")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop called")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart called")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy called")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }
}
```

> **Note:** The exact implementation in the GitHub repository may differ from this example. This README documents the practical requirements and a representative implementation based on the practical statement provided.

---

## Messages Used

### Log Message

The `Log` class is used to print Activity Life Cycle events in **Logcat**.

Example:

```kotlin
Log.d(TAG, "onCreate called")
```

### Toast Message

Toast displays a short message to the user.

Example:

```kotlin
Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
```

### Snackbar Message

Snackbar displays a brief message at the bottom of the screen.

Example:

```kotlin
Snackbar.make(rootView, "Activity Created", Snackbar.LENGTH_SHORT).show()
```

---

## How to Test Activity Life Cycle

1. Run the application.
2. Check the **Logcat** window.
3. Observe:
   - `onCreate`
   - `onStart`
   - `onResume`
4. Press the **Home** button or move the app to the background.
5. Observe:
   - `onPause`
   - `onStop`
6. Open the application again.
7. Observe:
   - `onRestart`
   - `onStart`
   - `onResume`
8. Close the Activity/application and observe the appropriate destruction event.

---

## Expected Output

The application should display:

```text
Hello World
```

with:

- Yellow Activity background
- Holo Blue text
- 27sp font size
- Bold and italic style
- Text centered on the screen

Activity Life Cycle events should be visible in **Logcat**, and Toast/Snackbar messages should appear during the corresponding events.

---

## Study Topics

- TextView and its properties
- Toast Message
- Snackbar Message
- Android built-in resources
- Activity Life Cycle
- Log Message in Logcat
- ConstraintLayout properties
- Generating and using TextView ID

---

## Technologies Used

- **Language:** Kotlin
- **IDE:** Android Studio
- **UI:** XML
- **Layout:** ConstraintLayout
- **Platform:** Android

---

## Conclusion

This practical demonstrates how to create a basic Android user interface and understand the **Activity Life Cycle**. It also demonstrates how to use **Logcat, Toast, and Snackbar messages** to observe and communicate Activity state changes.

---
