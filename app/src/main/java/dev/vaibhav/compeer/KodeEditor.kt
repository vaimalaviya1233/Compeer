package dev.vaibhav.compeer

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KodeEditor : AppCompatActivity(), View.OnClickListener {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_kode_editor)
		// When Send Kode button is clicked we send the data back to Kustom
		findViewById<View>(R.id.kode_replace).setOnClickListener(this)
		findViewById<View>(R.id.kode_append).setOnClickListener(this)
		// Set current text from source activity and change it a bit
		if (intent != null) {
			val text = intent.getStringExtra("org.kustom.extra.KODE")
			if (text != null) {
				(findViewById<View>(R.id.kode_edit) as TextView).text =
					"$text EDITED!"
			}
		}
	}
	
	override fun onClick(v: View) {
		val i = Intent()
		//String kode = ((TextView) findViewById(R.id.kode_edit)).getEditableText().toString();
		val kode = "My edited Kode"
		i.putExtra("org.kustom.KODE", kode)
		// Weather to append or not result in the calling editor
		i.putExtra("org.kustom.extra.APPEND", v.id == R.id.kode_append)
		setResult(RESULT_OK, i)
		finish()
	}
}
