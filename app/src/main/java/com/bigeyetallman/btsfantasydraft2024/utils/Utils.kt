package com.bigeyetallman.btsfantasydraft2024.utils

import android.content.Context
import android.view.Window

class Utils {
    companion object {
        fun getCustomProgressDialog(
            context: Context?,
            progressText: String?
        ): CustomProgressDialog? {
            val customProgressDialog = CustomProgressDialog(
                context!!,
                progressText!!
            )
            customProgressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            return customProgressDialog
        }
    }
}