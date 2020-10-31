package com.example.hackapp1

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main__dash_board.*


class Main_DashBoard : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main__dash_board)

        toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.nav_drawer_main)
        navView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.open,
            R.string.close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener(this)

        schedule_card.setOnClickListener {
            intent = Intent(this, scheduling_main::class.java);
            startActivity(intent)
        }

        reports_card.setOnClickListener {
            intent = Intent(this, reports_main::class.java);
            startActivity(intent)
        }

        medication_card.setOnClickListener {
            intent = Intent(this, medication_main::class.java);
            startActivity(intent)
        }

        achivements_card.setOnClickListener {
            intent = Intent(this, achivements_main::class.java);
            startActivity(intent)
        }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.nav_schedule_btn -> Toast.makeText(this,"clicked", Toast.LENGTH_SHORT).show()
            R.id.nav_report_btn -> {
                this.startActivity(Intent(this, reports_main::class.java))
            }

            R.id.nav_achievements_btn -> {
                this.startActivity(Intent(this, achivements_main::class.java))
            }
            R.id.nav_medication_btn -> {
                this.startActivity(Intent(this, medication_main::class.java))
            }
            R.id.nav_profile_btn -> {
                this.startActivity(Intent(this, scheduling_main::class.java))
            }

        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}