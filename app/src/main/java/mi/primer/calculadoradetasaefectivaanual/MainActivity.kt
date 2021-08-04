package mi.primer.calculadoradetasaefectivaanual

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        Capitalizaciones.visibility = View.INVISIBLE
        Calcular.visibility = View.INVISIBLE

        Opcion_Diaria.setOnClickListener {
            var tasaNominalAnualCadenaTexto: String = Tasa_Nominal_Anual.text.toString()

            if (tasaNominalAnualCadenaTexto.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Make sure to enter a value",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var capitalizacionDiaria: Int = 365

                var tasaNominalAnualPorcentaje: Double =
                    Tasa_Nominal_Anual.text.toString().toDouble()
                var tasaNominalAnualDecimal: Double = tasaNominalAnualPorcentaje / 100

                var resultado1: Double = tasaNominalAnualDecimal / capitalizacionDiaria

                var resultado2: Double = resultado1 + 1

                var resultado3: Double = Math.pow(resultado2, 365.0)

                var resultado4: Double = resultado3 - 1

                var resultado5: Double = resultado4 * 100

                var resultado6 = DecimalFormat("#.##")

                var resultado7 = resultado6.format(resultado5)

                Toast.makeText(
                    applicationContext,
                    "The annual effective rate will be %$resultado7",
                    Toast.LENGTH_LONG
                ).show()
            }

            System.gc()
        }

        Opcion_Semanal.setOnClickListener {
            var tasaNominalAnualCadenaTexto: String = Tasa_Nominal_Anual.text.toString()

            if (tasaNominalAnualCadenaTexto.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Make sure to enter a value",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var capitalizacionSemanal: Int = 52

                var tasaNominalAnualPorcentaje: Double =
                    Tasa_Nominal_Anual.text.toString().toDouble()
                var tasaNominalAnualDecimal: Double = tasaNominalAnualPorcentaje / 100

                var resultado1: Double = tasaNominalAnualDecimal / capitalizacionSemanal

                var resultado2: Double = resultado1 + 1

                var resultado3: Double = Math.pow(resultado2, 52.0)

                var resultado4: Double = resultado3 - 1

                var resultado5: Double = resultado4 * 100

                var resultado6 = DecimalFormat("#.##")

                var resultado7 = resultado6.format(resultado5)

                Toast.makeText(
                    applicationContext,
                    "The annual effective rate will be %$resultado7",
                    Toast.LENGTH_LONG
                ).show()
            }

            System.gc()
        }

        Opcion_Mensual.setOnClickListener {
            var tasaNominalAnualCadenaTexto: String = Tasa_Nominal_Anual.text.toString()

            if (tasaNominalAnualCadenaTexto.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Make sure to enter a value",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var capitalizacionMensual: Int = 12

                var tasaNominalAnualPorcentaje: Double =
                    Tasa_Nominal_Anual.text.toString().toDouble()
                var tasaNominalAnualDecimal: Double = tasaNominalAnualPorcentaje / 100

                var resultado1: Double = tasaNominalAnualDecimal / capitalizacionMensual

                var resultado2: Double = resultado1 + 1

                var resultado3: Double = Math.pow(resultado2, 12.0)

                var resultado4: Double = resultado3 - 1

                var resultado5: Double = resultado4 * 100

                var resultado6 = DecimalFormat("#.##")

                var resultado7 = resultado6.format(resultado5)

                Toast.makeText(
                    applicationContext,
                    "The annual effective rate will be %$resultado7",
                    Toast.LENGTH_LONG
                ).show()
            }

            System.gc()
        }

        Opcion_Trimestral.setOnClickListener {
            var tasaNominalAnualCadenaTexto: String = Tasa_Nominal_Anual.text.toString()

            if (tasaNominalAnualCadenaTexto.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Make sure to enter a value",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var capitalizacionTrimestral: Int = 4

                var tasaNominalAnualPorcentaje: Double =
                    Tasa_Nominal_Anual.text.toString().toDouble()
                var tasaNominalAnualDecimal: Double = tasaNominalAnualPorcentaje / 100

                var resultado1: Double = tasaNominalAnualDecimal / capitalizacionTrimestral

                var resultado2: Double = resultado1 + 1

                var resultado3: Double = Math.pow(resultado2, 4.0)

                var resultado4: Double = resultado3 - 1

                var resultado5: Double = resultado4 * 100

                var resultado6 = DecimalFormat("#.##")

                var resultado7 = resultado6.format(resultado5)

                Toast.makeText(
                    applicationContext,
                    "The annual effective rate will be %$resultado7",
                    Toast.LENGTH_LONG
                ).show()
            }

            System.gc()
        }

        Otra.setOnClickListener {
            Capitalizaciones.visibility = View.VISIBLE
            Calcular.visibility = View.VISIBLE

        }

        Calcular.setOnClickListener {
            var capitalizacionValorString: String = Capitalizaciones.text.toString()
            var tasaNominalAnualCadenaTexto: String = Tasa_Nominal_Anual.text.toString()

            if (capitalizacionValorString.equals("")) {
                Toast.makeText(
                    applicationContext,
                    "Make sure to enter all values",
                    Toast.LENGTH_LONG
                ).show()

            } else {
                if (tasaNominalAnualCadenaTexto.equals("")) {
                    Toast.makeText(
                        applicationContext,
                        "Make sure to enter all values",
                        Toast.LENGTH_LONG
                    ).show()

                } else {
                    var capitalizacionAEleccion: Double = capitalizacionValorString.toDouble()
                    var tasaNominalAnualPorcentaje: Double = Tasa_Nominal_Anual.text.toString().toDouble()
                    var tasaNominalAnualDecimal: Double = tasaNominalAnualPorcentaje / 100

                    var resultado1: Double = tasaNominalAnualDecimal / capitalizacionAEleccion

                    var resultado2: Double = resultado1 + 1

                    var resultado3: Double = Math.pow(resultado2, capitalizacionAEleccion)

                    var resultado4: Double = resultado3 - 1

                    var resultado5: Double = resultado4 * 100

                    var resultado6 = DecimalFormat("#.##")

                    var resultado7 = resultado6.format(resultado5)

                    Toast.makeText(
                        applicationContext,
                        "The annual effective rate will be %$resultado7",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            System.gc()
        }
    }
}