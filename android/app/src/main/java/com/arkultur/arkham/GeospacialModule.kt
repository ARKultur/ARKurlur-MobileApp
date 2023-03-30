package com.arkultur.arkham
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log

class GeospacialModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "Geospacial"

    @ReactMethod(isBlockingSynchronousMethod = false)
    fun createCalendarEvent(name: String, location: String) {
        
        Log.d("GeospacialModule", "Create event called with name: $name and location: $location")
    }
}
