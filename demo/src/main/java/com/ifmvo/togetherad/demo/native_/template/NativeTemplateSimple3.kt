package com.ifmvo.togetherad.demo.native_.template

import com.ifmvo.togetherad.baidu.native_.view.NativeViewBaiduSimple3
import com.ifmvo.togetherad.core.custom.native_.BaseNativeTemplate
import com.ifmvo.togetherad.core.custom.native_.BaseNativeView
import com.ifmvo.togetherad.csj.native_.view.NativeViewCsjSimple3
import com.ifmvo.togetherad.demo.app.AdProviderType
import com.ifmvo.togetherad.gdt.native_.view.NativeViewGdtSimple3

/*
 * Created by Matthew Chen on 2020-04-21.
 */
class NativeTemplateSimple3(onDismiss: (providerType: String) -> Unit) : BaseNativeTemplate() {

    private var mOnDismiss: (providerType: String) -> Unit = onDismiss

    override fun getNativeView(adProviderType: String): BaseNativeView? {
        return when (adProviderType) {
            AdProviderType.GDT.type -> {
                NativeViewGdtSimple3(mOnDismiss)
            }
            AdProviderType.CSJ.type -> {
                NativeViewCsjSimple3(mOnDismiss)
            }
            AdProviderType.BAIDU.type -> {
                NativeViewBaiduSimple3(mOnDismiss)
            }
            else -> throw Exception("模板配置错误")
        }
    }
}