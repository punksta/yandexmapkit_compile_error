package com.punksta.apps.testyandexmapkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import dagger.Module
import dagger.Provides
import ru.yandex.yandexmapkit.MapController

import ru.yandex.yandexmapkit.MapView
import ru.yandex.yandexmapkit.map.MapEvent
import ru.yandex.yandexmapkit.map.OnMapListener
import javax.inject.Inject
import javax.inject.Singleton


@Module
class SingleModule {
    @Provides
    @Singleton
    fun providesStr() = ""
}

@Singleton
@Component(modules = arrayOf(SingleModule::class))
interface SingleComponent {
    fun inject(mainActivity: MainActivity);
}

class MainActivity : AppCompatActivity(), OnMapListener {

    @Inject() lateinit var str: String;

    override fun onMapActionEvent(p0: MapEvent?) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mapView = MapView(this, "")

        val conteoller: MapController = mapView.mapController

        conteoller.addMapListener(this)

        setContentView(R.layout.activity_main)
    }
}
