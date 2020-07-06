package cristache.georgian.cristian.androidcleanexample.alarms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import cristache.georgian.cristian.androidcleanexample.R

class AlarmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarms_activity)

        val navController: NavController = findNavController(R.id.nav_host_fragment)
    }
}
