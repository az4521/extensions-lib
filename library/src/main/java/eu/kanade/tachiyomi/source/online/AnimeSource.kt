package eu.kanade.tachiyomi.source.online

import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.MangasPage
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import okhttp3.Request
import okhttp3.Response
import rx.Observable

/**
 * A source that will return anime instead of manga.
 * Chapters are episodes, pages are videos, page numbers are video quality
 * The rest works the same as a standard HttpSource
 */
interface AnimeSource {
}
