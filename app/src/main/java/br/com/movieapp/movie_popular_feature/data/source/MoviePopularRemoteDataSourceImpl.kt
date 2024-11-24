package br.com.movieapp.movie_popular_feature.data.source

import br.com.movieapp.core.data.remote.MovieService
import br.com.movieapp.core.data.remote.response.MovieResponse
import br.com.movieapp.movie_popular_feature.domain.source.MoviePopularRemoteDataSource

class MoviePopularRemoteDataSourceImpl constructor(private val service: MovieService) :
    MoviePopularRemoteDataSource {

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return service.getPopularMovies(page)

    }
}