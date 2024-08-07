package ru.practicum.android.diploma.di

import org.koin.dsl.module
import ru.practicum.android.diploma.domain.SearchInteractor
import ru.practicum.android.diploma.domain.impl.SearchInteractorImpl

val interactorModule = module {
    factory<SearchInteractor> {
        SearchInteractorImpl(repository = get())
    }
}
