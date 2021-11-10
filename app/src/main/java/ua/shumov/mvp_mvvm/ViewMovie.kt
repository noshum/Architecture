package ua.shumov.mvp_mvvm

interface ViewMovie {
    fun showLoading()
    fun hideLoading()
    fun receiveDataMovie(movie: List<MovieModel>)
}