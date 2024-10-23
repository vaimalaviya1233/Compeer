package dev.vaibhav.compeer

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri


class SampleProvider : ContentProvider() {
	override fun delete(
		uri: Uri,
		selection: String?,
		selectionArgs: Array<String>?,
	): Int {
		return 0
	}
	
	override fun onCreate(): Boolean {
		return false
	}
	
	override fun query(
		uri: Uri,
		projection: Array<String>?,
		selection: String?,
		selectionArgs: Array<String>?,
		sortOrder: String?,
	): Cursor {
		val c = MatrixCursor(arrayOf("Kode", "Description"))
		c.addRow(arrayOf("\$df(S)$", "Seconds since epoch"))
		c.addRow(arrayOf("\$df(yyyy)$", "Current year"))
		c.addRow(arrayOf("\$df(yyyy-MM-dd)$", "Current date"))
		c.addRow(arrayOf("\$df(\"EEEE, d MMM yyyy\")$", "Current date with day of week"))
		c.addRow(arrayOf("\$df(\"EEEE, yyyy-MM-dd hh:mm:ss\")$", "Current date with day of week with current time with seconds"))
		return c
	}
	
	override fun getType(
		uri: Uri,
	): String? {
		return null
	}
	
	override fun insert(
		uri: Uri,
		values: ContentValues?,
	): Uri? {
		return null
	}
	
	override fun update(
		uri: Uri,
		values: ContentValues?,
		selection: String?,
		selectionArgs: Array<String>?,
	): Int {
		return 0
	}
}
