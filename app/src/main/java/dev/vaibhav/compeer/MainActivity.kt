package dev.vaibhav.compeer

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		 setContentView(R.layout.activity_main)
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
		
		Log.d(TAG, "onCreate")
		
		
	}
	
	override fun onRestart() {
		super.onRestart()
		Log.d(TAG, "onRestart")
		
	}
	
	override fun onStart() {
		super.onStart()
		Log.d(TAG, "onStart")
		
	}
	
	override fun onPause() {
		super.onPause()
		Log.d(TAG, "onPause")
		
	}
	
	override fun onResume() {
		super.onResume()
		Log.d(TAG, "onResume")
	}
	
	override fun onRestoreInstanceState(savedInstanceState: Bundle) {
		super.onRestoreInstanceState(savedInstanceState)
		Log.d(TAG, "onRestoreInstanceState")
	}
	
	companion object {
		private const val TAG = "MainActivity"
	}
}
