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

    //renames
    override fun fetchPopularManga(page:Int): Observable<MangasPage> = throw Exception("Stub!")

    override fun fetchMangaDetails(manga: SManga): Observable<SManga> = throw Exception("Stub!")

    override fun fetchChapterList(manga: SManga): Observable<List<SChapter>> = throw Exception("Stub!")

    override fun fetchPageList(chapter: SChapter): Observable<List<Page>> = throw Exception("Stub!")

    override fun fetchSearchManga(page: Int, query: String, filters: FilterList): Observable<MangasPage> = throw Exception("Stub!")

    override fun fetchLatestUpdates(page: Int): Observable<MangasPage> = throw Exception("Stub!")

    //unused
    override fun imageUrlParse(response: Response) = throw Exception("Stub!")

    override fun popularMangaRequest(page: Int): Request = throw Exception("Stub!")

    override fun searchMangaParse(response: Response): MangasPage = throw Exception("Stub!")

    override fun searchMangaRequest(page: Int, query: String, filters: FilterList): Request = throw Exception("Stub!")

    override fun mangaDetailsParse(response: Response): SManga = throw Exception("Stub!")

    override fun pageListParse(response: Response): List<Page> = throw Exception("Stub!")

    override fun popularMangaParse(response: Response): MangasPage = throw Exception("Stub!")

    override fun chapterListParse(response: Response): List<SChapter> = throw Exception("Stub!")

    override fun latestUpdatesRequest(page: Int): Request = throw Exception("Stub!")

    override fun latestUpdatesParse(response: Response): MangasPage = throw Exception("Stub!")

}
