package blur.tech.candidate.core


import blur.tech.candidate.core.modules.ApiModule
import blur.tech.candidate.core.modules.SharedPreferencesModule
import dagger.Component
import tech.blur.redline.features.signin.SignInPresenter
import javax.inject.Singleton


@Singleton
@Component(modules = [ApiModule::class, SharedPreferencesModule::class])
interface AppComponent {
    fun inject(signInPresenter: SignInPresenter)
}

