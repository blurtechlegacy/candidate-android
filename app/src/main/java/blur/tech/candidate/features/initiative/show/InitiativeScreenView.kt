package blur.tech.candidate.features.initiative.show

import com.arellomobile.mvp.MvpView

interface InitiativeScreenView: MvpView{
    fun likeDone()
    fun showMessage(s: String)

}
