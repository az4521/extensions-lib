import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import rx.Observable

/**
 * A source that will return anime instead of manga.
 * Chapters are episodes, pages are videos, page numbers are video quality
 * The rest works the same as a standard HttpSource
 */
abstract class AnimeHttpSource : HttpSource() {

    abstract protected fun fetchPopularAnime(page:Int): Observable<MangasPage>

    abstract protected fun fetchLatestAnime(page: Int): Observable<MangasPage>

    abstract protected fun fetchAnimeDetails(anime: SManga): Observable<SManga>

    abstract protected fun fetchEpisodeList(anime: SManga): Observable<List<SChapter>>

    abstract protected fun fetchVideoList(chapter: SChapter): Observable<List<Page>>

    abstract protected fun fetchSearchAnime(page: Int, query: String, filters: FilterList): Observable<MangasPage>

}
