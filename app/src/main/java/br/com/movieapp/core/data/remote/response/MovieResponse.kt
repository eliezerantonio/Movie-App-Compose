package br.com.movieapp.core.data.remote.response

import br.com.movieapp.core.data.remote.model.SearchResult

data class MovieResponse(
    val page: Int,
    val results: List<SearchResult>,
    val total_pages: Int,
    val total_results: Int
)