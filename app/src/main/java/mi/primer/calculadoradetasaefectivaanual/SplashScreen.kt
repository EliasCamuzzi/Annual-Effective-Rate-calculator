package mi.primer.calculadoradetasaefectivaanual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Timer("SettingUp", false).schedule(1000) {
            IrALaSiguienteActivity()
        }

    }

    fun IrALaSiguienteActivity() {
        val irALaSiguienteActivity = Intent(this, MainActivity::class.java)
        startActivity(irALaSiguienteActivity)
    }
}