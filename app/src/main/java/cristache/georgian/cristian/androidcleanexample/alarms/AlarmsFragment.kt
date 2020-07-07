package cristache.georgian.cristian.androidcleanexample.alarms

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

import cristache.georgian.cristian.androidcleanexample.databinding.AlarmsFragmentBinding

class AlarmsFragment : Fragment() {

    private lateinit var viewDataBinding: AlarmsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = AlarmsFragmentBinding.inflate(inflater, container, false).apply {
            //viewmodel = viewModel
        }
        setHasOptionsMenu(true)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.saveTaskFab.setOnClickListener { addNewAlarm() }
    }

    fun addNewAlarm(){
        val action = AlarmsFragmentDirections.actionAlarmsFragmentToAlarmDetailFragment(99)
        findNavController().navigate(action)
    }
}
