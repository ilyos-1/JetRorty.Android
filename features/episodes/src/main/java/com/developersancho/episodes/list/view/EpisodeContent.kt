package com.developersancho.episodes.list.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import com.developersancho.episodes.list.EpisodesState
import com.developersancho.episodes.list.EpisodesViewModel
import com.developersancho.framework.extension.orZero
import com.developersancho.jetframework.rememberFlowWithLifecycle

@Composable
fun EpisodeContent(
    viewModel: EpisodesViewModel = hiltViewModel(),
    paddingValues: PaddingValues,
    viewState: EpisodesState,
    selectItem: (Int) -> Unit = {}
) {
    val pagingItems = rememberFlowWithLifecycle(viewState.pagedData).collectAsLazyPagingItems()
    val refreshing = pagingItems.loadState.refresh == LoadState.Loading

    val pullRefreshState = rememberPullRefreshState(refreshing, { pagingItems.refresh() })

    Box(Modifier.pullRefresh(pullRefreshState)) {
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 4.dp),
        ) {
            items(pagingItems.itemCount) { index ->
                pagingItems[index]?.let {
                    EpisodeRow(
                        viewModel = viewModel,
                        dto = it,
                        onDetailClick = { selectItem.invoke(it.id.orZero()) }
                    )
                }
            }

            if (pagingItems.loadState.append == LoadState.Loading) {
                item {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(24.dp)
                    ) {
                        CircularProgressIndicator(Modifier.align(Alignment.Center))
                    }
                }
            }
        }

        PullRefreshIndicator(refreshing, pullRefreshState, Modifier.align(Alignment.TopCenter))
    }
}