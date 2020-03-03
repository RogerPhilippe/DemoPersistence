package br.com.fiap.rpp.demopersistence.ui.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.rpp.demopersistence.R
import br.com.fiap.rpp.demopersistence.ui.form.FormActivity
import br.com.fiap.rpp.demopersistence.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnDB.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        btnSharePrefs.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }

        btnClose.setOnClickListener { finish() }

    }
}
