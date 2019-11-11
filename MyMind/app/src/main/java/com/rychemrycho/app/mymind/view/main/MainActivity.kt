package com.rychemrycho.app.mymind.view.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.rychemrycho.app.mymind.R
import com.rychemrycho.app.mymind.base.BaseActivity
import com.rychemrycho.app.mymind.view.search.SearchActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomAppBar.setNavigationOnClickListener {
            navigationDrawer.openDrawer(GravityCompat.START)
        }

        bottomAppBar.setOnMenuItemClickListener {
            when {
                it.itemId == R.id.item_search -> {
                    val intent = Intent(this, SearchActivity::class.java)
                    startActivity(intent)
                }
                it.itemId == R.id.item_option -> {
//                    Toast.makeText(this, it.title, Toast.LENGTH_LONG).show()
                    val bottomSheetDialog = BottomSheetDialog(this)
                    val view: View = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
                    bottomSheetDialog.setContentView(view)
                    bottomSheetDialog.show()
                }
            }

            true
        }

        calendarView.setOnDateChangeListener{
                _, year, month, date -> Toast.makeText(this, "Tanggal $date bulan ${month + 1} tahun $year", Toast.LENGTH_LONG).show()
        }

        fabShowCreateOption.setOnClickListener {
//            Toast.makeText(this, "FAB", Toast.LENGTH_LONG).show()
            val bottomSheetDialog = BottomSheetDialog(this)
            val view: View = layoutInflater.inflate(R.layout.bottom_sheet_create_dialog, null)
            bottomSheetDialog.setContentView(view)
            bottomSheetDialog.show()
        }
    }
}
