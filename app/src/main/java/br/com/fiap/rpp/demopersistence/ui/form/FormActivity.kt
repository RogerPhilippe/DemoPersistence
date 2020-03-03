package br.com.fiap.rpp.demopersistence.ui.form

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.rpp.demopersistence.R
import br.com.fiap.rpp.demopersistence.utils.SharedPrefsHandler
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    private val nameKey: String = "name_key"

    private lateinit var prefsHandler: SharedPrefsHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        prefsHandler = SharedPrefsHandler(this)

        this.setupListener()

    }

    private fun setupListener() {

        btnSave.setOnClickListener {

            val value = editName.text.toString()
            if (value.isNotEmpty()) {
                prefsHandler.save(nameKey, value)
                editName.setText("")
                makeToast("Salvo!")
            }

        }

        btnLoad.setOnClickListener {

            val value = prefsHandler.load(nameKey)
            if (!value.isNullOrEmpty()) {
                editName.setText(value)
            }

        }

        btnClean.setOnClickListener {
            prefsHandler.clean()
            makeToast("Registro limpo!")
            editName.setText("")
        }

    }

    private fun makeToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}
