package br.com.movieapp.movie_popular_feature.domain.usecase

import androidx.paging.PagingConfig
import androidx.paging.PagingData
import br.com.movieapp.core.domain.model.Movie
import br.com.movieapp.core.util.UtilFunctions
import br.com.movieapp.movie_popular_feature.domain.repository.MoviePopularRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.count
import javax.inject.Inject

interface GetPopularMovieUseCase {

    operator fun invoke(): Flow<PagingData<Movie>>
}


class GetPopularMovieUseCaseImpl  @Inject constructor(private val repository: MoviePopularRepository): GetPopularMovieUseCase{
    override fun invoke(): Flow<PagingData<Movie>> {


        return repository.getPopularMovies(pagingConfig = PagingConfig(pageSize = 20, initialLoadSize = 20, ))
    }

}

