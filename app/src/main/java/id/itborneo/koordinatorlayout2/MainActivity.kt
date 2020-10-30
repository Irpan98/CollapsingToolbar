package id.itborneo.koordinatorlayout2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        collapsing_toolbar.title = "IRPAN TEST"


        //when collapse jadi kecil
        collapsing_toolbar.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white))

        //when expanded jadi gede. jadi dihilangan tulisan dengan transparent
        collapsing_toolbar.setExpandedTitleColor(
                ContextCompat.getColor(this, android.R.color.transparent))
    }
}