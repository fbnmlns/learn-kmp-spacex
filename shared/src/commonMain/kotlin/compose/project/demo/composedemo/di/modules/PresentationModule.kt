package compose.project.demo.composedemo.di.modules

import androidx.lifecycle.viewmodel.compose.viewModel
import compose.project.demo.composedemo.presentation.rocketLaunch.RocketLaunchViewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { RocketLaunchViewModel(get()) }
}