package com.example.shop49k.ui.fragment.order

import com.example.shop49k.base.BasePresenter
import com.example.shop49k.network.PostApi
import com.example.shop49k.ui.fragment.offer.OfferView
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class OrderPresenter (postView: OrderView) : BasePresenter<OrderView>(postView) {
    @Inject
    lateinit var postApi: PostApi

    private var subscription: Disposable? = null

    override fun onViewDestroyed() {
        subscription?.dispose()
    }
}