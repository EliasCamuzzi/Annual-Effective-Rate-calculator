package mi.primer.calculadoradetasaefectivaanual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_page.*

class Web_Page : AppCompatActivity() {

    private val estaEsLaURL = "https://www.ambito.com/contenidos/dolar.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_page)

        Vista_Web.webChromeClient = object : WebChromeClient() {

        }

        Vista_Web.webViewClient = object : WebViewClient() {

        }

        val settings = Vista_Web.settings
        settings.javaScriptEnabled = true

        Vista_Web.loadUrl(estaEsLaURL)
    }
}