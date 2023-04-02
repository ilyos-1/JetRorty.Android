package com.developersancho.locations.list.view

import androidx.compose.foundation.layout.*
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
import com.developersancho.framework.extension.orZero
import com.developersancho.jetframework.rememberFlowWithLifecycle
import com.developersancho.locations.list.LocationsState
import com.developersancho.locations.list.LocationsViewModel

@Composable
fun LocationContent(
    viewModel: LocationsViewModel = hiltViewModel(),
    paddingValues: PaddingValues,
    viewState: LocationsState,
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
                    LocationRow(
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