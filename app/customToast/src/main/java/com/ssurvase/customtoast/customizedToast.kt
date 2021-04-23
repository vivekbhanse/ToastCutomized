package com.ssurvase.customtoast

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast

object customizedToast {

    fun showcustomToast(msg: String?, type: String, context: Context) {
        val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        val toastView =
            toast.view // This'll return the default View of the Toast.
        /* And now you can get the TextView of the default View of the Toast. */
        val toastMessage =
            toastView!!.findViewById<View>(android.R.id.message) as TextView
        //  toastView!!.setBackgroundResource(R.drawable.ic_code_scanner_auto_focus_off)
        toastMessage.textSize = 30f
        toastMessage.setPadding(20, 2, 20, 2)
        toastMessage.setTextColor(Color.WHITE)
        //  toastMessage.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_launcher_round, 0, 0, 0);
        toastMessage.gravity = Gravity.CENTER
        //   toastMessage.setCompoundDrawablePadding(16);
        if (type.contains("red")) {
            toastMessage.textSize = 30f
            toastMessage.setPadding(20, 2, 20, 2)
            toastView!!.setBackgroundColor(Color.RED)
        } else if (type.contains("green")) {
            toastMessage.textSize = 30f
            toastMessage.setPadding(20, 2, 20, 2)
            toastView!!.setBackgroundColor(Color.GREEN)
        } else if (type.contains("error")) {
            toastMessage.setCompoundDrawablesWithIntrinsicBounds(
                0,
                0,
                0,
                0
            )
            toastMessage.compoundDrawablePadding = 16
            toastView!!.setBackgroundColor(Color.RED)
        }
        toast.show()
    }

    fun showcustomToast_color_text(context: Context, msg: String?, color: Int, textsize: Int) {
        val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        val toastView =
            toast.view
        val toastMessage =
            toastView!!.findViewById<View>(android.R.id.message) as TextView

        toastMessage.gravity = Gravity.CENTER
        toastMessage.textSize = textsize.toFloat()
        toastMessage.setPadding(20, 2, 20, 2)
        toastView!!.setBackgroundColor(context.getResources().getColor(color))
        toast.show()
    }


    fun shapedToastWithIntrinsic(
        msg: String?,
        shape_drawable: Int,
        context: Context,
        DrawablesWithIntrinsicBounds: Int
    ) {
        val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        val toastView =
            toast.view
        val toastMessage =
            toastView!!.findViewById<View>(android.R.id.message) as TextView
        toastView!!.setBackgroundResource(shape_drawable)
        toastMessage.textSize = 30f
        toastMessage.setPadding(20, 2, 20, 2)
        toastMessage.setTextColor(Color.WHITE)
        toastMessage.setCompoundDrawablesWithIntrinsicBounds(DrawablesWithIntrinsicBounds, 0, 0, 0);
        toastMessage.gravity = Gravity.CENTER
        toastMessage.setCompoundDrawablePadding(16);
        toast.show()
    }

    fun shapedToast(msg: String?, shape_drawable: Int, context: Context) {
        val toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        val toastView =
            toast.view
        val toastMessage =
            toastView!!.findViewById<View>(android.R.id.message) as TextView
        toastView!!.setBackgroundResource(shape_drawable)
        toastMessage.textSize = 30f
        toastMessage.setPadding(20, 2, 20, 2)
        toastMessage.setTextColor(Color.WHITE)
        // toastMessage.setCompoundDrawablesWithIntrinsicBounds(DrawablesWithIntrinsicBounds, 0, 0, 0);
        toastMessage.gravity = Gravity.CENTER
        toastMessage.setCompoundDrawablePadding(16);
        toast.show()
    }

    fun centerdToast(msg: String?, context: Context) {
        val tt =
            Toast.makeText(context, msg, Toast.LENGTH_LONG)
        tt.setGravity(Gravity.CENTER, 0, 0)
        tt.show()
    }



}