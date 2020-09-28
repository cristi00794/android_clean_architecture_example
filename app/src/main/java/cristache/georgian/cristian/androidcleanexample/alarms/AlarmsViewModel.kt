package cristache.georgian.cristian.androidcleanexample.alarms

import androidx.lifecycle.*
import cristache.georgian.cristian.androidcleanexample.data.Alarm
import kotlinx.coroutines.launch

class AlarmsViewModel : ViewModel() {

    private val _forceUpdate = MutableLiveData<Boolean>(false)

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading

    private val _items: LiveData<List<Alarm>> = _forceUpdate.switchMap { forceUpdate ->
        if (forceUpdate) {
            _dataLoading.value = true
            viewModelScope.launch {
                alarmRepository.refreshTasks()
                _dataLoading.value = false
            }
        }
        alarmRepository.observeTasks().distinctUntilChanged().switchMap { checkResult(it) }
    }

    private fun checkResult(result: Result<List<Alarm>>) : LiveData<List<Alarm>> = liveData {
        //TODO - daca e eraore
        //TODO - daca e ok
        //TODO - afisat raspuns
    }

    val items: LiveData<List<Alarm>> = _items


}