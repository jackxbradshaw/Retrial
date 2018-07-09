package com.matthewtamlin.retrial.dependencies.live

import dagger.Module
import dagger.Provides
import com.matthewtamlin.retrial.dependencies.live.ProjectBasedLiveDependenciesRepository
import org.gradle.api.Project
import javax.inject.Singleton

@Module
class LiveDependenciesRepositoryModule {
  @Provides
  @Singleton
  fun provideLiveDependenciesRepository(project: Project) = ProjectBasedLiveDependenciesRepository(project)
}