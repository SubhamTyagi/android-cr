package io.github.subhamtyagi.ocr.tasker

import com.joaomgcd.taskerpluginlibrary.output.TaskerOutputObject
import com.joaomgcd.taskerpluginlibrary.output.TaskerOutputVariable

@TaskerOutputObject()
class OCROutput(
    @get:TaskerOutputVariable(VAR_RESULT, labelResIdName = "result", htmlLabelResIdName = "result_description") var result: String?,
    @get:TaskerOutputVariable("coordinates", labelResIdName = "coordinates", htmlLabelResIdName = "coordinates_description") var coordinates: String
) {
    companion object {
        const val VAR_RESULT = "result"
    }
}