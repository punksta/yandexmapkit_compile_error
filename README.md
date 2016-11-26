# yandexmapkit_compile_error
Android project(sdk 25) with dagger2 (2.8) and kotlin (1.0.5-2)

compile error:
```
:app:compileDebugJavaWithJavac
Destination for generated sources was modified by kapt. Previous value = /home/punksta/projects/TestYandexMapKotlin/app/build/generated/source/apt/debug
:app:compileDebugKotlinAfterJava
e: Supertypes of the following classes cannot be resolved. Please make sure you have the required dependencies in the classpath:
    class ru.yandex.yandexmapkit.MapController, unresolved supertypes: StartupListener
```

reproduce 

```
git clone https://github.com/punksta/yandexmapkit_compile_error.git
cd yandexmapkit_compile_error
./gradlew clean app:assembleDebug
```
