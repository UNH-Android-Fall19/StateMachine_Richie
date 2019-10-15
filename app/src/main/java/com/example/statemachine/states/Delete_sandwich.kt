package com.example.statemachine.states

import android.system.Os.remove
import com.example.statemachine.model.Sandwich
import com.example.statemachine.actions.Actions

class Delete_sandwich(private val sandwiches: List<Sandwich>):
    SandwichState {
    //    Todo()
    override fun consumeAction(action: Actions): SandwichState {
        return when (action) {
            is Actions.SandwichTypeSelected -> NameSandwich(sandwiches, action.type)
            is Actions.PredefinedSandwichSelected -> SandwichList(sandwiches + action.sandwich)
            else -> throw IllegalStateException("Invalid action $action passed to state $this")
        }
    }




}