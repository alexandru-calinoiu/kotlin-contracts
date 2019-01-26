import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@ExperimentalContracts
fun Int?.isValid(): Boolean {
    contract {
        returns(true)  implies (this@isValid != null)
    }

    return this != null && this != 0
}

class Main {
    fun getMyToken() : String? {
        return "something"
    }
}